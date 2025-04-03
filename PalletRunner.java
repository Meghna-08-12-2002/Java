class PalletRunner {
    public static void main(String[] args) {
        Pallet pallet1 = new Pallet();
        pallet1.info();

        Pallet pallet2 = new Pallet("Plastic");
        pallet2.info();

        Pallet pallet3 = new Pallet("Metal", 120);
        pallet3.info();

        Pallet pallet4 = new Pallet("Wood", 110, 85);
        pallet4.info();

        Pallet pallet5 = new Pallet("Steel", 90, 70, 500.5);
        pallet5.info();

        Pallet pallet6 = new Pallet("Aluminum", 110, 85, 450.0, "Silver");
        pallet6.info();

        Pallet pallet7 = new Pallet("Composite", 95, 75, 400.0, "Black", true);
        pallet7.info();

        Pallet pallet8 = new Pallet("Fiber", 130, 90, 550.0, "Gray", false, "Heavy Duty");
        pallet8.info();

        Pallet pallet9 = new Pallet("Rubber", 105, 78, 420.0, "Dark Gray", true, "Standard", "Industrial");
        pallet9.info();

        Pallet pallet10 = new Pallet("Carbon Fiber", 125, 95, 600.0, "Black", false, "Ultra Light", "High Strength", "Advanced");
        pallet10.info();

        Pallet pallet11 = new Pallet("Nano Composite", 140, 100, 700.0, "Silver", true, "Premium", "Super Strength", "Ultimate", "NextGen");
        pallet11.info();
    }
}
