class Satellite {
    String name;
    String country;
    double weight;
    double launchCost;
    boolean isGeoStationary;
    boolean isOperational;
    int orbitAltitude;
    String launchVehicle;
    int lifeSpan;
    boolean hasSolarPanels;
    boolean hasCommunicationPayload;
    String orbitType;
    float signalStrength;
    int launchYear;
    String primaryMission;
    boolean hasScientificInstruments;
    boolean isMilitary;

    public Satellite(String name, String country, double weight, double launchCost, boolean isGeoStationary, boolean isOperational,
                     int orbitAltitude, String launchVehicle, int lifeSpan, boolean hasSolarPanels, boolean hasCommunicationPayload,
                     String orbitType, float signalStrength, int launchYear, String primaryMission,
                     boolean hasScientificInstruments, boolean isMilitary) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.launchCost = launchCost;
        this.isGeoStationary = isGeoStationary;
        this.isOperational = isOperational;
        this.orbitAltitude = orbitAltitude;
        this.launchVehicle = launchVehicle;
        this.lifeSpan = lifeSpan;
        this.hasSolarPanels = hasSolarPanels;
        this.hasCommunicationPayload = hasCommunicationPayload;
        this.orbitType = orbitType;
        this.signalStrength = signalStrength;
        this.launchYear = launchYear;
        this.primaryMission = primaryMission;
        this.hasScientificInstruments = hasScientificInstruments;
        this.isMilitary = isMilitary;
    }
}

