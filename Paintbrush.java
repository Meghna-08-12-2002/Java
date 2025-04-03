class Paintbrush {
    String brand;
    String type;
    String color;
    double price;
    boolean isSynthetic;
    boolean isWaterResistant;
    int bristleLength;
    String handleMaterial;
    boolean isErgonomic;
    String usage;
    int durability;
    float rating;
    String manufacturingCountry;
    boolean hasProtectiveCap;
    boolean isWashable;

    public Paintbrush(String brand, String type, String color, double price, boolean isSynthetic, boolean isWaterResistant,
                      int bristleLength, String handleMaterial, boolean isErgonomic, String usage, int durability,
                      float rating, String manufacturingCountry, boolean hasProtectiveCap, boolean isWashable) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.isSynthetic = isSynthetic;
        this.isWaterResistant = isWaterResistant;
        this.bristleLength = bristleLength;
        this.handleMaterial = handleMaterial;
        this.isErgonomic = isErgonomic;
        this.usage = usage;
        this.durability = durability;
        this.rating = rating;
        this.manufacturingCountry = manufacturingCountry;
        this.hasProtectiveCap = hasProtectiveCap;
        this.isWashable = isWashable;
    }
}

