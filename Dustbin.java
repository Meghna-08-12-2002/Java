class Dustbin {
    String material;
    String color;
    String shape;
    String lidType;
    String brand;
    int capacity;
    int height;
    int width;
    int price;
    int warranty;
    boolean isRecyclable;
    boolean hasFootPedal;
    boolean isFireResistant;
    boolean hasOdorControl;
    boolean isPortable;
    double weight;
    char qualityGrade;

    public Dustbin(String material, String color, String shape, String lidType, String brand,
                   int capacity, int height, int width, int price, int warranty,
                   boolean isRecyclable, boolean hasFootPedal, boolean isFireResistant,
                   boolean hasOdorControl, boolean isPortable, double weight, char qualityGrade) {
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.lidType = lidType;
        this.brand = brand;
        this.capacity = capacity;
        this.height = height;
        this.width = width;
        this.price = price;
        this.warranty = warranty;
        this.isRecyclable = isRecyclable;
        this.hasFootPedal = hasFootPedal;
        this.isFireResistant = isFireResistant;
        this.hasOdorControl = hasOdorControl;
        this.isPortable = isPortable;
        this.weight = weight;
        this.qualityGrade = qualityGrade;
    }
}
