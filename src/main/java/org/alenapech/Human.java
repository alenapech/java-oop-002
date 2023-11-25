package org.alenapech;

public class Human extends Actor {

    public Human(String name) {
        super(name);
    }

    @Override
    String getName() {
        return super.name;
    }

    @Override
    public void setMakeOrder(boolean value) {
        isMakeOrder = value;
    }

    @Override
    public void setTakeOrder(boolean value) {
        isTakeOrder = value;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }
}
