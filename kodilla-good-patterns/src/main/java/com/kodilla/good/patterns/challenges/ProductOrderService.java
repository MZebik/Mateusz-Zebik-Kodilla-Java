package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderCreator order;
    private StorageSystem storageSystem;
    private ListOfOrdersToExecute listOfOrdersToExecute;

    public ProductOrderService(final InformationService informationService,
                           final OrderCreator order,
                           final StorageSystem storageSystem) {
        this.informationService = informationService;
        this.order = order;
        this.storageSystem = storageSystem;
    }

    public OrderDTO process(final OrderCreator order) {
        boolean productIsAvailable = storageSystem.checkStock(order.getProduct());

        if (productIsAvailable) {
            informationService.sendOrderInformation(order.getUser(),order, "We get your order and proceed to execute!");
            listOfOrdersToExecute.addOrderToList(order);
            return new OrderDTO(order.getUser(), order, true);
        } else {
            informationService.sendOrderInformation(order.getUser(),order, "Sorry, product from your order is temporary unavailable :(");
            return new OrderDTO(order.getUser(), order, false);
        }
    }
}

