class Cab1 {
    String model;
    String brand;
    String fuelType;
    String color;
    int seatingCapacity;
    double mileage;
    boolean hasAirConditioning;
    boolean hasGPS;
    boolean hasSunroof;
    double price;
    int manufacturingYear;
    String transmissionType;
    String registrationNumber;
    boolean isElectric;
    int warrantyPeriod;
    String ownerName;
    float rating;
    String insuranceProvider;
    boolean hasMusicSystem;
    int serviceInterval;

    public Cab1(String model, String brand, String fuelType, String color, int seatingCapacity, double mileage,
               boolean hasAirConditioning, boolean hasGPS, boolean hasSunroof, double price, int manufacturingYear,
               String transmissionType, String registrationNumber, boolean isElectric, int warrantyPeriod,
               String ownerName, float rating, String insuranceProvider, boolean hasMusicSystem, int serviceInterval) {
        this.model = model;
        this.brand = brand;
        this.fuelType = fuelType;
        this.color = color;
        this.seatingCapacity = seatingCapacity;
        this.mileage = mileage;
        this.hasAirConditioning = hasAirConditioning;
        this.hasGPS = hasGPS;
        this.hasSunroof = hasSunroof;
        this.price = price;
        this.manufacturingYear = manufacturingYear;
        this.transmissionType = transmissionType;
        this.registrationNumber = registrationNumber;
        this.isElectric = isElectric;
        this.warrantyPeriod = warrantyPeriod;
        this.ownerName = ownerName;
        this.rating = rating;
        this.insuranceProvider = insuranceProvider;
        this.hasMusicSystem = hasMusicSystem;
        this.serviceInterval = serviceInterval;
    }
}

