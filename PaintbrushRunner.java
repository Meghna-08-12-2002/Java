class PaintbrushRunner {
    public static void main(String[] args) {
        Paintbrush paintbrush1 = new Paintbrush("Winsor & Newton", "Round", "Black", 12.99, true, true,
                10, "Wood", true, "Acrylic Painting", 5, 4.8f, "UK", true, true);

        Paintbrush paintbrush2 = new Paintbrush("Princeton", "Flat", "Blue", 15.50, false, false,
                12, "Plastic", false, "Watercolor", 4, 4.6f, "USA", false, true);

        Paintbrush paintbrush3 = new Paintbrush("Da Vinci", "Filbert", "Red", 20.75, true, true,
                15, "Bamboo", true, "Oil Painting", 6, 4.9f, "Germany", true, false);

        System.out.println("Paintbrush Details:");
        displayPaintbrushDetails(paintbrush1);

        System.out.println("Updated Paintbrush Details");
        displayPaintbrushDetails(paintbrush2);

        System.out.println("Paintbrush Details");
        displayPaintbrushDetails(paintbrush3);
    }

    public static void displayPaintbrushDetails(Paintbrush paintbrush) {
        System.out.println("Brand: " + paintbrush.brand);
        System.out.println("Type: " + paintbrush.type);
        System.out.println("Color: " + paintbrush.color);
        System.out.println("Price: $" + paintbrush.price);
        System.out.println("Is Synthetic: " + paintbrush.isSynthetic);
        System.out.println("Is Water Resistant: " + paintbrush.isWaterResistant);
        System.out.println("Bristle Length: " + paintbrush.bristleLength + " mm");
        System.out.println("Handle Material: " + paintbrush.handleMaterial);
        System.out.println("Is Ergonomic: " + paintbrush.isErgonomic);
        System.out.println("Usage: " + paintbrush.usage);
        System.out.println("Durability: " + paintbrush.durability + " years");
        System.out.println("Rating: " + paintbrush.rating);
        System.out.println("Manufacturing Country: " + paintbrush.manufacturingCountry);
        System.out.println("Has Protective Cap: " + paintbrush.hasProtectiveCap);
        System.out.println("Is Washable: " + paintbrush.isWashable);
    }
}
