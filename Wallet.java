class Wallet {
    int id;
    String material;
    String color;
    int capacity;
    boolean hasRFID;
    double price;
    String size;
    boolean waterproof;
    String closureType;
    String countryOfOrigin;
    
    public Wallet() {
        this(1001);
    }
    
    public Wallet(int id) {
        this(id, "Leather");
    }
    
    public Wallet(int id, String material) {
        this(id, material, "Black");
    }
    
    public Wallet(int id, String material, String color) {
        this(id, material, color, 10);
    }
    
    public Wallet(int id, String material, String color, int capacity) {
        this(id, material, color, capacity, true);
    }
    
    public Wallet(int id, String material, String color, int capacity, boolean hasRFID) {
        this(id, material, color, capacity, hasRFID, 1000.0);
    }
    
    public Wallet(int id, String material, String color, int capacity, boolean hasRFID, double price) {
        this(id, material, color, capacity, hasRFID, price, "Medium");
    }
    
    public Wallet(int id, String material, String color, int capacity, boolean hasRFID, double price, String size) {
        this(id, material, color, capacity, hasRFID, price, size, false);
    }
    
    public Wallet(int id, String material, String color, int capacity, boolean hasRFID, double price, String size, boolean waterproof) {
        this(id, material, color, capacity, hasRFID, price, size, waterproof, "Zip");
    }
    
    public Wallet(int id, String material, String color, int capacity, boolean hasRFID, double price, String size, boolean waterproof, String closureType) {
        this(id, material, color, capacity, hasRFID, price, size, waterproof, closureType, "India");
    }
    
    public Wallet(int id, String material, String color, int capacity, boolean hasRFID, double price, String size, boolean waterproof, String closureType, String countryOfOrigin) {
        this.id = id;
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.hasRFID = hasRFID;
        this.price = price;
        this.size = size;
        this.waterproof = waterproof;
        this.closureType = closureType;
        this.countryOfOrigin = countryOfOrigin;
    }
    
    public void displayInfo() {
        System.out.println("Wallet Details:");
        System.out.println("ID: " + id);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + " cards");
        System.out.println("RFID Protection: " + hasRFID);
        System.out.println("Price: Rs. " + price);
        System.out.println("Size: " + size);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Country of Origin: " + countryOfOrigin);
    }
}

