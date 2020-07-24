package example.marketData.operation;

import example.marketData.fileFormatHandle.MarketFileFormatHandler;
import example.marketData.model.Market;

import java.util.*;
import java.util.stream.Collectors;

public class MarketDataOperation {


    public List<Map<String, Integer>> getLargeNumberBrandNameOnStock() {
        List<Map<String, Integer>> productNameAndAmountList = new ArrayList<>();
        List<String> brandNames =
                MarketFileFormatHandler
                        .getMarketListObject()
                        .stream()
                        .map(Market::getMarka)
                        .distinct()
                        .collect(Collectors.toList());
        int count = 0;
        for (String brandName : brandNames) {
            for (Market product : MarketFileFormatHandler.getMarketListObject()) {
                if (brandName.equals(product.getMarka())) {
                    count++;
                }
            }
            Map<String, Integer> productNameAndAmount = new HashMap<>();
            productNameAndAmount.put(brandName, count);
            productNameAndAmountList.add(productNameAndAmount);
            count = 0;
        }

        productNameAndAmountList.sort((o1, o2) -> {
            Collection<Integer> values1 = o1.values();
            Collection<Integer> values2 = o2.values();
            if (!values1.isEmpty() && !values2.isEmpty()) {
                return values2.iterator().next().compareTo(values1.iterator().next());
            } else {
                return 0;
            }
        });
        return productNameAndAmountList.stream().limit(5).collect(Collectors.toList());

    }

    public List<Map<Market, String>> getHighProfitFirst5Products() {
        List<Map<Market, String>> productAndProfitList = new ArrayList<>();
        for (Market market : MarketFileFormatHandler.getMarketListObject()) {
            Double profit = market.getSatishQiymet() - market.getAlishQiymet();
            String strDouble = String.format("%.2f", profit);
            Map<Market, String> productAndProfit = new HashMap<>();
            productAndProfit.put(market, strDouble);
            productAndProfitList.add(productAndProfit);
        }
        productAndProfitList.sort((o1, o2) -> {
            Collection<String> values1 = o1.values();
            Collection<String> values2 = o2.values();
            if (!values1.isEmpty() && !values2.isEmpty()) {
                return values2.iterator().next().compareTo(values1.iterator().next());
            } else {
                return 0;
            }
        });
        return productAndProfitList.stream().limit(5).collect(Collectors.toList());
    }


    public List<Market> getProductsSoldInLargeAmount() {
        return MarketFileFormatHandler
                .getMarketListObject()
                .stream()
                .sorted(Comparator.comparingInt(Market::getSatish).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }

    public Integer averageSalesRate() {
        return (int) MarketFileFormatHandler
                .getMarketListObject()
                .stream()
                .mapToInt(Market::getSatish).average().orElse(0);
    }

    public Double sumOfSalesAmount() {
        return MarketFileFormatHandler
                .getMarketListObject()
                .stream()
                .mapToDouble(Market::getSatish).sum();
    }
}
