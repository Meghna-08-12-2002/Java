class Cement {
     String brand;
     String type;
     double weight;
     double price;
     String color;
     int strength;
     String application;
     boolean isWaterResistant;
     int settingTime;
     String grade;
    
    public Cement() {
        this("Generic");
    }
    
    public Cement(String brand) {
        this(brand, "OPC");
    }
    
    public Cement(String brand, String type) {
        this(brand, type, 50);
    }
    
    public Cement(String brand, String type, double weight) {
        this(brand, type, weight, 300);
    }
    
    public Cement(String brand, String type, double weight, double price) {
        this(brand, type, weight, price, "Gray");
    }
    
    public Cement(String brand, String type, double weight, double price, String color) {
        this(brand, type, weight, price, color, 40);
    }
    
    public Cement(String brand, String type, double weight, double price, String color, int strength) {
        this(brand, type, weight, price, color, strength, "Construction");
    }
    
    public Cement(String brand, String type, double weight, double price, String color, int strength, String application) {
        this(brand, type, weight, price, color, strength, application, false);
    }
    
    public Cement(String brand, String type, double weight, double price, String color, int strength, String application, boolean isWaterResistant) {
        this(brand, type, weight, price, color, strength, application, isWaterResistant, 30);
    }
    
    public Cement(String brand, String type, double weight, double price, String color, int strength, String application, boolean isWaterResistant, int settingTime) {
        this(brand, type, weight, price, color, strength, application, isWaterResistant, settingTime, "Grade 43");
    }
    
    public Cement(String brand, String type, double weight, double price, String color, int strength, String application, boolean isWaterResistant, int settingTime, String grade) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.strength = strength;
        this.application = application;
        this.isWaterResistant = isWaterResistant;
        this.settingTime = settingTime;
        this.grade = grade;
    }
    
    public void displayInfo() {
        System.out.println("Cement Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Price: Rs. " + price);
        System.out.println("Color: " + color);
        System.out.println("Strength: " + strength + " MPa");
        System.out.println("Application: " + application);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Setting Time: " + settingTime + " minutes");
        System.out.println("Grade: " + grade);
    }
}

