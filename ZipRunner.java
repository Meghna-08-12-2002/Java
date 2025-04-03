class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip("YKK", "Metal", "Silver", 5.99, true, true,
                30, "Brass", true, "Jackets", 50, 4.7f, "Japan", true, true);

        Zip zip2 = new Zip("Coats", "Plastic", "Black", 3.50, false, true,
                25, "Nylon", false, "Backpacks", 40, 4.5f, "USA", false, true);

        Zip zip3 = new Zip("Ideal", "Coil", "Blue", 4.25, true, false,
                35, "Polyester", true, "Tents", 60, 4.8f, "Germany", true, false);

        System.out.println("Zip Details:");
        displayZipDetails(zip1);

        System.out.println("Updated Zip Details");
        displayZipDetails(zip2);

        System.out.println("Zip Details");
        displayZipDetails(zip3);
    }

    public static void displayZipDetails(Zip zip) {
        System.out.println("Brand: " + zip.brand);
        System.out.println("Type: " + zip.type);
        System.out.println("Color: " + zip.color);
        System.out.println("Price: $" + zip.price);
        System.out.println("Is Waterproof: " + zip.isWaterproof);
        System.out.println("Is Rust Proof: " + zip.isRustProof);
        System.out.println("Length: " + zip.length + " cm");
        System.out.println("Material: " + zip.material);
        System.out.println("Is Durable: " + zip.isDurable);
        System.out.println("Usage: " + zip.usage);
        System.out.println("Teeth Count: " + zip.teethCount);
        System.out.println("Rating: " + zip.rating);
        System.out.println("Manufacturing Country: " + zip.manufacturingCountry);
        System.out.println("Has Lock Mechanism: " + zip.hasLockMechanism);
        System.out.println("Is Washable: " + zip.isWashable);
    }
}