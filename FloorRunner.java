class FloorRunner {  
    public static void main(String[] args) {  
        Floor floor = new Floor(); 		
        System.out.println("Floor number: " + floor.number);  
        System.out.println("Floor Material: " + floor.material);  
        System.out.println("Floor Area: " + floor.area);  
        System.out.println("Floor Is Tiled: " + floor.isTiled);  

        floor.number = 9;  
        floor.material = "Marble";  
        floor.area = 250.5;  
        floor.isTiled = true;  

        System.out.println("Updated Floor number: " + floor.number);  
        System.out.println("Updated Floor Material: " + floor.material);  
        System.out.println("Updated Floor Area: " + floor.area);  
        System.out.println("Updated Floor Is Tiled: " + floor.isTiled);  
    }  
}  
