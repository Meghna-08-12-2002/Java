class CabSearchRunner{
	public static void main(String[] args){
		
		//get cost
		System.out.println(CabSearch.getCostBySourceAndDestination("Majestic","Brookefield"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Whitefield","Majestic"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Electronic City","Majestic"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Kempegowda International Airport","Majestic"));
		System.out.println(CabSearch.getCostBySourceAndDestination("HSR Layout","Silk Board"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Marathahalli","Electronic City"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Banshankari","Jayanagar"));
		System.out.println(CabSearch.getCostBySourceAndDestination("BTM Layout","Koramangala"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Yeshwanthpur","Hebbal"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Hebbal","Kengeri"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Silk Board","Whitefield"));
		System.out.println(CabSearch.getCostBySourceAndDestination("Electronic City","K. R. Market"));
		System.out.println(CabSearch.getCostBySourceAndDestination("K.R. Market","Electronic City"));
		
		//get distance
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Majestic","Brookefield"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Whitefield","Majestic"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Electronic City","Majestic"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Kempegowda International Airport","Majestic"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("HSR Layout","Silk Board"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Marathahalli","Electronic City"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Banshankari","Jayanagar"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("BTM Layout","Koramangala"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Yeshwanthpur","Hebbal"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Hebbal","Kengeri"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Silk Board","Whitefield"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Electronic City","K. R. Market"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("K.R. Market","Electronic City"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Brookefield","Majestic"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Majestic","Whitefield"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Majestic","Electronic City"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Majestic","Kempegowda International Airport"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Silk Board","HSR Layout"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Electronic City","Marathahalli"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Jayanagar","Banshankari"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Koramangala","BTM Layout"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Hebbal","Yeshwanthpur"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Kengeri","Hebbal"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Whitefield","Silk Board"));
		System.out.println(CabSearch.getDistanceBySourceAndDestination("Kaggadaspura","HAL"));
		
		CabSearch.searchAvailability("Brookefield");
		CabSearch.searchAvailability("Whitefield");
		CabSearch.searchAvailability("Electronic City");
		CabSearch.searchAvailability("Kempegowda International Airport");
		CabSearch.searchAvailability("HSR Layout");
		CabSearch.searchAvailability("Marathahalli");
		CabSearch.searchAvailability("Banashankari");
		CabSearch.searchAvailability("Jayanagar");
		CabSearch.searchAvailability("Yeshwanthpur");
		CabSearch.searchAvailability("Hebbal");
		CabSearch.searchAvailability("Kengeri");
		CabSearch.searchAvailability("BTM Layout");
		CabSearch.searchAvailability("Kaggadasapura");
		CabSearch.searchAvailability("Malleshpalaya");
		CabSearch.searchAvailability("C.V.Raman Nagar");
		CabSearch.searchAvailability("Kadugodi");
		CabSearch.searchAvailability("Yelahanka");
		CabSearch.searchAvailability("Jalahalli");
		CabSearch.searchAvailability("Kundalahalli");
		CabSearch.searchAvailability("Bellandur");
		CabSearch.searchAvailability("Goraguntepalaya");
		CabSearch.searchAvailability("Peenya");
		CabSearch.searchAvailability("Kadubeesanahalli");
		CabSearch.searchAvailability("Richmond Circle");
		CabSearch.searchAvailability("Sarjapura");
		CabSearch.searchAvailability("Siddapura");
		
		
	}
}