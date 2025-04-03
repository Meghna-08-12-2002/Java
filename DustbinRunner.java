class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin("Plastic", "Blue", "Round", "Swing", "CleanBin",
                30, 50, 35, 500, 2, true, true, false, true, true, 2.5, 'A');

        Dustbin dustbin2 = new Dustbin("Stainless Steel", "Silver", "Rectangular", "Touchless", "EcoBin",
                50, 60, 40, 1500, 3, false, true, true, true, false, 4.0, 'A');

        Dustbin dustbin3 = new Dustbin("Metal", "Black", "Square", "Open Top", "UrbanWaste",
                100, 80, 50, 2500, 5, false, false, true, false, false, 6.5, 'B');

        System.out.println("Dustbin Details:");
        displayDustbinDetails(dustbin1);

        System.out.println("Updated Dustbin Details");
        displayDustbinDetails(dustbin2);

        System.out.println("Dustbin Details");
        displayDustbinDetails(dustbin3);
    }

    public static void displayDustbinDetails(Dustbin dustbin) {
        System.out.println("Material: " + dustbin.material);
        System.out.println("Color: " + dustbin.color);
        System.out.println("Shape: " + dustbin.shape);
        System.out.println("Lid Type: " + dustbin.lidType);
        System.out.println("Brand: " + dustbin.brand);
        System.out.println("Capacity: " + dustbin.capacity + " L");
        System.out.println("Height: " + dustbin.height + " cm");
        System.out.println("Width: " + dustbin.width + " cm");
        System.out.println("Price: ₹" + dustbin.price);
        System.out.println("Warranty: " + dustbin.warranty + " years");
        System.out.println("Recyclable: " + dustbin.isRecyclable);
        System.out.println("Has Foot Pedal: " + dustbin.hasFootPedal);
        System.out.println("Fire Resistant: " + dustbin.isFireResistant);
        System.out.println("Odor Control: " + dustbin.hasOdorControl);
        System.out.println("Portable: " + dustbin.isPortable);
        System.out.println("Weight: " + dustbin.weight + " kg");
        System.out.println("Quality Grade: " + dustbin.qualityGrade);
    }
}
