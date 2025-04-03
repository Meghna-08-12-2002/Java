class DiamondRunner {
    public static void main(String[] args) {
        Diamond diamond1 = new Diamond();
        diamond1.displayInfo();

        Diamond diamond2 = new Diamond("Brilliant Diamonds");
        diamond2.displayInfo();

        Diamond diamond3 = new Diamond("Royal Gems", "Lab-Grown");
        diamond3.displayInfo();

        Diamond diamond4 = new Diamond("Luxury Stones", "Natural", 1.5);
        diamond4.displayInfo();

        Diamond diamond5 = new Diamond("Elite Jewels", "Fancy", 2.0, 10000);
        diamond5.displayInfo();

        Diamond diamond6 = new Diamond("Shiny Rock", "Premium", 1.8, 15000, "Yellow");
        diamond6.displayInfo();

        Diamond diamond7 = new Diamond("Crystal Cut", "Ultra Clear", 2.2, 20000, "Pink", 9);
        diamond7.displayInfo();

        Diamond diamond8 = new Diamond("EverGems", "Perfect Cut", 2.5, 25000, "Blue", 10, "Princess");
        diamond8.displayInfo();

        Diamond diamond9 = new Diamond("Grand Stones", "Flawless", 3.0, 30000, "Green", 10, "Emerald", true);
        diamond9.displayInfo();

        Diamond diamond10 = new Diamond("Pure Shine", "Brilliant", 3.5, 35000, "Red", 10, "Oval", true, 10);
        diamond10.displayInfo();

        Diamond diamond11 = new Diamond("Supreme Diamonds", "Masterpiece", 4.0, 50000, "Violet", 10, "Heart", true, 10, "Russia");
        diamond11.displayInfo();
    }
}
