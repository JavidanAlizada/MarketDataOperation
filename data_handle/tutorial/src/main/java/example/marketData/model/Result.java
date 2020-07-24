package example.marketData.model;

import java.util.Map;

public class Result {

    private Map<String, Integer> highNumberOfBrandNameOnStock;
    private Map<Market, String> highProfitableProduct;
    private Market productSoldInLargeAmount;
    private Integer averageSalesRate;
    private Double sumOfSalesAmount;

    public Result() {

    }

    public Map<String, Integer> getHighNumberOfBrandNameOnStock() {
        return highNumberOfBrandNameOnStock;
    }

    public void setHighNumberOfBrandNameOnStock(Map<String, Integer> highNumberOfBrandNameOnStock) {
        this.highNumberOfBrandNameOnStock = highNumberOfBrandNameOnStock;
    }

    public Map<Market, String> getHighProfitableProduct() {
        return highProfitableProduct;
    }

    public void setHighProfitableProduct(Map<Market, String> highProfitableProduct) {
        this.highProfitableProduct = highProfitableProduct;
    }

    public Market getProductSoldInLargeAmount() {
        return productSoldInLargeAmount;
    }

    public void setProductSoldInLargeAmount(Market productSoldInLargeAmount) {
        this.productSoldInLargeAmount = productSoldInLargeAmount;
    }

    public Integer getAverageSalesRate() {
        return averageSalesRate;
    }

    public void setAverageSalesRate(Integer averageSalesRate) {
        this.averageSalesRate = averageSalesRate;
    }

    public Double getSumOfSalesAmount() {
        return sumOfSalesAmount;
    }

    public void setSumOfSalesAmount(Double sumOfSalesAmount) {
        this.sumOfSalesAmount = sumOfSalesAmount;
    }

    @Override
    public String toString() {
        return "Result{" +
                "\n highNumberOfBrandNameOnStock=" + highNumberOfBrandNameOnStock +
                ",\n highProfitableProduct=" + highProfitableProduct +
                ",\n productSoldInLargeAmount=" + productSoldInLargeAmount +
                ",\n averageSalesRate=" + averageSalesRate +
                ",\n sumOfSalesAmount=" + sumOfSalesAmount +
                '}';
    }
}
