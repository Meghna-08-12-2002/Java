class AK47 {
    String country;
    int caliber;
    String material;
    int magazineCapacity;
    boolean isAutomatic;
    String barrelLength;
    String firingMode;
    String safetyMechanism;
    int rateOfFire;
    String manufacturer;
    
    public AK47() {
        this("Russia");
    }
    
    public AK47(String country) {
        this(country, 7);
    }
    
    public AK47(String country, int caliber) {
        this(country, caliber, "Steel");
    }
    
    public AK47(String country, int caliber, String material) {
        this(country, caliber, material, 30);
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity) {
        this(country, caliber, material, magazineCapacity, true);
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity, boolean isAutomatic) {
        this(country, caliber, material, magazineCapacity, isAutomatic, "16 inches");
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity, boolean isAutomatic, String barrelLength) {
        this(country, caliber, material, magazineCapacity, isAutomatic, barrelLength, "Selective Fire");
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity, boolean isAutomatic, String barrelLength, String firingMode) {
        this(country, caliber, material, magazineCapacity, isAutomatic, barrelLength, firingMode, "Lever");
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity, boolean isAutomatic, String barrelLength, String firingMode, String safetyMechanism) {
        this(country, caliber, material, magazineCapacity, isAutomatic, barrelLength, firingMode, safetyMechanism, 600);
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity, boolean isAutomatic, String barrelLength, String firingMode, String safetyMechanism, int rateOfFire) {
        this(country, caliber, material, magazineCapacity, isAutomatic, barrelLength, firingMode, safetyMechanism, rateOfFire, "Kalashnikov Concern");
    }
    
    public AK47(String country, int caliber, String material, int magazineCapacity, boolean isAutomatic, String barrelLength, String firingMode, String safetyMechanism, int rateOfFire, String manufacturer) {
        this.country = country;
        this.caliber = caliber;
        this.material = material;
        this.magazineCapacity = magazineCapacity;
        this.isAutomatic = isAutomatic;
        this.barrelLength = barrelLength;
        this.firingMode = firingMode;
        this.safetyMechanism = safetyMechanism;
        this.rateOfFire = rateOfFire;
        this.manufacturer = manufacturer;
    }
    
    public void displayInfo() {
        System.out.println("AK-47 Details:");
        System.out.println("Country: " + country);
        System.out.println("Caliber: " + caliber + " mm");
        System.out.println("Material: " + material);
        System.out.println("Magazine Capacity: " + magazineCapacity + " rounds");
        System.out.println("Automatic: " + isAutomatic);
        System.out.println("Barrel Length: " + barrelLength);
        System.out.println("Firing Mode: " + firingMode);
        System.out.println("Safety Mechanism: " + safetyMechanism);
        System.out.println("Rate of Fire: " + rateOfFire + " rounds per minute");
        System.out.println("Manufacturer: " + manufacturer);
    }
}

