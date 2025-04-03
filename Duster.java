class Duster {
    String brand;
    String material;
    String color;
    int length;
    int width;
    boolean isReusable;
    boolean isWashable;
    double weight;
    String handleType;
    boolean hasExtendableHandle;
    String usageType;
    float rating;
    int warrantyPeriod;
    int price;
    boolean isEcoFriendly;
    String countryOfOrigin;

    public Duster(String brand, String material, String color, int length, int width, boolean isReusable, 
                  boolean isWashable, double weight, String handleType, boolean hasExtendableHandle, 
                  String usageType, float rating, int warrantyPeriod, int price, 
                  boolean isEcoFriendly, String countryOfOrigin) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.isReusable = isReusable;
        this.isWashable = isWashable;
        this.weight = weight;
        this.handleType = handleType;
        this.hasExtendableHandle = hasExtendableHandle;
        this.usageType = usageType;
        this.rating = rating;
        this.warrantyPeriod = warrantyPeriod;
        this.price = price;
        this.isEcoFriendly = isEcoFriendly;
        this.countryOfOrigin = countryOfOrigin;
    }
}

