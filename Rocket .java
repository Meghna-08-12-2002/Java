class Rocket {
    String name;
    double height;
    double weight;
    double thrust;
    int stages;
    boolean reusable;
    String fuelType;
    double maxSpeed;
    int crewCapacity;
    boolean hasAIControl;
    String manufacturer;
    float launchSuccessRate;
    int firstLaunchYear;
    int missionsCompleted;
    boolean usedForCargo;
    String countryOfOrigin;

    public Rocket(String name, double height, double weight, double thrust, int stages, boolean reusable, 
                  String fuelType, double maxSpeed, int crewCapacity, boolean hasAIControl, 
                  String manufacturer, float launchSuccessRate, int firstLaunchYear, int missionsCompleted, 
                  boolean usedForCargo, String countryOfOrigin) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.thrust = thrust;
        this.stages = stages;
        this.reusable = reusable;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.crewCapacity = crewCapacity;
        this.hasAIControl = hasAIControl;
        this.manufacturer = manufacturer;
        this.launchSuccessRate = launchSuccessRate;
        this.firstLaunchYear = firstLaunchYear;
        this.missionsCompleted = missionsCompleted;
        this.usedForCargo = usedForCargo;
        this.countryOfOrigin = countryOfOrigin;
    }
}