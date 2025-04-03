class TerraceRunner {  
    public static void main(String[] args) {  
        Terrace terrace = new Terrace();  
        System.out.println("Terrace Level: " + terrace.level);  
        System.out.println("Terrace Flooring Type: " + terrace.flooringType);  
        System.out.println("Terrace Size: " + terrace.size);  
        System.out.println("Terrace Has Garden: " + terrace.hasGarden);  

        terrace.level = 3;  
        terrace.flooringType = "Tile";  
        terrace.size = 150.75;  
        terrace.hasGarden = true;  

        System.out.println("Updated Terrace Level: " + terrace.level);  
        System.out.println("Updated Terrace Flooring Type: " + terrace.flooringType);  
        System.out.println("Updated Terrace Size: " + terrace.size);  
        System.out.println("Updated Terrace Has Garden: " + terrace.hasGarden);  
    }  
}  
