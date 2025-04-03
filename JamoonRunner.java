class JamoonRunner {   
    public static void main(String[] args) {       
        Jamoon jamoon = new Jamoon();       
        System.out.println("Jamoon Flavor: " + jamoon.flavor);       
        System.out.println("Jamoon Size: " + jamoon.size);       
        System.out.println("Jamoon Is Sugary: " + jamoon.isSugary);       
        System.out.println("Jamoon Origin: " + jamoon.origin);        

        jamoon.flavor = "Rose";       
        jamoon.size = 5;       
        jamoon.isSugary = true;       
        jamoon.origin = "India";        

        System.out.println("Updated Jamoon Flavor: " + jamoon.flavor);       
        System.out.println("Updated Jamoon Size: " + jamoon.size);       
        System.out.println("Updated Jamoon Is Sugary: " + jamoon.isSugary);       
        System.out.println("Updated Jamoon Origin: " + jamoon.origin);   
    } 
}
