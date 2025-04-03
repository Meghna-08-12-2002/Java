class DroneRunner {
    public static void main(String[] args) {
        Drone drone1 = new Drone("DJI Phantom 4", 1.38, 72, 30, 5870, true, 
                "Remote Control", 7, 6000, true, "DJI", 4.8f, 2016, 500, true, "China");

        Drone drone2 = new Drone("Parrot Anafi", 0.32, 55, 25, 2700, true, 
                "App Control", 4, 4500, true, "Parrot", 4.5f, 2018, 300, false, "France");

        Drone drone3 = new Drone("MQ-9 Reaper", 2223, 482, 27, 0, true, 
                "Autonomous", 1850, 15000, true, "General Atomics", 4.9f, 2001, 1000, true, "USA");

        System.out.println("Drone Details:");
        displayDroneDetails(drone1);

        System.out.println("Updated Drone Details");
        displayDroneDetails(drone2);

        System.out.println("Drone Details");
        displayDroneDetails(drone3);
    }

    public static void displayDroneDetails(Drone drone) {
        System.out.println("Model: " + drone.model);
        System.out.println("Weight: " + drone.weight + " kg");
        System.out.println("Max Speed: " + drone.maxSpeed + " km/h");
        System.out.println("Flight Time: " + drone.flightTime + " min");
        System.out.println("Battery Capacity: " + drone.batteryCapacity + " mAh");
        System.out.println("Has Camera: " + drone.hasCamera);
        System.out.println("Control Type: " + drone.controlType);
        System.out.println("Range: " + drone.range + " km");
        System.out.println("Max Altitude: " + drone.maxAltitude + " m");
        System.out.println("Has GPS: " + drone.hasGPS);
        System.out.println("Manufacturer: " + drone.manufacturer);
        System.out.println("Stability Rating: " + drone.stabilityRating);
        System.out.println("Production Year: " + drone.productionYear);
        System.out.println("Missions Completed: " + drone.missionsCompleted);
        System.out.println("Used for Surveillance: " + drone.usedForSurveillance);
        System.out.println("Country of Origin: " + drone.countryOfOrigin);
    }
}
