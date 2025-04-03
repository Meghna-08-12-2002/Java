class ProductSearch{
	public static double getPriceByProduct(String productName){
		double price;
		if(productName=="Soap"){
			price=40.90;
			return price;
		}
		else if(productName=="Shampoo"){			
			return price=100;
		}
		else if(productName=="Rice"){
			return price=60;
		}
		else if(productName=="Wheat Flour"){
			return price=40;
		}
		else if(productName=="Sugar"){
			return price=45;
		}
		else if(productName=="Salt"){
			return price=20;
		}
		else if(productName=="Cooking Oil"){
			return price=120;
		}
		else if(productName=="Milk"){
			return price=50;
		}
		else if(productName=="Egg"){
			return price=70;
		}
		else if(productName=="Bread"){
			return price=50;
		}
		else if(productName=="Butter"){
			return price=249.99;
		}
		else if(productName=="Cheese"){
			return price=129.99;
		}
		else if(productName=="Biscuit"){
			return price=20;
		}
		else if(productName=="Noodles"){
			return price=24.99;
		}
		else if(productName=="Soft Drink"){
			return price=80;
		}
		else if(productName=="Tea"){
			return price=20;
		}
		else if(productName=="Coffee"){
			return price=20;
		}
		else if(productName=="Toothpaste"){
			return price=129.99;
		}
		else if(productName=="Detergent Powder"){
			return price=119.99;
		}
		else if(productName=="Toilet Paper"){
			return price=49.99;
		}
		else if(productName=="Vegetables"){
			return price=400;
		}
		else if(productName=="Fruits"){
			return price=300;
		}
		else{
			System.out.println("product not found");
			return 0;
		}
	}
	
	public static String[] getBrandsByProduct(String productName){
        // Defining arrays for each product and their brands
        String[] brands1= {"India Gate", "Daawat", "Kohinoor", "Fortune", "Lal Qilla"};
        String[] brands2= {"Aashirvaad", "Pillsbury", "Annapurna", "Fortune", "Shakti Bhog"};
        String[] brands3= {"Mawana", "Dhampur", "Trust", "Madhur", "Uttam"};
        String[] brands4= {"Tata Salt", "Aashirvaad Salt", "Catch", "Annapurna", "Saffola"};
        String[] brands5= {"Fortune", "Saffola", "Dhara", "Sundrop", "Nature Fresh"};
        String[] brands6= {"Amul", "Mother Dairy", "Nandini", "Nestlé", "Aavin"};
        String[] brands7= {"Suguna", "Venky's", "Skylark", "Godrej", "Nutrich"};
        String[] brands8= {"Amul", "Britannia", "Mother Dairy", "President", "Verka"};
        String[] brands9= {"Amul", "Britannia", "Go Cheese", "Mother Dairy", "Kraft"};
        String[] brands10= {"Parle-G", "Britannia", "Sunfeast", "Marie Gold", "Oreo"};
        String[] brands11= {"Maggi", "Yippee", "Ching's Secret", "Top Ramen", "Wai Wai"};
        String[] brands12= {"Coca-Cola", "Pepsi", "Thums Up", "Sprite", "Fanta"};
        String[] brands13= {"Tata Tea", "Brooke Bond Red Label", "Wagh Bakri", "Lipton", "Girnar"};
        String[] brands14= {"Nescafé", "Bru", "Continental Coffee", "Tata Coffee", "Davidoff"};
        String[] brands15= {"Dove", "Pantene", "Head & Shoulders", "L'Oréal Paris", "Clinic Plus"};
        String[] brands16= {"Lux", "Dove", "Pears", "Santoor", "Dettol"};
        String[] brands17= {"Colgate", "Pepsodent", "Sensodyne", "Close-Up", "Dabur Red"};
        String[] brands18= {"Surf Excel", "Ariel", "Tide", "Nirma", "Ghadi"};
        String[] brands19= {"Origami", "Selpak", "Scott", "Softex", "Paseo"};
        String[] brands20= {"Otipy", "BigBasket Fresh", "Ninjacart", "Nature’s Basket", "Reliance Fresh"};
        String[] brands21= {"FreshToHome", "BigBasket", "Amazon Fresh", "Reliance Fresh", "Mother Dairy"};
        String[] brands22= {"Amul", "Kwality Walls", "Vadilal", "Havmor", "Naturals"};
        String[] brands23= {"Cadbury", "Nestlé", "Ferrero Rocher", "Amul", "Hershey’s"};
        String[] brands24= {"Britannia", "Harvest Gold", "Modern", "English Oven", "Nature’s Own"};
		
		if(productName=="Rice"){
			System.out.println("brands for product "+productName);
			return brands1;
		}
		else if(productName=="Wheat Flour"){
			System.out.println("brands for product "+productName);
			return brands2;
		}
		else if(productName=="Sugar"){
			System.out.println("brands for product "+productName);
			return brands3;
		}
		else if(productName=="Salt"){
			System.out.println("brands for product "+productName);
			return brands4;
		}
		else if(productName=="Cooking Oil"){
			System.out.println("brands for product "+productName);
			return brands5;
		}
		else if(productName=="Milk"){
			System.out.println("brands for product "+productName);
			return brands6;
		}
		else if(productName=="Egg"){
			System.out.println("brands for product "+productName);
			return brands7;
		}
		else if(productName=="Bread"){
			System.out.println("brands for product "+productName);
			return brands24;
		}
		else if(productName=="Butter"){
			System.out.println("brands for product "+productName);
			return brands8;
		}
		else if(productName=="Cheese"){
			System.out.println("brands for product "+productName);
			return brands9;
		}
		else if(productName=="Biscuit"){
			System.out.println("brands for product "+productName);
			return brands10;
		}
		else if(productName=="Noodles"){
			System.out.println("brands for product "+productName);
			return brands11;
		}
		else if(productName=="Soft Drink"){
			System.out.println("brands for product "+productName);
			return brands12;
		}
		else if(productName=="Tea"){
			System.out.println("brands for product "+productName);
			return brands13;
		}
		else if(productName=="Coffee"){
			System.out.println("brands for product "+productName);
			return brands14;
		}
		else if(productName=="Toothpaste"){
			System.out.println("brands for product "+productName);
			return brands17;
		}
		else if(productName=="Detergent Powder"){
			System.out.println("brands for product "+productName);
			return brands18;
		}
		else if(productName=="Toilet Paper"){
			System.out.println("brands for product "+productName);
			return brands19;
		}
		else if(productName=="Vegetables"){
			System.out.println("brands for product "+productName);
			return brands20;
		}
		else if(productName=="Fruits"){
			System.out.println("brands for product "+productName);
			return brands21;
		}
		else if(productName=="Soap"){
			System.out.println("brands for product "+productName);
			return brands16;
		}
		else if(productName=="Shampoo"){
			System.out.println("brands for product "+productName);
			return brands15;
		}
		else if(productName=="Ice cream"){
			System.out.println("brands for product "+productName);
			return brands22;
		}
		else if(productName=="Chocolates"){
			System.out.println("brands for product "+productName);
			return brands23;
		}
		else{
			System.out.println("product not found");
			return null;
		}
	}
	
	public static void searchProductAvailability(String product){
		if(product=="Rice") {
            System.out.println("Available");
        } 
		else if(product=="Wheat Flour") {
            System.out.println("Available");
        } 
		else if(product=="Sugar") {
            System.out.println("Available");
        } 
		else if(product=="Salt") {
            System.out.println("Available");
        } 
		else if(product=="Cooking Oil") {
            System.out.println("Available");
        } 
		else if(product=="Milk") {
            System.out.println("Available");
        } 
		else if(product=="Eggs") {
            System.out.println("Available");
        } 
		else if(product=="Bread") {
            System.out.println("Available");
        } 
		else if(product=="Butter") {
            System.out.println("Available");
        } 
		else if(product=="Cheese") {
            System.out.println("Available");
        } 
		else if(product=="Biscuits") {
            System.out.println("Available");
        } 
		else if(product=="Noodles") {
            System.out.println("Available");
        } 
		else if(product=="Soft Drinks") {
            System.out.println("Available");
        } 
		else if(product=="Tea") {
            System.out.println("Available");
        } 
		else if(product=="Coffee") {
            System.out.println("Available");
        } 
		else if(product=="Shampoo") {
            System.out.println("Available");
        } 
		else if(product=="Soap") {
            System.out.println("Available");
        } 
		else if(product=="Toothpaste") {
            System.out.println("Available");
        } 
		else if(product=="Detergent Powder") {
            System.out.println("Available");
        } 
		else if(product=="Toilet Paper") {
            System.out.println("Available");
        } 
		else if(product=="Vegetables") {
            System.out.println("Available");
        } 
		else if(product=="Fruits") {
            System.out.println("Available");
        } 
		else if(product=="Ice Cream") {
            System.out.println("Available");
        } 
		else{
            System.out.println("Not Available");
        }
	}
	
}