package Food2Door;

public class OrderCreator {
    private User user;
    private Producer producer;
    private Product product;
    private double quantity;

    public OrderCreator(User user, Producer producer, Product product, double quantity) {
        this.user = user;
        this.producer = producer;
        this.product = product;
        this.quantity = quantity;
    }

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
