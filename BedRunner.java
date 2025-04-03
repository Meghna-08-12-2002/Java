class Bed1Runner {  
    public static void main(String[] args) {  
        Bed1 bed = new Bed1();  
        System.out.println("Bed1 Type: " + bed.type);  
        System.out.println("Bed1 Size: " + bed.size);  
        System.out.println("Bed1 Material: " + bed.material);  
        System.out.println("Bed1 Has Storage: " + bed.hasStorage);  

        bed.type = "King";  
        bed.size = 6;  
        bed.material = "Wood";  
        bed.hasStorage = "Yes";  // Updated from true/false to "Yes"/"No"  

        System.out.println("Updated Bed1 Type: " + bed.type);  
        System.out.println("Updated Bed1 Size: " + bed.size);  
        System.out.println("Updated Bed1 Material: " + bed.material);  
        System.out.println("Updated Bed1 Has Storage: " + bed.hasStorage);  
    }  
}  
