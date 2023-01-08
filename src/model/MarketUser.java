package model;

import java.util.UUID;

public class MarketUser {
    public UUID userId;
    public UUID marketId;
    public double debtAmount;

    public MarketUser(){

    }

    public MarketUser(UUID userId, UUID marketId, double debtAmount) {
        this.userId = userId;
        this.marketId = marketId;
        this.debtAmount = debtAmount;
    }
}
