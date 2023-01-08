package service;

import model.Market;
import model.User;

public class MarketService {
    public Market[] marketList;
    int index = 0;
    public MarketService(int size) {
        this.marketList = new Market[size];
    }

    public boolean addMarket(Market market){

        for (Market m: marketList) {
            if(m.username.equals(market.username)){
                return false;
            }
        }
        marketList[index++] = market;
        return true;
    }

    public boolean login(String phoneNumber, String passwrod){
        for (Market market: marketList) {
            if(market.username.equals(phoneNumber) && market.password.equals(passwrod)){
                return true;
            }
        }
        return false;
    }
}