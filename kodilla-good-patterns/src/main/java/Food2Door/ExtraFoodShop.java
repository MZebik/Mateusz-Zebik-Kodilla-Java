package Food2Door;

public class ExtraFoodShop implements Producer {

    @Override
    public void process(OrderCreator order) {
        System.out.println("Przekazano zamówienie do realizacji!");
    }
}
