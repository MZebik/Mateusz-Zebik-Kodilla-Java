package Food2Door;

public class ProductOrderService {
    private final OrderCreator order;
    private OrderInformationService orderInformationService;
    private OrderExecuteValidator orderExecuteValidator;

    public ProductOrderService(OrderCreator order, OrderInformationService orderInformationService, OrderExecuteValidator orderExecuteValidator) {
        this.order = order;
        this.orderInformationService = orderInformationService;
        this.orderExecuteValidator = orderExecuteValidator;
    }

    public OrderDto process(OrderCreator order){
        boolean orderIsExecuted = orderExecuteValidator.Validate(order);

        if(orderIsExecuted){
        orderInformationService.inform(order.getUser(),order);
        System.out.println("Zamówienie zrealizowane!");
        return new OrderDto(order.getProducer(), order.getQuantity(), order.getProduct());
        } else {
            System.out.println("Trwa realizacja zamówienia");
            return new OrderDto(order.getProducer(), order.getQuantity(), order.getProduct());
        }
    }
}
