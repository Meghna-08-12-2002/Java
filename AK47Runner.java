class AK47Runner {
    public static void main(String[] args) {
        AK47 gun1 = new AK47();
        gun1.displayInfo();

        AK47 gun2 = new AK47("USA");
        gun2.displayInfo();

        AK47 gun3 = new AK47("Germany", 5);
        gun3.displayInfo();

        AK47 gun4 = new AK47("China", 6, "Polymer");
        gun4.displayInfo();

        AK47 gun5 = new AK47("India", 7, "Carbon Steel", 35);
        gun5.displayInfo();

        AK47 gun6 = new AK47("Russia", 7, "Aluminum", 30, false);
        gun6.displayInfo();

        AK47 gun7 = new AK47("Ukraine", 6, "Titanium", 25, true, "14 inches");
        gun7.displayInfo();

        AK47 gun8 = new AK47("Israel", 5, "Composite", 20, true, "12 inches", "Burst");
        gun8.displayInfo();

        AK47 gun9 = new AK47("France", 5, "Stainless Steel", 15, false, "10 inches", "Semi-Auto", "Trigger Lock");
        gun9.displayInfo();

        AK47 gun10 = new AK47("UK", 7, "Ceramic", 40, true, "18 inches", "Automatic", "Thumb Safety", 650);
        gun10.displayInfo();

        AK47 gun11 = new AK47("Russia", 7, "Hardened Steel", 45, true, "20 inches", "Automatic", "Advanced Lock", 700, "Izhevsk Machine-Building Plant");
        gun11.displayInfo();
    }
}