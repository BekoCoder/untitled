package model;

import java.util.UUID;

public class Order {
    public UUID productId;
    public  UUID userId;
    public double orderQuantity;

    public Order() {

    }

    public Order(UUID productId, UUID userId, double orderQuantity) {
        this.productId = productId;
        this.userId = userId;
        this.orderQuantity = orderQuantity;
    }
}
