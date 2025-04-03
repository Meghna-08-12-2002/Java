class Drone {
    String model;
    double weight;
    double maxSpeed;
    double flightTime;
    int batteryCapacity;
    boolean hasCamera;
    String controlType;
    double range;
    int maxAltitude;
    boolean hasGPS;
    String manufacturer;
    float stabilityRating;
    int productionYear;
    int missionsCompleted;
    boolean usedForSurveillance;
    String countryOfOrigin;

    public Drone(String model, double weight, double maxSpeed, double flightTime, int batteryCapacity, boolean hasCamera, 
                 String controlType, double range, int maxAltitude, boolean hasGPS, 
                 String manufacturer, float stabilityRating, int productionYear, int missionsCompleted, 
                 boolean usedForSurveillance, String countryOfOrigin) {
        this.model = model;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.flightTime = flightTime;
        this.batteryCapacity = batteryCapacity;
        this.hasCamera = hasCamera;
        this.controlType = controlType;
        this.range = range;
        this.maxAltitude = maxAltitude;
        this.hasGPS = hasGPS;
        this.manufacturer = manufacturer;
        this.stabilityRating = stabilityRating;
        this.productionYear = productionYear;
        this.missionsCompleted = missionsCompleted;
        this.usedForSurveillance = usedForSurveillance;
        this.countryOfOrigin = countryOfOrigin;
    }
}

