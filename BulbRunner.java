class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb1 = new Bulb();
        bulb1.displayInfo();

        Bulb bulb2 = new Bulb("Halogen");
        bulb2.displayInfo();

        Bulb bulb3 = new Bulb("CFL", 14);
        bulb3.displayInfo();

        Bulb bulb4 = new Bulb("Fluorescent", 36, "Cool White");
        bulb4.displayInfo();

        Bulb bulb5 = new Bulb("Incandescent", 60, "Soft White", 1000);
        bulb5.displayInfo();

        Bulb bulb6 = new Bulb("Smart LED", 10, "RGB", 25000, true);
        bulb6.displayInfo();

        Bulb bulb7 = new Bulb("Tube Light", 40, "Daylight", 15000, false, "T8");
        bulb7.displayInfo();

        Bulb bulb8 = new Bulb("Panel Light", 24, "Neutral White", 50000, true, "Square", "G13");
        bulb8.displayInfo();

        Bulb bulb9 = new Bulb("Spotlight", 7, "Warm Yellow", 30000, true, "PAR16", "GU10", "230V");
        bulb9.displayInfo();

        Bulb bulb10 = new Bulb("Floodlight", 100, "Cool Blue", 50000, false, "Rectangular", "E39", "240V", 10000);
        bulb10.displayInfo();

        Bulb bulb11 = new Bulb("Vintage Filament", 4, "Amber", 15000, true, "ST64", "E27", "110V", 450, "Edison");
        bulb11.displayInfo();
    }
}