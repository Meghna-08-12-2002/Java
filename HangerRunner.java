class HangerRunner {   
    public static void main(String[] args) {       
        Hanger hanger = new Hanger();       
        System.out.println("Hanger Material: " + hanger.material);       
        System.out.println("Hanger Capacity: " + hanger.capacity);       
        System.out.println("Hanger Width: " + hanger.width);       
        System.out.println("Hanger Has Hooks: " + hanger.hasHooks);        

        hanger.material = "Wood";       
        hanger.capacity = 10;       
        hanger.width = 15.5;       
        hanger.hasHooks = true;        

        System.out.println("Updated Hanger Material: " + hanger.material);       
        System.out.println("Updated HangerCapacity: " + hanger.capacity);       
        System.out.println("Updated Hanger Width: " + hanger.width);       
        System.out.println("Updated Hanger Has Hooks: " + hanger.hasHooks);   
    } 
}
