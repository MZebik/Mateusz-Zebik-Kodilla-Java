package Food2Door;

public class Aplication {
    public static void main(String[] args) {
        OrderRetriver orderRetriver = new OrderRetriver();
        OrderCreator order = new OrderCreator(orderRetriver.getUser(), orderRetriver.getProducer(), orderRetriver.getProduct(), orderRetriver.getQuantity());
        ProductOrderService productOrderService = new ProductOrderService(order, new MailService(), new OrderExecuteValidator());
        order.getProducer().process(order);
        productOrderService.process(order);
    }
}
