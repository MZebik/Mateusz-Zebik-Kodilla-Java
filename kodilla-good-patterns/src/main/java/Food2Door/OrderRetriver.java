package Food2Door;

public class OrderRetriver {
    ExtraFoodShop extraFoodShop = new ExtraFoodShop();
    private User user = new User("Jan Kowalski", "Józefa Rostafińskiego 11, 30-072 Kraków", "JKowalski@wp.pl");
    private Producer producer = extraFoodShop;
    private Product product = new Product("Onion", "JANUSZ S.A.");
    private double quantity = 1.0;

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}

