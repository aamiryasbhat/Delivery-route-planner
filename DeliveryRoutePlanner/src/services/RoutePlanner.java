package services;

import models.Location;
import java.util.HashMap;
import java.util.Map;

public class RoutePlanner {

    public static Map<String, Double> precomputeTravelTimes(Location... locations) {
        Map<String, Double> travelTimes = new HashMap<>();

        for (int i = 0; i < locations.length; i++) {
            for (int j = i + 1; j < locations.length; j++) {
                String key1 = locations[i].getName() + "->" + locations[j].getName();
                String key2 = locations[j].getName() + "->" + locations[i].getName();
                double time = DistanceCalculator.calculateTravelTime(locations[i], locations[j]);

                travelTimes.put(key1, time);
                travelTimes.put(key2, time);
            }
        }
        return travelTimes;
    }

    public static void findBestRoute(Location aman, Location r1, Location r2, Location c1, Location c2, double pt1, double pt2) {
        Map<String, Double> travelTimes = precomputeTravelTimes(aman, r1, r2, c1, c2);

        double delivToR1 = travelTimes.get("DeliveryAgent->Restaurant1");
        double delivToR2 = travelTimes.get("DeliveryAgent->Restaurant2");
        double r1ToR2 = travelTimes.get("Restaurant1->Restaurant2");
        double r1ToC1 = travelTimes.get("Restaurant1->Customer1");
        double r2ToC2 = travelTimes.get("Restaurant2->Customer2");
        double c1ToC2 = travelTimes.get("Customer1->Customer2");

        boolean visitR1First = (delivToR1 + pt1) <= (delivToR2 + pt2);

        double totalTime;
        String bestRoute;

        if (visitR1First) {
            double waitTimeR2 = Math.max(delivToR1 + pt1, delivToR2 + r1ToR2 + pt2);
            totalTime = waitTimeR2 + r2ToC2 + c1ToC2;
            bestRoute = "DeliveryAgent → Restaurant1 → Restaurant2 → Customer1 → Customer2";
        } else {
            double waitTimeR1 = Math.max(delivToR2 + pt2, delivToR1 + r1ToR2 + pt1);
            totalTime = waitTimeR1 + r1ToC1 + c1ToC2;
            bestRoute = "DeliveryAgent → Restaurant2 → Restaurant1 → Customer2 → Customer1";
        }

        System.out.println("Best Route: " + bestRoute);
        System.out.printf("Total Estimated Time: %.2f minutes\n", totalTime);
    }
}
