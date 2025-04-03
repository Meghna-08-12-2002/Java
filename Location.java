class Location{
public static void main(String values[]){

        String location1 = "Warehouse";         
        String location2 = "Mall";         
        String location3 = "Supermarket";         
        String location4 = "Library";         
        String location5 = "Pharmacy";         
        String location6 = "Bank";         
        String location7 = "School";         
        String location8 = "Hospital";         
        String location9 = "Airport";         
        String location10 = "Train Station";         
        String location11 = "Bus Stop";         
        String location12 = "Cafe";         
        String location13 = "Restaurant";         
        String location14 = "Gym";         
        String location15 = "Post Office";         
        String location16 = "Park";         
        String location17 = "Museum";         
        String location18 = "Cinema";         
        String location19 = "Hotel";         
        String location20 = "Stadium";         
         

        String[] locations = {location1, location2, location3, location4, location5, location6, location7, 
                      location8, location9, location10, location11, location12, location13, location14, 
                      location15, location16, location17, location18, location19, location20};         

        String ref = locations[9]; 		
        System.out.println("locations index 9: " + ref); 		
        locations[7] = "Harbor"; 		
        System.out.println("location3 index 7: " + locations[7]); 

 }
}