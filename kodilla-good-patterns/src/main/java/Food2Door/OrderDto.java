package Food2Door;

public class OrderDto {
    private Producer producer;
    private double quantity;
    private Product product;

    public OrderDto(Producer producer, double quantity, Product product) {
        this.producer = producer;
        this.quantity = quantity;
        this.product = product;
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
