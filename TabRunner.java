class TabRunner {
    public static void main(String[] args) {
        Tab tab1 = new Tab("Samsung", "Galaxy Tab S7", "Snapdragon 865+", "Android", "Black",
                8, 256, 8000, 60000, 1, 2020,
                true, true, true, true, true,
                0.5, 11.0, 2800.0, 'A', 'B');

        Tab tab2 = new Tab("Apple", "iPad Pro", "M1", "iPadOS", "Silver",
                16, 512, 10000, 120000, 2, 2021,
                true, true, true, true, false,
                0.7, 12.9, 3000.0, 'A', 'A');

        Tab tab3 = new Tab("Lenovo", "Tab P11 Pro", "Snapdragon 730G", "Android", "Grey",
                6, 128, 7500, 40000, 1, 2021,
                true, false, true, false, true,
                0.45, 11.5, 2500.0, 'B', 'C');

        System.out.println("Tab Details:");
        displayTabDetails(tab1);

        System.out.println("Updated Tab Details");
        displayTabDetails(tab2);

        System.out.println("Tab Details");
        displayTabDetails(tab3);
    }

    public static void displayTabDetails(Tab tab) {
        System.out.println("Brand: " + tab.brand);
        System.out.println("Model: " + tab.model);
        System.out.println("Processor: " + tab.processor);
        System.out.println("OS: " + tab.os);
        System.out.println("Color: " + tab.color);
        System.out.println("RAM: " + tab.ram + " GB");
        System.out.println("Storage: " + tab.storage + " GB");
        System.out.println("Battery: " + tab.battery + " mAh");
        System.out.println("Price: ₹" + tab.price);
        System.out.println("Warranty: " + tab.warranty + " years");
        System.out.println("Release Year: " + tab.releaseYear);
        System.out.println("Cellular: " + tab.isCellular);
        System.out.println("Stylus Support: " + tab.hasStylus);
        System.out.println("Fingerprint Sensor: " + tab.hasFingerprint);
        System.out.println("Face Unlock: " + tab.hasFaceUnlock);
        System.out.println("Expandable Storage: " + tab.hasExpandableStorage);
        System.out.println("Weight: " + tab.weight + " kg");
        System.out.println("Screen Size: " + tab.screenSize + " inches");
        System.out.println("Resolution: " + tab.resolution + " pixels");
        System.out.println("Quality Grade: " + tab.qualityGrade);
        System.out.println("Durability Grade: " + tab.durabilityGrade);
    }
}
