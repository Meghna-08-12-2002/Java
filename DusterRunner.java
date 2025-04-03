class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster("CleanPro", "Microfiber", "Blue", 30, 10, true, true, 0.5, 
                "Plastic", false, "Household", 4.8f, 2, 500, true, "India");

        Duster duster2 = new Duster("DustAway", "Feather", "Brown", 25, 8, false, false, 0.3, 
                "Wood", false, "Commercial", 4.5f, 1, 350, false, "USA");

        Duster duster3 = new Duster("ShinyTouch", "Synthetic", "Yellow", 28, 9, true, true, 0.4, 
                "Metal", true, "Industrial", 4.7f, 3, 600, true, "Germany");

        System.out.println("Duster Details:");
        displayDusterDetails(duster1);

        System.out.println("Updated Duster Details");
        displayDusterDetails(duster2);

        System.out.println("Duster Details");
        displayDusterDetails(duster3);
    }

    public static void displayDusterDetails(Duster duster) {
        System.out.println("Brand: " + duster.brand);
        System.out.println("Material: " + duster.material);
        System.out.println("Color: " + duster.color);
        System.out.println("Length: " + duster.length + " cm");
        System.out.println("Width: " + duster.width + " cm");
        System.out.println("Reusable: " + duster.isReusable);
        System.out.println("Washable: " + duster.isWashable);
        System.out.println("Weight: " + duster.weight + " kg");
        System.out.println("Handle Type: " + duster.handleType);
        System.out.println("Extendable Handle: " + duster.hasExtendableHandle);
        System.out.println("Usage Type: " + duster.usageType);
        System.out.println("Rating: " + duster.rating);
        System.out.println("Warranty: " + duster.warrantyPeriod + " years");
        System.out.println("Price: ₹" + duster.price);
        System.out.println("Eco-Friendly: " + duster.isEcoFriendly);
        System.out.println("Country of Origin: " + duster.countryOfOrigin);
    }
}
