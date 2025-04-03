class ProductSearchRunner{
	public static void main(String[] args){
		double price1=ProductSearch.getPriceByProduct("Shampoo");
		System.out.println("price : "+price1);
		
		double price2=ProductSearch.getPriceByProduct("Soap");
		System.out.println("price : "+price2);
		
		double price3=ProductSearch.getPriceByProduct("Rice");
		System.out.println("price : "+price3);
		
		double price4=ProductSearch.getPriceByProduct("Wheat Flour");
		System.out.println("price : "+price4);
		
		double price5=ProductSearch.getPriceByProduct("Sugar");
		System.out.println("price : "+price5);
		
		double price6=ProductSearch.getPriceByProduct("Salt");
		System.out.println("price : "+price6);
		
		double price7=ProductSearch.getPriceByProduct("Cooking Oil");
		System.out.println("price : "+price7);
		
		double price8=ProductSearch.getPriceByProduct("Milk");
		System.out.println("price : "+price8);
		
		double price9=ProductSearch.getPriceByProduct("Egg");
		System.out.println("price : "+price9);
		
		double price10=ProductSearch.getPriceByProduct("Bread");
		System.out.println("price : "+price10);
		
		double price11=ProductSearch.getPriceByProduct("Butter");
		System.out.println("price : "+price11);
		
		double price12=ProductSearch.getPriceByProduct("Cheese");
		System.out.println("price : "+price12);
		
		double price13=ProductSearch.getPriceByProduct("Biscuit");
		System.out.println("price : "+price13);
		
		double price14=ProductSearch.getPriceByProduct("Noodles");
		System.out.println("price : "+price14);
		
		double price15=ProductSearch.getPriceByProduct("Soft Drink");
		System.out.println("price : "+price15);
		
		double price16=ProductSearch.getPriceByProduct("Tea");
		System.out.println("price : "+price16);
		
		double price17=ProductSearch.getPriceByProduct("Coffee");
		System.out.println("price : "+price17);
		
		double price18=ProductSearch.getPriceByProduct("Toothpaste");
		System.out.println("price : "+price18);
		
		double price19=ProductSearch.getPriceByProduct("Detergent Powder");
		System.out.println("price : "+price19);
		
		double price20=ProductSearch.getPriceByProduct("Toilet Paper");
		System.out.println("price : "+price20);
		
		double price21=ProductSearch.getPriceByProduct("Vegetables");
		System.out.println("price : "+price21);
		
		double price22=ProductSearch.getPriceByProduct("Fruits");
		System.out.println("price : "+price22);
		
		double price23=ProductSearch.getPriceByProduct("Chair");
		System.out.println("price : "+price23);
		
		
		//brand by product
		
		String[] brands1=ProductSearch.getBrandsByProduct("Rice");
		for(String brand:brands1){
			System.out.println(brand);
		}
		
		String[] brands2= ProductSearch.getBrandsByProduct("Wheat Flour");
        for (String brand : brands2) {
            System.out.println(brand);
        }

        String[] brands3 = ProductSearch.getBrandsByProduct("Sugar");
        for (String brand : brands3) {
            System.out.println(brand);
        }

        String[] brands4 = ProductSearch.getBrandsByProduct("Salt");
        for (String brand : brands4) {
            System.out.println(brand);
        }

        String[] brands5 = ProductSearch.getBrandsByProduct("Cooking Oil");
        for (String brand : brands5) {
            System.out.println(brand);
        }

        String[] brands6 = ProductSearch.getBrandsByProduct("Milk");
        for (String brand : brands6) {
            System.out.println(brand);
        }

        String[] brands7= ProductSearch.getBrandsByProduct("Egg");
        for (String brand : brands7) {
            System.out.println(brand);
        }

        String[] brands8= ProductSearch.getBrandsByProduct("Bread");
        for (String brand : brands8) {
            System.out.println(brand);
        }

        String[] brands9= ProductSearch.getBrandsByProduct("Butter");
        for (String brand : brands9) {
            System.out.println(brand);
        }

        String[] brands10= ProductSearch.getBrandsByProduct("Cheese");
        for (String brand : brands10) {
            System.out.println(brand);
        }

        String[] brands11= ProductSearch.getBrandsByProduct("Biscuit");
        for (String brand : brands11) {
            System.out.println(brand);
        }

        String[] brands12 = ProductSearch.getBrandsByProduct("Noodles");
        for (String brand : brands12) {
            System.out.println(brand);
        }

        String[] brands13 = ProductSearch.getBrandsByProduct("Soft Drink");
        for (String brand : brands13) {
            System.out.println(brand);
        }

        String[] brands14 = ProductSearch.getBrandsByProduct("Tea");
        for (String brand : brands14) {
            System.out.println(brand);
        }

        String[] brands15 = ProductSearch.getBrandsByProduct("Coffee");
        for (String brand : brands15) {
            System.out.println(brand);
        }

        String[] brands16 = ProductSearch.getBrandsByProduct("Shampoo");
        for (String brand : brands16) {
            System.out.println(brand);
        }

        String[] brands17 = ProductSearch.getBrandsByProduct("Soap");
        for (String brand : brands17) {
            System.out.println(brand);
        }

        String[] brands18 = ProductSearch.getBrandsByProduct("Toothpaste");
        for (String brand : brands18) {
            System.out.println(brand);
        }

        String[] brands19 = ProductSearch.getBrandsByProduct("Detergent Powder");
        for (String brand : brands19) {
            System.out.println(brand);
        }

        String[] brands20 = ProductSearch.getBrandsByProduct("Toilet Paper");
        for (String brand : brands20) {
            System.out.println(brand);
        }

        String[] brands21 = ProductSearch.getBrandsByProduct("Vegetables");
        for (String brand : brands21) {
            System.out.println(brand);
        }

        String[] brands22 = ProductSearch.getBrandsByProduct("Fruits");
        for (String brand : brands22) {
            System.out.println(brand);
        }

        String[] brands23 = ProductSearch.getBrandsByProduct("Ice cream");
        for (String brand : brands23){
            System.out.println(brand);
        }
		
        String[] brands24 = ProductSearch.getBrandsByProduct("Chocolates");
        for (String brand : brands24) {
            System.out.println(brand);
        }
		
		//check availability
		
		ProductSearch.searchProductAvailability("Rice");
        ProductSearch.searchProductAvailability("Wheat Flour");
        ProductSearch.searchProductAvailability("Sugar");
        ProductSearch.searchProductAvailability("Salt");
        ProductSearch.searchProductAvailability("Cooking Oil");
        ProductSearch.searchProductAvailability("Milk");
        ProductSearch.searchProductAvailability("Eggs");
        ProductSearch.searchProductAvailability("Bread");
        ProductSearch.searchProductAvailability("Butter");
        ProductSearch.searchProductAvailability("Cheese");
        ProductSearch.searchProductAvailability("Biscuits");
        ProductSearch.searchProductAvailability("Noodles");
        ProductSearch.searchProductAvailability("Soft Drinks");
        ProductSearch.searchProductAvailability("Tea");
        ProductSearch.searchProductAvailability("Coffee");
        ProductSearch.searchProductAvailability("Shampoo");
        ProductSearch.searchProductAvailability("Soap");
        ProductSearch.searchProductAvailability("Toothpaste");
        ProductSearch.searchProductAvailability("Detergent Powder");
        ProductSearch.searchProductAvailability("Toilet Paper");
        ProductSearch.searchProductAvailability("Vegetables");
        ProductSearch.searchProductAvailability("Fruits");
        ProductSearch.searchProductAvailability("Ice Cream");
		ProductSearch.searchProductAvailability("Towels");
	}
}