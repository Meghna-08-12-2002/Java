class RocketRunner {
    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("Falcon 9", 70, 549054, 7607, 2, true, 
                "RP-1/LOX", 25000, 7, true, "SpaceX", 0.98f, 2010, 150, true, "USA");

        Rocket rocket2 = new Rocket("Saturn V", 110.6, 2970000, 35000, 3, false, 
                "LH2/LOX", 11000, 3, false, "NASA", 0.94f, 1967, 13, true, "USA");

        Rocket rocket3 = new Rocket("Soyuz", 49.5, 305000, 1020, 3, false, 
                "Kerosene/LOX", 28000, 3, false, "Roscosmos", 0.97f, 1966, 1800, true, "Russia");

        System.out.println("Rocket Details:");
        displayRocketDetails(rocket1);

        System.out.println("Updated Rocket Details");
        displayRocketDetails(rocket2);

        System.out.println("Rocket Details");
        displayRocketDetails(rocket3);
    }

    public static void displayRocketDetails(Rocket rocket) {
        System.out.println("Name: " + rocket.name);
        System.out.println("Height: " + rocket.height + " m");
        System.out.println("Weight: " + rocket.weight + " kg");
        System.out.println("Thrust: " + rocket.thrust + " kN");
        System.out.println("Stages: " + rocket.stages);
        System.out.println("Reusable: " + rocket.reusable);
        System.out.println("Fuel Type: " + rocket.fuelType);
        System.out.println("Max Speed: " + rocket.maxSpeed + " km/h");
        System.out.println("Crew Capacity: " + rocket.crewCapacity);
        System.out.println("Has AI Control: " + rocket.hasAIControl);
        System.out.println("Manufacturer: " + rocket.manufacturer);
        System.out.println("Launch Success Rate: " + rocket.launchSuccessRate);
        System.out.println("First Launch Year: " + rocket.firstLaunchYear);
        System.out.println("Missions Completed: " + rocket.missionsCompleted);
        System.out.println("Used for Cargo: " + rocket.usedForCargo);
        System.out.println("Country of Origin: " + rocket.countryOfOrigin);
    }
}
