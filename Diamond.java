class Diamond {
     String brand;
     String type;
     double carat;
     double price;
     String color;
     int clarity;
     String cut;
     boolean isCertified;
     int hardness;
     String origin;
    
    public Diamond() {
        this("Generic");
    }
    
    public Diamond(String brand) {
        this(brand, "Natural");
    }
    
    public Diamond(String brand, String type) {
        this(brand, type, 1.0);
    }
    
    public Diamond(String brand, String type, double carat) {
        this(brand, type, carat, 5000);
    }
    
    public Diamond(String brand, String type, double carat, double price) {
        this(brand, type, carat, price, "Colorless");
    }
    
    public Diamond(String brand, String type, double carat, double price, String color) {
        this(brand, type, carat, price, color, 10);
    }
    
    public Diamond(String brand, String type, double carat, double price, String color, int clarity) {
        this(brand, type, carat, price, color, clarity, "Round");
    }
    
    public Diamond(String brand, String type, double carat, double price, String color, int clarity, String cut) {
        this(brand, type, carat, price, color, clarity, cut, true);
    }
    
    public Diamond(String brand, String type, double carat, double price, String color, int clarity, String cut, boolean isCertified) {
        this(brand, type, carat, price, color, clarity, cut, isCertified, 10);
    }
    
    public Diamond(String brand, String type, double carat, double price, String color, int clarity, String cut, boolean isCertified, int hardness) {
        this(brand, type, carat, price, color, clarity, cut, isCertified, hardness, "Africa");
    }
    
    public Diamond(String brand, String type, double carat, double price, String color, int clarity, String cut, boolean isCertified, int hardness, String origin) {
        this.brand = brand;
        this.type = type;
        this.carat = carat;
        this.price = price;
        this.color = color;
        this.clarity = clarity;
        this.cut = cut;
        this.isCertified = isCertified;
        this.hardness = hardness;
        this.origin = origin;
    }
    
    public void displayInfo() {
        System.out.println("Diamond Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Carat: " + carat + " ct");
        System.out.println("Price: Rs. " + price);
        System.out.println("Color: " + color);
        System.out.println("Clarity: " + clarity + " FL-IF");
        System.out.println("Cut: " + cut);
        System.out.println("Certified: " + isCertified);
        System.out.println("Hardness: " + hardness + " Mohs");
        System.out.println("Origin: " + origin);
    }
}

