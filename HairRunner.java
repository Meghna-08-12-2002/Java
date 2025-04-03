class HairRunner {   
    public static void main(String[] args) {       
        Hair hair = new Hair();       
        System.out.println("Hair Color: " + hair.color);       
        System.out.println("Hair Length: " + hair.length);       
        System.out.println("Hair Is Curly: " + hair.isCurly);       
        System.out.println("Hair Type: " + hair.type);        

        hair.color = "Black";       
        hair.length = 25;       
        hair.isCurly = false;       
        hair.type = "Wavy";        

        System.out.println("Updated Hair Color: " + hair.color);       
        System.out.println("Updated Hair Length: " + hair.length);       
        System.out.println("Updated Hair Is Curly: " + hair.isCurly);       
        System.out.println("Updated Hair Type: " + hair.type);   
    } 
}
