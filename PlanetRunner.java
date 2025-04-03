class PlanetRunner {
    public static void main(String[] args) {
        Planet planet1 = new Planet("Earth", 5.972e24, 6371, 9.8, 1, false, true, 1.496e8, 
                "Terrestrial", true, "Oxygen", 365.25f, 0, 15, true, "Milky Way");

        Planet planet2 = new Planet("Mars", 6.39e23, 3389, 3.7, 2, false, false, 2.279e8, 
                "Terrestrial", true, "Carbon Dioxide", 687f, 1659, -63, false, "Milky Way");

        Planet planet3 = new Planet("Jupiter", 1.898e27, 69911, 24.8, 79, true, false, 7.785e8, 
                "Gas Giant", true, "Hydrogen", 4332.59f, 1610, -145, false, "Milky Way");

        System.out.println("Planet Details:");
        displayPlanetDetails(planet1);

        System.out.println("Updated Planet Details");
        displayPlanetDetails(planet2);

        System.out.println("Planet Details");
        displayPlanetDetails(planet3);
    }

    public static void displayPlanetDetails(Planet planet) {
        System.out.println("Name: " + planet.name);
        System.out.println("Mass: " + planet.mass + " kg");
        System.out.println("Radius: " + planet.radius + " km");
        System.out.println("Gravity: " + planet.gravity + " m/s²");
        System.out.println("Number of Moons: " + planet.numberOfMoons);
        System.out.println("Has Rings: " + planet.hasRings);
        System.out.println("Habitable: " + planet.isHabitable);
        System.out.println("Distance from Sun: " + planet.distanceFromSun + " km");
        System.out.println("Type: " + planet.type);
        System.out.println("Has Atmosphere: " + planet.hasAtmosphere);
        System.out.println("Dominant Element: " + planet.dominantElement);
        System.out.println("Orbital Period: " + planet.orbitalPeriod + " days");
        System.out.println("Discovery Year: " + planet.discoveryYear);
        System.out.println("Temperature: " + planet.temperature + " °C");
        System.out.println("Supports Life: " + planet.supportsLife);
        System.out.println("Galaxy: " + planet.galaxy);
    }
}
