class PosterRunner {
    public static void main(String[] args) {
        Poster poster1 = new Poster();
        poster1.displayInfo();

        Poster poster2 = new Poster("Event Poster");
        poster2.displayInfo();

        Poster poster3 = new Poster("Promo Poster", "50% Off Sale");
        poster3.displayInfo();

        Poster poster4 = new Poster("Concert Poster", "Live Music", "Alice");
        poster4.displayInfo();

        Poster poster5 = new Poster("Art Poster", "Modern Art", "Bob", 400);
        poster5.displayInfo();

        Poster poster6 = new Poster("Science Poster", "Physics Discovery", "Charlie", 600, 800);
        poster6.displayInfo();

        Poster poster7 = new Poster("Nature Poster", "Wildlife", "David", 700, 900, "Green");
        poster7.displayInfo();

        Poster poster8 = new Poster("Fashion Poster", "New Trends", "Emma", 500, 750, "Pink", "Serif");
        poster8.displayInfo();

        Poster poster9 = new Poster("Business Poster", "Startup Tips", "Frank", 650, 850, "Gray", "Sans-serif", false);
        poster9.displayInfo();

        Poster poster10 = new Poster("Technology Poster", "AI Revolution", "Grace", 550, 800, "Black", "Roboto", true, 15.99);
        poster10.displayInfo();

        Poster poster11 = new Poster("Gaming Poster", "New Game Release", "Henry", 600, 900, "Blue", "GamerFont", true, 20.00, "Entertainment");
        poster11.displayInfo();
    }
}
