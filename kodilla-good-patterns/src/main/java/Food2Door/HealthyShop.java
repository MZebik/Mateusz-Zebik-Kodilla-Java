package Food2Door;

public class HealthyShop implements Producer {
    @Override
    public void process(OrderCreator order) {
        String userName = order.getUser().getName();
        System.out.println("Zamówienie użytkownika: " + userName + "przekazane do realizacji przez HealthyShop");
    }
}
