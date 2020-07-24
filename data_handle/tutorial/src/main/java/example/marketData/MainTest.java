package example.marketData;

import example.marketData.model.Result;
import example.marketData.operation.MarketDataOperation;

public class MainTest {

    public static void main(String[] args) {
        MarketDataOperation operation = new MarketDataOperation();

        Result result = new Result();

        result.setHighNumberOfBrandNameOnStock(operation.getLargeNumberBrandNameOnStock().get(0));

        result.setHighProfitableProduct(operation.getHighProfitFirst5Products().get(0));

        result.setProductSoldInLargeAmount(operation.getProductsSoldInLargeAmount().get(0));

        result.setAverageSalesRate(operation.averageSalesRate());

        result.setSumOfSalesAmount(operation.sumOfSalesAmount());

        System.out.println(result);

    }
}
