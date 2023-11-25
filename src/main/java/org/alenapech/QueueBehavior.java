package org.alenapech;

public interface QueueBehavior {

    void takeInQueue(Actor actor);

    void makeOrders();

    void takeOrders();

    void releaseFromQueue();

}
