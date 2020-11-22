package DP08CommandPattern;

public class BuyStock implements Order {

    private Stock orderStock;

    public BuyStock(Stock orderStock) {
        this.orderStock = orderStock;
    }

    @Override
    public void execute() {
        orderStock.buy();
    }
}
