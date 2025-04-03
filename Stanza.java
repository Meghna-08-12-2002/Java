class Stanza {
    String title;
    String author;
    int lines;
    String rhymeScheme;
    String theme;
    boolean isClassic;
    String meter;
    String language;
    int publishedYear;
    String collection;
    
    public Stanza() {
        this("Untitled");
    }
    
    public Stanza(String title) {
        this(title, "Anonymous");
    }
    
    public Stanza(String title, String author) {
        this(title, author, 4);
    }
    
    public Stanza(String title, String author, int lines) {
        this(title, author, lines, "ABAB");
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme) {
        this(title, author, lines, rhymeScheme, "Nature");
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme, String theme) {
        this(title, author, lines, rhymeScheme, theme, true);
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme, String theme, boolean isClassic) {
        this(title, author, lines, rhymeScheme, theme, isClassic, "Iambic");
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme, String theme, boolean isClassic, String meter) {
        this(title, author, lines, rhymeScheme, theme, isClassic, meter, "English");
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme, String theme, boolean isClassic, String meter, String language) {
        this(title, author, lines, rhymeScheme, theme, isClassic, meter, language, 1850);
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme, String theme, boolean isClassic, String meter, String language, int publishedYear) {
        this(title, author, lines, rhymeScheme, theme, isClassic, meter, language, publishedYear, "Great Poems Collection");
    }
    
    public Stanza(String title, String author, int lines, String rhymeScheme, String theme, boolean isClassic, String meter, String language, int publishedYear, String collection) {
        this.title = title;
        this.author = author;
        this.lines = lines;
        this.rhymeScheme = rhymeScheme;
        this.theme = theme;
        this.isClassic = isClassic;
        this.meter = meter;
        this.language = language;
        this.publishedYear = publishedYear;
        this.collection = collection;
    }
    
    public void displayInfo() {
        System.out.println("Stanza Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Lines: " + lines);
        System.out.println("Rhyme Scheme: " + rhymeScheme);
        System.out.println("Theme: " + theme);
        System.out.println("Classic: " + isClassic);
        System.out.println("Meter: " + meter);
        System.out.println("Language: " + language);
        System.out.println("Published Year: " + publishedYear);
        System.out.println("Collection: " + collection);
    }
}