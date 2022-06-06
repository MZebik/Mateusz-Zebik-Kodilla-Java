package Food2Door;

public class GlutenFreeShop implements Producer {

    @Override
    public void process(OrderCreator order) {
        String productName = order.getProduct().getProductName();
        System.out.println("Produkt o nazwie: " + productName + "zostanie wysłany od producenta GlutenFreeShop");
    }
}
