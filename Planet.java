class Planet {
    String name;
    double mass;
    double radius;
    double gravity;
    int numberOfMoons;
    boolean hasRings;
    boolean isHabitable;
    double distanceFromSun;
    String type;
    boolean hasAtmosphere;
    String dominantElement;
    float orbitalPeriod;
    int discoveryYear;
    int temperature;
    boolean supportsLife;
    String galaxy;

    public Planet(String name, double mass, double radius, double gravity, int numberOfMoons, boolean hasRings, 
                  boolean isHabitable, double distanceFromSun, String type, boolean hasAtmosphere, 
                  String dominantElement, float orbitalPeriod, int discoveryYear, int temperature, 
                  boolean supportsLife, String galaxy) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.gravity = gravity;
        this.numberOfMoons = numberOfMoons;
        this.hasRings = hasRings;
        this.isHabitable = isHabitable;
        this.distanceFromSun = distanceFromSun;
        this.type = type;
        this.hasAtmosphere = hasAtmosphere;
        this.dominantElement = dominantElement;
        this.orbitalPeriod = orbitalPeriod;
        this.discoveryYear = discoveryYear;
        this.temperature = temperature;
        this.supportsLife = supportsLife;
        this.galaxy = galaxy;
    }
}

