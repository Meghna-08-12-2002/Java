class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();
        wallet1.displayInfo();

        Wallet wallet2 = new Wallet(1002);
        wallet2.displayInfo();

        Wallet wallet3 = new Wallet(1003, "Synthetic");
        wallet3.displayInfo();

        Wallet wallet4 = new Wallet(1004, "Canvas", "Brown");
        wallet4.displayInfo();

        Wallet wallet5 = new Wallet(1005, "Vegan Leather", "Blue", 12);
        wallet5.displayInfo();

        Wallet wallet6 = new Wallet(1006, "Fabric", "Gray", 8, true);
        wallet6.displayInfo();

        Wallet wallet7 = new Wallet(1007, "Genuine Leather", "Tan", 10, false, 1500.0);
        wallet7.displayInfo();

        Wallet wallet8 = new Wallet(1008, "Full Grain Leather", "Dark Brown", 14, true, 3000.0, "Large");
        wallet8.displayInfo();

        Wallet wallet9 = new Wallet(1009, "Pebbled Leather", "Burgundy", 10, true, 5000.0, "Small", true);
        wallet9.displayInfo();

        Wallet wallet10 = new Wallet(1010, "Exotic Leather", "Gold", 8, true, 25000.0, "Slim", true, "Magnetic");
        wallet10.displayInfo();

        Wallet wallet11 = new Wallet(1011, "Premium Leather", "Black", 15, true, 50000.0, "Extra Large", true, "Snap", "France");
        wallet11.displayInfo();
    }
}