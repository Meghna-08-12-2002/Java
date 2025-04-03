class Bulb {
    String type;
    int wattage;
    String color;
    int lifespan;
    boolean isDimmable;
    String shape;
    String baseType;
    String voltage;
    int lumens;
    String brand;
    
    public Bulb() {
        this("LED");
    }
    
    public Bulb(String type) {
        this(type, 9);
    }
    
    public Bulb(String type, int wattage) {
        this(type, wattage, "Warm White");
    }
    
    public Bulb(String type, int wattage, String color) {
        this(type, wattage, color, 25000);
    }
    
    public Bulb(String type, int wattage, String color, int lifespan) {
        this(type, wattage, color, lifespan, true);
    }
    
    public Bulb(String type, int wattage, String color, int lifespan, boolean isDimmable) {
        this(type, wattage, color, lifespan, isDimmable, "A19");
    }
    
    public Bulb(String type, int wattage, String color, int lifespan, boolean isDimmable, String shape) {
        this(type, wattage, color, lifespan, isDimmable, shape, "E26");
    }
    
    public Bulb(String type, int wattage, String color, int lifespan, boolean isDimmable, String shape, String baseType) {
        this(type, wattage, color, lifespan, isDimmable, shape, baseType, "120V");
    }
    
    public Bulb(String type, int wattage, String color, int lifespan, boolean isDimmable, String shape, String baseType, String voltage) {
        this(type, wattage, color, lifespan, isDimmable, shape, baseType, voltage, 800);
    }
    
    public Bulb(String type, int wattage, String color, int lifespan, boolean isDimmable, String shape, String baseType, String voltage, int lumens) {
        this(type, wattage, color, lifespan, isDimmable, shape, baseType, voltage, lumens, "Philips");
    }
    
    public Bulb(String type, int wattage, String color, int lifespan, boolean isDimmable, String shape, String baseType, String voltage, int lumens, String brand) {
        this.type = type;
        this.wattage = wattage;
        this.color = color;
        this.lifespan = lifespan;
        this.isDimmable = isDimmable;
        this.shape = shape;
        this.baseType = baseType;
        this.voltage = voltage;
        this.lumens = lumens;
        this.brand = brand;
    }
    
    public void displayInfo() {
        System.out.println("Bulb Details:");
        System.out.println("Type: " + type);
        System.out.println("Wattage: " + wattage);
        System.out.println("Color: " + color);
        System.out.println("Lifespan: " + lifespan + " hours");
        System.out.println("Dimmable: " + isDimmable);
        System.out.println("Shape: " + shape);
        System.out.println("Base Type: " + baseType);
        System.out.println("Voltage: " + voltage);
        System.out.println("Lumens: " + lumens);
        System.out.println("Brand: " + brand);
    }
}


