class Wine {
    String name;
    String grapeVariety;
    int agingYears;
    double acidityLevel;
    String countryOfOrigin;
    boolean oakAged;
    String bottleShape;
    String aromaNotes;
    int harvestYear;
    String winery;
    
    public Wine() {
        this("Classic Red");
    }
    
    public Wine(String name) {
        this(name, "Cabernet Sauvignon");
    }
    
    public Wine(String name, String grapeVariety) {
        this(name, grapeVariety, 5);
    }
    
    public Wine(String name, String grapeVariety, int agingYears) {
        this(name, grapeVariety, agingYears, 3.5);
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel) {
        this(name, grapeVariety, agingYears, acidityLevel, "France");
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel, String countryOfOrigin) {
        this(name, grapeVariety, agingYears, acidityLevel, countryOfOrigin, false);
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel, String countryOfOrigin, boolean oakAged) {
        this(name, grapeVariety, agingYears, acidityLevel, countryOfOrigin, oakAged, "Bordeaux");
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel, String countryOfOrigin, boolean oakAged, String bottleShape) {
        this(name, grapeVariety, agingYears, acidityLevel, countryOfOrigin, oakAged, bottleShape, "Fruity");
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel, String countryOfOrigin, boolean oakAged, String bottleShape, String aromaNotes) {
        this(name, grapeVariety, agingYears, acidityLevel, countryOfOrigin, oakAged, bottleShape, aromaNotes, 2018);
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel, String countryOfOrigin, boolean oakAged, String bottleShape, String aromaNotes, int harvestYear) {
        this(name, grapeVariety, agingYears, acidityLevel, countryOfOrigin, oakAged, bottleShape, aromaNotes, harvestYear, "Chateau Margaux");
    }
    
    public Wine(String name, String grapeVariety, int agingYears, double acidityLevel, String countryOfOrigin, boolean oakAged, String bottleShape, String aromaNotes, int harvestYear, String winery) {
        this.name = name;
        this.grapeVariety = grapeVariety;
        this.agingYears = agingYears;
        this.acidityLevel = acidityLevel;
        this.countryOfOrigin = countryOfOrigin;
        this.oakAged = oakAged;
        this.bottleShape = bottleShape;
        this.aromaNotes = aromaNotes;
        this.harvestYear = harvestYear;
        this.winery = winery;
    }
    
    public void displayInfo() {
        System.out.println("Wine Details:");
        System.out.println("Name: " + name);
        System.out.println("Grape Variety: " + grapeVariety);
        System.out.println("Aging Years: " + agingYears);
        System.out.println("Acidity Level: " + acidityLevel);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Oak Aged: " + oakAged);
        System.out.println("Bottle Shape: " + bottleShape);
        System.out.println("Aroma Notes: " + aromaNotes);
        System.out.println("Harvest Year: " + harvestYear);
        System.out.println("Winery: " + winery);
    }
}

