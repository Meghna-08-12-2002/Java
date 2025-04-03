class Pallet {
    String material;
    int length;
    int width;
    double weight;
    String color;
    boolean isReusable;
    String category;
    String type;
    String usage;
    String grade;

   
    public Pallet() {
        this("Wood", 100, 80, 500.0, "Brown", true, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material) {
        this(material, 100, 80, 500.0, "Brown", true, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length) {
        this(material, length, 80, 500.0, "Brown", true, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length, int width) {
        this(material, length, width, 500.0, "Brown", true, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length, int width, double weight) {
        this(material, length, width, weight, "Brown", true, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length, int width, double weight, String color) {
        this(material, length, width, weight, color, true, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length, int width, double weight, String color, boolean isReusable) {
        this(material, length, width, weight, color, isReusable, "Standard", "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length, int width, double weight, String color, boolean isReusable, String category) {
        this(material, length, width, weight, color, isReusable, category, "Heavy Duty", "Industrial", "A");
    }

    public Pallet(String material, int length, int width, double weight, String color, boolean isReusable, String category, String type) {
        this(material, length, width, weight, color, isReusable, category, type, "Industrial", "A");
    }

    public Pallet(String material, int length, int width, double weight, String color, boolean isReusable, String category, String type, String usage) {
        this(material, length, width, weight, color, isReusable, category, type, usage, "A");
    }

    public Pallet(String material, int length, int width, double weight, String color, boolean isReusable, String category, String type, String usage, String grade) {
        this.material = material;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.color = color;
        this.isReusable = isReusable;
        this.category = category;
        this.type = type;
        this.usage = usage;
        this.grade = grade;
    }

    public void info() {
        System.out.println("Pallet Info:");
        System.out.println("Material: " + material);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Reusable: " + isReusable);
        System.out.println("Category: " + category);
        System.out.println("Type: " + type);
        System.out.println("Usage: " + usage);
        System.out.println("Grade: " + grade);
    }
}
