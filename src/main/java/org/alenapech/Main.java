package org.alenapech;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor human1 = new Human("human1");
        Actor human2 = new Human("human2");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}