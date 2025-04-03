class CraneRunner {   
    public static void main(String[] args) {       
        Crane crane = new Crane();       
        System.out.println("Crane Model: " + crane.model);       
        System.out.println("Crane Capacity: " + crane.capacity);       
        System.out.println("Crane Is Mobile: " + crane.isMobile);       
        System.out.println("Crane Height: " + crane.height);        

        crane.model = "X500";       
        crane.capacity = 1000;       
        crane.isMobile = true;       
        crane.height = 50.5;        

        System.out.println("Updated Crane Model: " + crane.model);       
        System.out.println("Updated Crane Capacity: " + crane.capacity);       
        System.out.println("Updated Crane Is Mobile: " + crane.isMobile);       
        System.out.println("Updated Crane Height: " + crane.height);   
    } 
}
