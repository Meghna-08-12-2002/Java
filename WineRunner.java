class WineRunner {
    public static void main(String[] args) {
        Wine wine1 = new Wine();
        wine1.displayInfo();

        Wine wine2 = new Wine("Vintage White");
        wine2.displayInfo();

        Wine wine3 = new Wine("Bordeaux Reserve", "Merlot");
        wine3.displayInfo();

        Wine wine4 = new Wine("Chardonnay Supreme", "Chardonnay", 8);
        wine4.displayInfo();

        Wine wine5 = new Wine("Pinot Noir Select", "Pinot Noir", 6, 3.2);
        wine5.displayInfo();

        Wine wine6 = new Wine("Merlot Grand", "Merlot", 10, 3.8, "Italy");
        wine6.displayInfo();

        Wine wine7 = new Wine("Riesling Delight", "Riesling", 7, 3.0, "Germany", true);
        wine7.displayInfo();

        Wine wine8 = new Wine("Sauvignon Special", "Sauvignon Blanc", 5, 2.9, "New Zealand", true, "Burgundy");
        wine8.displayInfo();

        Wine wine9 = new Wine("Cabernet Prestige", "Cabernet Sauvignon", 12, 4.0, "Spain", false, "Bordeaux", "Earthy");
        wine9.displayInfo();

        Wine wine10 = new Wine("Zinfandel Bliss", "Zinfandel", 9, 3.5, "USA", true, "Tall", "Spicy", 2016);
        wine10.displayInfo();

        Wine wine11 = new Wine("Malbec Reserve", "Malbec", 15, 4.2, "Argentina", true, "Classic", "Rich", 2014, "Bodega Catena Zapata");
        wine11.displayInfo();
    }
}
