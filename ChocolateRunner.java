class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Dairy Milk", "Cadbury", 150.0, 120.0, false, true,
                30, "India", 12, false, false, "Wrapper", 4.7f, 2023, "Milk Chocolate", false, false);

        Chocolate chocolate2 = new Chocolate("Lindt Excellence", "Lindt", 100.0, 250.0, true, false,
                85, "Switzerland", 18, true, false, "Box", 4.9f, 2022, "Dark Chocolate", false, false);

        Chocolate chocolate3 = new Chocolate("Ferrero Rocher", "Ferrero", 200.0, 500.0, false, true,
                40, "Italy", 24, false, false, "Gift Pack", 4.8f, 2023, "Hazelnut Chocolate", true, true);

        System.out.println("Chocolate Details:");
        displayChocolateDetails(chocolate1);

        System.out.println("Updated Chocolate Details");
        displayChocolateDetails(chocolate2);

        System.out.println("Chocolate Details");
        displayChocolateDetails(chocolate3);
    }

    public static void displayChocolateDetails(Chocolate chocolate) {
        System.out.println("Name: " + chocolate.name);
        System.out.println("Brand: " + chocolate.brand);
        System.out.println("Weight: " + chocolate.weight + " g");
        System.out.println("Price: ₹" + chocolate.price);
        System.out.println("Is Dark: " + chocolate.isDark);
        System.out.println("Has Nuts: " + chocolate.hasNuts);
        System.out.println("Cocoa Percentage: " + chocolate.cocoaPercentage + "%");
        System.out.println("Origin: " + chocolate.origin);
        System.out.println("Shelf Life: " + chocolate.shelfLife + " months");
        System.out.println("Is Vegan: " + chocolate.isVegan);
        System.out.println("Is Sugar-Free: " + chocolate.isSugarFree);
        System.out.println("Packaging Type: " + chocolate.packagingType);
        System.out.println("Customer Rating: " + chocolate.customerRating);
        System.out.println("Manufacturing Year: " + chocolate.manufacturingYear);
        System.out.println("Flavor: " + chocolate.flavor);
        System.out.println("Has Caramel: " + chocolate.hasCaramel);
        System.out.println("Has Filling: " + chocolate.hasFilling);
    }
}
