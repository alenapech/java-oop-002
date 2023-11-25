package org.alenapech;

public interface ActorBehavior {

    void setMakeOrder(boolean value);

    void setTakeOrder(boolean value);

    boolean isTakeOrder();

    boolean isMakeOrder();

}
