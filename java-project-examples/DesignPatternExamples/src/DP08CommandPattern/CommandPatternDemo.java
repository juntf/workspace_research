package DP08CommandPattern;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock someStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(someStock);
        SellStock sellStockOrder = new SellStock(someStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
