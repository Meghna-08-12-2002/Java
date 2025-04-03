class Tab {
    String brand;
    String model;
    String processor;
    String os;
    String color;

    int ram;
    int storage;
    int battery;
    int price;
    int warranty;
    int releaseYear;

    boolean isCellular;
    boolean hasStylus;
    boolean hasFingerprint;
    boolean hasFaceUnlock;
    boolean hasExpandableStorage;

    double weight;
    double screenSize;
    double resolution;

    char qualityGrade;
    char durabilityGrade;

    public Tab(String brand, String model, String processor, String os, String color,
               int ram, int storage, int battery, int price, int warranty, int releaseYear,
               boolean isCellular, boolean hasStylus, boolean hasFingerprint, boolean hasFaceUnlock, boolean hasExpandableStorage,
               double weight, double screenSize, double resolution, char qualityGrade, char durabilityGrade) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.os = os;
        this.color = color;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
        this.price = price;
        this.warranty = warranty;
        this.releaseYear = releaseYear;
        this.isCellular = isCellular;
        this.hasStylus = hasStylus;
        this.hasFingerprint = hasFingerprint;
        this.hasFaceUnlock = hasFaceUnlock;
        this.hasExpandableStorage = hasExpandableStorage;
        this.weight = weight;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.qualityGrade = qualityGrade;
        this.durabilityGrade = durabilityGrade;
    }
}
