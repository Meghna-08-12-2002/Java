class Granite {
     String brand;
     String type;
     double thickness;
     double price;
     String color;
     int hardness;
     String application;
     boolean isPolished;
     int durability;
     String origin;
    
    public Granite() {
        this("Generic");
    }
    
    public Granite(String brand) {
        this(brand, "Natural");
    }
    
    public Granite(String brand, String type) {
        this(brand, type, 2.0);
    }
    
    public Granite(String brand, String type, double thickness) {
        this(brand, type, thickness, 2000);
    }
    
    public Granite(String brand, String type, double thickness, double price) {
        this(brand, type, thickness, price, "Gray");
    }
    
    public Granite(String brand, String type, double thickness, double price, String color) {
        this(brand, type, thickness, price, color, 7);
    }
    
    public Granite(String brand, String type, double thickness, double price, String color, int hardness) {
        this(brand, type, thickness, price, color, hardness, "Construction");
    }
    
    public Granite(String brand, String type, double thickness, double price, String color, int hardness, String application) {
        this(brand, type, thickness, price, color, hardness, application, true);
    }
    
    public Granite(String brand, String type, double thickness, double price, String color, int hardness, String application, boolean isPolished) {
        this(brand, type, thickness, price, color, hardness, application, isPolished, 50);
    }
    
    public Granite(String brand, String type, double thickness, double price, String color, int hardness, String application, boolean isPolished, int durability) {
        this(brand, type, thickness, price, color, hardness, application, isPolished, durability, "India");
    }
    
    public Granite(String brand, String type, double thickness, double price, String color, int hardness, String application, boolean isPolished, int durability, String origin) {
        this.brand = brand;
        this.type = type;
        this.thickness = thickness;
        this.price = price;
        this.color = color;
        this.hardness = hardness;
        this.application = application;
        this.isPolished = isPolished;
        this.durability = durability;
        this.origin = origin;
    }
    
    public void displayInfo() {
        System.out.println("Granite Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Thickness: " + thickness + " cm");
        System.out.println("Price: Rs. " + price);
        System.out.println("Color: " + color);
        System.out.println("Hardness: " + hardness + " Mohs");
        System.out.println("Application: " + application);
        System.out.println("Polished: " + isPolished);
        System.out.println("Durability: " + durability + " years");
        System.out.println("Origin: " + origin);
    }
}

