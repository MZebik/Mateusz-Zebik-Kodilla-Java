package Food2Door;

public class Product {
    private String productName;
    private String categoty;

    public Product(String productName, String categoty) {
        this.productName = productName;
        this.categoty = categoty;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategoty() {
        return categoty;
    }

}
