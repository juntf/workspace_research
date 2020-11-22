package DP08CommandPattern;

public class SellStock implements Order {

    private Stock orderStock;

    public SellStock(Stock orderStock) {
        this.orderStock = orderStock;
    }

    @Override
    public void execute() {
        orderStock.sell();
    }
}
