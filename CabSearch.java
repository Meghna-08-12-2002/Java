class CabSearch{
	public static int getCostBySourceAndDestination(String source,String destination){
		int cost=0;
		if(source=="Majestic" && destination=="Brookefield"){
			System.out.println("for "+source+" to "+destination+" the cost is");
			return cost=35;
		}
		else if(source=="Whitefield" && destination=="Majestic") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 40;
        } 
		else if(source=="Electronic City" && destination=="Majestic") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 45;
        } 
		else if(source=="Kempegowda International Airport" && destination=="Majestic") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 290;
        } 
		else if(source=="HSR Layout" && destination=="Silk Board") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 20;
        } 
		else if(source=="Marathahalli" && destination=="Electronic City") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 50;
        } 
		else if(source=="Banashankari" && destination=="Jayanagar") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 15;
        } 
		else if(source=="BTM Layout" && destination=="Koramangala") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 20;
        } 
		else if(source=="Yeshwanthpur" && destination=="Hebbal") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 25;
        } 
		else if(source=="Hebbal" && destination=="Kengeri") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 35;
        } 
		else if(source=="Silk Board" && destination=="Whitefield") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 45;
        } 
		else if(source=="Electronic City" && destination=="K.R. Market") {
			System.out.println("for "+source+" to "+destination+" the cost is");
            return cost = 30;
        }
		else{
			System.out.println("location not found");
		}
		return cost;
	}
	public static int getDistanceBySourceAndDestination(String source,String destination){
		int distance=0;
		
		if(source=="Majestic" && destination=="Brookefield") {
            return distance = 22;
        } 
		else if(source=="Whitefield" && destination=="Majestic") {
            return distance = 25;
        } 
		else if(source=="Electronic City" && destination=="Majestic") {
            return distance = 18;
        } 
		else if(source=="Kempegowda International Airport" && destination=="Majestic") {
            return distance = 40;
        } 
		else if(source=="HSR Layout" && destination=="Silk Board") {
            return distance = 3;
        } 
		else if(source=="Marathahalli" && destination=="Electronic City") {
            return distance = 20;
        } 
		else if(source=="Banashankari" && destination=="Jayanagar") {
            return distance = 4;
        } 
		else if(source=="BTM Layout" && destination=="Koramangala") {
            return distance = 5;
        } 
		else if(source=="Yeshwanthpur" && destination=="Hebbal") {
            return distance = 9;
        } 
		else if(source=="Hebbal" && destination=="Kengeri") {
            return distance = 28;
        } 
		else if(source=="Silk Board" && destination=="Whitefield") {
            return distance = 21;
        } 
		else if(source=="Electronic City" && destination=="K.R. Market") {
            return distance = 15;
        }
		//
		else if(destination=="Majestic" && source=="Brookefield") {
            return distance = 22;
        } 
		else if(destination=="Whitefield" && source=="Majestic") {
            return distance = 25;
        } 
		else if(destination=="Electronic City" && source=="Majestic") {
            return distance = 18;
        } 
		else if(destination=="Kempegowda International Airport" && source=="Majestic") {
            return distance = 40;
        } 
		else if(destination=="HSR Layout" && source=="Silk Board") {
            return distance = 3;
        } 
		else if(destination=="Marathahalli" && source=="Electronic City") {
            return distance = 20;
        } 
		else if(destination=="Banashankari" && source=="Jayanagar") {
            return distance = 4;
        } 
		else if(destination=="BTM Layout" && source=="Koramangala") {
            return distance = 5;
        } 
		else if(destination=="Yeshwanthpur" && source=="Hebbal") {
            return distance = 9;
        } 
		else if(destination=="Hebbal" && source=="Kengeri") {
            return distance = 28;
        } 
		else if(destination=="Silk Board" && source=="Whitefield") {
            return distance = 21;
        } 
		else if(destination=="Electronic City" && source=="K.R. Market") {
            return distance = 15;
        }
		else{
			System.out.println("location not found");
		}

        return distance;
		
	}
	public static void searchAvailability(String destination){
		
		if (destination=="Brookefield") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Whitefield") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Electronic City") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Kempegowda International Airport") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="HSR Layout") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Marathahalli") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Banashankari") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Jayanagar") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Yeshwanthpur") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Hebbal") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Kengeri") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="BTM Layout") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Kaggadasapura") {
            System.out.println("bus to "+destination+" is Available");
        }
		else if(destination=="Malleshpalaya") {
            System.out.println("bus to "+destination+" is Available");
        }
		else if(destination=="C.V.Raman Nagar") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Kadugodi") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Yelahanka") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Jalahalli") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Kundalahalli") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Bellandur") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Goraguntepalaya") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Peenya") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Kadubeesanahalli") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Richmond Circle") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Sarjapura") {
            System.out.println("bus to "+destination+" is Available");
        } 
		else if(destination=="Siddapura") {
            System.out.println("bus to "+destination+" is Available");
        }
		else {
            System.out.println("Not Available");
        }
	}
}