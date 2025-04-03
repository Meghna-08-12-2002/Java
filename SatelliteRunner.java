class SatelliteRunner {
    public static void main(String[] args) {
        Satellite satellite1 = new Satellite("Hubble", "USA", 11110.0, 2500.0, false, true,
                540, "Space Shuttle", 30, true, true, "Low Earth Orbit", 4.9f, 1990, "Astronomy", true, false);

        Satellite satellite2 = new Satellite("GPS IIR", "USA", 2000.0, 500.0, true, true,
                20200, "Delta II", 15, true, true, "Medium Earth Orbit", 4.8f, 2005, "Navigation", false, true);

        Satellite satellite3 = new Satellite("INSAT-3D", "India", 2060.0, 800.0, true, true,
                35786, "Ariane 5", 12, true, true, "Geostationary Orbit", 4.7f, 2013, "Weather Monitoring", false, false);

        System.out.println("Satellite Details:");
        displaySatelliteDetails(satellite1);

        System.out.println("Updated Satellite Details");
        displaySatelliteDetails(satellite2);

        System.out.println("Satellite Details");
        displaySatelliteDetails(satellite3);
    }

    public static void displaySatelliteDetails(Satellite satellite) {
        System.out.println("Name: " + satellite.name);
        System.out.println("Country: " + satellite.country);
        System.out.println("Weight: " + satellite.weight + " kg");
        System.out.println("Launch Cost: $" + satellite.launchCost + " million");
        System.out.println("Is Geo-Stationary: " + satellite.isGeoStationary);
        System.out.println("Is Operational: " + satellite.isOperational);
        System.out.println("Orbit Altitude: " + satellite.orbitAltitude + " km");
        System.out.println("Launch Vehicle: " + satellite.launchVehicle);
        System.out.println("Life Span: " + satellite.lifeSpan + " years");
        System.out.println("Has Solar Panels: " + satellite.hasSolarPanels);
        System.out.println("Has Communication Payload: " + satellite.hasCommunicationPayload);
        System.out.println("Orbit Type: " + satellite.orbitType);
        System.out.println("Signal Strength: " + satellite.signalStrength);
        System.out.println("Launch Year: " + satellite.launchYear);
        System.out.println("Primary Mission: " + satellite.primaryMission);
        System.out.println("Has Scientific Instruments: " + satellite.hasScientificInstruments);
        System.out.println("Is Military: " + satellite.isMilitary);
    }
}
