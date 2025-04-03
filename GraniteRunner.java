class GraniteRunner {
    public static void main(String[] args) {
        Granite granite1 = new Granite();
        granite1.displayInfo();

        Granite granite2 = new Granite("Classic Rock");
        granite2.displayInfo();

        Granite granite3 = new Granite("Premium Stone", "Engineered");
        granite3.displayInfo();

        Granite granite4 = new Granite("Luxury Slab", "Natural", 3.0);
        granite4.displayInfo();

        Granite granite5 = new Granite("Royal Granite", "Porous", 2.5, 2500);
        granite5.displayInfo();

        Granite granite6 = new Granite("EarthStone", "Dense", 2.8, 2700, "Black");
        granite6.displayInfo();

        Granite granite7 = new Granite("MarbleTech", "Super Hard", 3.0, 2900, "White", 8);
        granite7.displayInfo();

        Granite granite8 = new Granite("GranitoLux", "High Gloss", 3.5, 3100, "Green", 9, "Interior");
        granite8.displayInfo();

        Granite granite9 = new Granite("StoneCraft", "Weather Resistant", 2.7, 2800, "Red", 7, "Outdoor", false);
        granite9.displayInfo();

        Granite granite10 = new Granite("HardRock", "Non-Porous", 2.9, 3200, "Beige", 10, "Countertops", true, 60);
        granite10.displayInfo();

        Granite granite11 = new Granite("Elite Granite", "Crystal Enhanced", 3.2, 3500, "Blue", 10, "Luxury Finish", true, 70, "Brazil");
        granite11.displayInfo();
    }
}