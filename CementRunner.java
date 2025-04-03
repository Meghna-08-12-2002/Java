class CementRunner {
    public static void main(String[] args) {
        Cement cement1 = new Cement();
        cement1.displayInfo();

        Cement cement2 = new Cement("UltraTech");
        cement2.displayInfo();

        Cement cement3 = new Cement("Ambuja", "PPC");
        cement3.displayInfo();

        Cement cement4 = new Cement("ACC", "OPC", 25);
        cement4.displayInfo();

        Cement cement5 = new Cement("Dalmia", "White Cement", 50, 350);
        cement5.displayInfo();

        Cement cement6 = new Cement("JK Cement", "Rapid Hardening", 50, 400, "White");
        cement6.displayInfo();

        Cement cement7 = new Cement("Birla", "Low Heat", 50, 380, "Gray", 45);
        cement7.displayInfo();

        Cement cement8 = new Cement("Shree", "Sulfate Resistant", 50, 420, "Dark Gray", 50, "Marine Construction");
        cement8.displayInfo();

        Cement cement9 = new Cement("Ramco", "Blast Furnace Slag", 50, 390, "Gray", 42, "Bridges", true);
        cement9.displayInfo();

        Cement cement10 = new Cement("Coromandel", "Fly Ash Based", 50, 360, "Light Gray", 43, "High-Rise Buildings", true, 25);
        cement10.displayInfo();

        Cement cement11 = new Cement("Jaypee", "Super Strength", 50, 500, "Dark Gray", 55, "Heavy Construction", true, 20, "Grade 53");
        cement11.displayInfo();
    }
}
