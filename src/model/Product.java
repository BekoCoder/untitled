package model;

import java.util.UUID;

public class Product {
    public UUID id;
    public String name;
    public double balance;
    public int quantity;
    public UUID marketId;


    public Product(){
    this.id=UUID.randomUUID();
    }

    public Product(String name, double balance, int quantity) {
        this();
        this.name = name;
        this.balance = balance;
        this.quantity = quantity;
    }

    public Product(String name, double balance, int quantity, UUID marketId) {
        this();
        this.name = name;
        this.balance = balance;
        this.quantity = quantity;
        this.marketId = marketId;
    }
}
