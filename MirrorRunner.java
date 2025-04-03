class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new Mirror("White", "Washroom", 150, "Rectangle", true, true, "CPV", 'M', 6.7d, 5.8d, true, "Plane", "Silver", 4.9f, "Karnataka", false, "rare", "WipeWithPaper", 24, 20);
        Mirror mirror1 = new Mirror("Brown", "Hall", 300, "Oval", false, true, "Shringar", 'L', 9.0d, 6.7d, true, "Plane", "Gold", 7.9f, "Tamil Nadu", true, "rare", "WipeWithCloth", 27, 30);
        Mirror mirror2 = new Mirror("Pink", "Hall", 500, "Pebble Wall", false, true, "Ikea", 'L', 4.0d, 5.7d, true, "Plane", "Grey", 5.9f, "Delhi", true, "rare", "WipeWithCloth", 21, 60);

        System.out.println("Mirror Details:");
        displayMirrorDetails(mirror);

        System.out.println("Updated Mirror Details");
        displayMirrorDetails(mirror1);

        System.out.println("Mirror Details:");
        displayMirrorDetails(mirror2);
    }

    public static void displayMirrorDetails(Mirror mirror) {
        System.out.println("Mirror Color : " + mirror.color);
        System.out.println("Mirror Used Place : " + mirror.placeOfUse);
        System.out.println("Mirror Price : " + mirror.price);
        System.out.println("Mirror Shape : " + mirror.shape);
        System.out.println("Mirror is Fog-free? : " + mirror.fogFree);
        System.out.println("Mirror is Water Resistant? : " + mirror.waterResistance);
        System.out.println("Mirror Brand : " + mirror.brand);
        System.out.println("Mirror Size : " + mirror.size + " inch");
        System.out.println("Mirror Height : " + mirror.height + " cm");
        System.out.println("Mirror Width : " + mirror.width);
        System.out.println("Mirror is Lightweight? : " + mirror.lightWeight);
        System.out.println("Mirror Glass Type : " + mirror.typeOfGlass);
        System.out.println("Mirror Frame Design : " + mirror.frameDesign);
        System.out.println("Mirror Rating : " + mirror.rating);
        System.out.println("Mirror Manufactured State : " + mirror.manufacturingState);
        System.out.println("Mirror is Scratch Resistant? : " + mirror.isScratchResistant);
        System.out.println("Mirror Reflection Type : " + mirror.typeOfReflection);
        System.out.println("Mirror Cleaning Method : " + mirror.cleaningMethod);
        System.out.println("Mirror Warranty : " + mirror.warrantyPeriod + " months");
        System.out.println("Mirror Discount : " + mirror.discount + "%");
    }
}
