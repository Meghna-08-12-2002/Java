class Poster {
    String title;
    String content;
    String author;
    int width;
    int height;
    String backgroundColor;
    String font;
    boolean isPublic;
    double price;
    String category;
    
    public Poster() {
        this("Untitled");
    }
    
    public Poster(String title) {
        this(title, "No Content");
    }
    
    public Poster(String title, String content) {
        this(title, content, "Anonymous");
    }
    
    public Poster(String title, String content, String author) {
        this(title, content, author, 100);
    }
    
    public Poster(String title, String content, String author, int width) {
        this(title, content, author, width, 200);
    }
    
    public Poster(String title, String content, String author, int width, int height) {
        this(title, content, author, width, height, "White");
    }
    
    public Poster(String title, String content, String author, int width, int height, String backgroundColor) {
        this(title, content, author, width, height, backgroundColor, "Arial");
    }
    
    public Poster(String title, String content, String author, int width, int height, String backgroundColor, String font) {
        this(title, content, author, width, height, backgroundColor, font, true);
    }
    
    public Poster(String title, String content, String author, int width, int height, String backgroundColor, String font, boolean isPublic) {
        this(title, content, author, width, height, backgroundColor, font, isPublic, 0.0);
    }
    
    public Poster(String title, String content, String author, int width, int height, String backgroundColor, String font, boolean isPublic, double price) {
        this(title, content, author, width, height, backgroundColor, font, isPublic, price, "General");
    }
    
    public Poster(String title, String content, String author, int width, int height, String backgroundColor, String font, boolean isPublic, double price, String category) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.width = width;
        this.height = height;
        this.backgroundColor = backgroundColor;
        this.font = font;
        this.isPublic = isPublic;
        this.price = price;
        this.category = category;
    }
    
    public void displayInfo() {
        System.out.println("Poster Details:");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Author: " + author);
        System.out.println("Size: " + width + "x" + height);
        System.out.println("Background: " + backgroundColor);
        System.out.println("Font: " + font);
        System.out.println("Public: " + isPublic);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }
}

