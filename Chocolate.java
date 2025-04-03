class Chocolate {
    String name;
    String brand;
    double weight;
    double price;
    boolean isDark;
    boolean hasNuts;
    int cocoaPercentage;
    String origin;
    int shelfLife;
    boolean isVegan;
    boolean isSugarFree;
    String packagingType;
    float customerRating;
    int manufacturingYear;
    String flavor;
    boolean hasCaramel;
    boolean hasFilling;

    public Chocolate(String name, String brand, double weight, double price, boolean isDark, boolean hasNuts,
                     int cocoaPercentage, String origin, int shelfLife, boolean isVegan, boolean isSugarFree,
                     String packagingType, float customerRating, int manufacturingYear, String flavor,
                     boolean hasCaramel, boolean hasFilling) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        this.isDark = isDark;
        this.hasNuts = hasNuts;
        this.cocoaPercentage = cocoaPercentage;
        this.origin = origin;
        this.shelfLife = shelfLife;
        this.isVegan = isVegan;
        this.isSugarFree = isSugarFree;
        this.packagingType = packagingType;
        this.customerRating = customerRating;
        this.manufacturingYear = manufacturingYear;
        this.flavor = flavor;
        this.hasCaramel = hasCaramel;
        this.hasFilling = hasFilling;
    }
}

