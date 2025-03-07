package main;

import models.Location;
import services.RoutePlanner;

public class DeliveryRouteApp {
    public static void main(String[] args) {
        Location deliveryAgent = new Location("DeliveryAgent", 12.9352, 77.6245);
        Location restaurant1 = new Location("Restaurant1", 12.9318, 77.6228);
        Location restaurant2 = new Location("Restaurant2", 12.9375, 77.6276);
        Location customer1 = new Location("Customer1", 12.9382, 77.6200);
        Location customer2 = new Location("Customer2", 12.9403, 77.6295);

        double preparationTimeRest1 = 10;
        double preparationTimeRest2 = 8;

        RoutePlanner.findBestRoute(deliveryAgent, restaurant1, restaurant2, customer1, customer2, preparationTimeRest1, preparationTimeRest2);
    }
}
