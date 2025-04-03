
class MethodRunner {
    public static void main(String[] args) {
		System.out.println("\nDetails of Syringe:\n");
        Syringe.details(100, "Ibuprofen", "Dr.Rahul");  
        Syringe.details(200, "Amoxicillin", "Dr.Sneha");  
        Syringe.details(300, "Cetrizine", "Dr.Amit");  
        Syringe.details(800, "Metformin", "Dr.Priya");  
        Syringe.details(900, "Omeprazole", "Dr.Kavita");
		
		System.out.println("\nInjection Details:\n");
        Syringe.inject("Paracetamol", 2, true);
        Syringe.inject("Insulin", 1, true);
        Syringe.inject("Antibiotic", 3, false);
        Syringe.inject("Vitamin B12", 1, true);
        Syringe.inject("Painkiller", 2, false);

		System.out.println("\nTablet Dissolution:\n");
        Tablet.dissolve("Water", 10, true);
        Tablet.dissolve("Saliva", 5, false);
        Tablet.dissolve("Gastric Juice", 15, true);
        Tablet.dissolve("Milk", 20, false);
        Tablet.dissolve("Alcohol", 12, true);
		
		System.out.println("\nTablet Cure:\n");
        Tablet.cure("Flu", 5);
        Tablet.cure("Cold", 3);
        Tablet.cure("Infection", 7);
        Tablet.cure("Allergy", 4);
        Tablet.cure("Cough", 6);
		
		System.out.println("\nPain Relief:\n");
        Tablet.killThePain("Headache", 7);
        Tablet.killThePain("Back Pain", 8);
        Tablet.killThePain("Toothache", 6);
        Tablet.killThePain("Joint Pain", 9);
        Tablet.killThePain("Muscle Pain", 5);
        
        System.out.println("\nTablet Reactions:\n");
        Tablet.react("Skin Rash", true);
        Tablet.react("Nausea", false);
        Tablet.react("Dizziness", true);
        Tablet.react("Swelling", false);
        Tablet.react("Itching", true);
		
		System.out.println("\nHelmate Details\n");
		Helmate.specs(201, "Steelbird", "Black", 1250.50f, true);  
        Helmate.specs(202, "Vega", "Red", 1550.75f, false);  
        Helmate.specs(203, "Studds", "Blue", 1850.00f, true);  
        Helmate.specs(204, "LS2", "White", 2550.90f, true);  
        Helmate.specs(205, "Axor", "Gray", 3250.30f, false);

		
		System.out.println("\nWheel Information:\n");
        Wheel.info("Michelin", "17 inches", "Radial", "Rubber", 120.50, 36, "MX200", true, "Black", 5);
        Wheel.info("Bridgestone", "18 inches", "Tubeless", "Rubber", 135.75, 40, "BT150", true, "Silver", 4);
        Wheel.info("Goodyear", "16 inches", "Bias", "Rubber", 110.30, 32, "GY500", false, "Gray", 3);
        Wheel.info("Pirelli", "19 inches", "Radial", "Rubber", 145.00, 42, "PZ900", true, "Black", 6);
        Wheel.info("Continental", "15 inches", "Bias", "Rubber", 100.00, 30, "CT800", false, "White", 2);
    
	    System.out.println("\nLatch Types and Prices:\n");
        Latch.typesWithPrice("Slide Bolt", 12.99);
        Latch.typesWithPrice("Spring Loaded", 15.49);
        Latch.typesWithPrice("Cam Latch", 9.75);
        Latch.typesWithPrice("Toggle Latch", 18.30);
        Latch.typesWithPrice("Gravity Latch", 14.60);
		
		System.out.println("\nSeller Details:\n");
        Glass.seller("ClearView Glass", "123 Glass St", "9876543210", "GLS12345", 4.7);
        Glass.seller("Crystal Optics", "45 Mirror Ave", "8765432109", "GLS67890", 4.9);
        Glass.seller("Shiny Panes", "78 Reflection Blvd", "7654321098", "GLS54321", 4.5);
        Glass.seller("Prism Traders", "90 Transparent Rd", "6543210987", "GLS98765", 4.6);
        Glass.seller("Elite Glassworks", "150 Clarity Ln", "5432109876", "GLS13579", 4.8);
        
        System.out.println("\nBuyer Details:\n");
        Glass.buyer("Alice Brown", "200 Elm St", "9876501234", "Window Glass, Mirrors", "Great quality products!");
        Glass.buyer("Bob Wilson", "310 Oak Ave", "8765012345", "Car Windshields, Lenses", "Very satisfied!");
        Glass.buyer("Charlie Green", "420 Maple Rd", "7650123456", "Decorative Glass, Panels", "Excellent craftsmanship!");
        Glass.buyer("David White", "530 Pine Ln", "6540123457", "Glass Doors, Shower Enclosures", "Fast delivery!");
        Glass.buyer("Emma Black", "640 Cedar Dr", "5430123458", "Glass Bottles, Art Pieces", "Will order again!");
        
		System.out.println("\nGun Details:\n");
        Gun.displayInfo("Glock 19", "9mm", "Glock", 0.67, 500.00, 15, "Polymer", true);
        Gun.displayInfo("Colt M1911", ".45 ACP", "Colt", 1.10, 850.50, 7, "Steel", true);
        Gun.displayInfo("Smith & Wesson Model 29", ".44 Magnum", "Smith & Wesson", 1.23, 1200.75, 6, "Stainless Steel", true);
        Gun.displayInfo("Remington 870", "12 Gauge", "Remington", 3.20, 450.99, 4, "Metal & Wood", true);
        Gun.displayInfo("AK-47", "7.62x39mm", "Kalashnikov Concern", 4.30, 1500.00, 30, "Steel & Wood", false);
    
	    System.out.println("\nBullet Details:\n");
        Bullet.displayInfo("Full Metal Jacket", 7.45, 9.0, "Winchester", 50);
        Bullet.displayInfo("Hollow Point", 6.80, 9.0, "Remington", 25);
        Bullet.displayInfo("Soft Point", 10.50, 7.62, "Hornady", 40);
        Bullet.displayInfo("Armor Piercing", 12.30, 5.56, "Federal", 30);
        Bullet.displayInfo("Tracer", 9.70, 5.56, "PMC", 20);
		
		System.out.println("\nEngine Details:\n");
		Engine.displayInfo("V8", 450, "Petrol", 4.7f, true, 8, "Liquid", "10.5:1", 32, "Aluminum", 
                    600.5, "Electronic", "Euro 6", false, 7000, "Direct", 92.5, 86.7, "Chain", 
                    "Wet Sump", true, "Rubber", "Twin-Scroll", 85.3, "Germany");         
        
        Engine.displayInfo("Inline-4", 150, "Diesel", 2.0f, false, 4, "Air", "16.0:1", 16, "Iron", 
                    320.0, "Mechanical", "BS6", false, 5000, "MPFI", 80.0, 90.0, "Belt", 
                    "Dry Sump", false, "Steel", "Single", 78.5, "Japan");         
        
        Engine.displayInfo("V6", 300, "Hybrid", 3.5f, true, 6, "Liquid", "11.2:1", 24, "Aluminum", 
                    450.7, "Electronic", "EPA", true, 6500, "Direct", 89.0, 92.3, "Chain", 
                    "Wet Sump", true, "Rubber", "Twin", 88.2, "USA");    
		Engine.displayInfo("Electric", 0, "Battery", 0.0f, false, 0, "Air", "N/A", 0, "Carbon Fiber", 
                    0.0, "None", "Zero Emissions", true, 15000, "None", 0.0, 0.0, "None", 
                    "None", false, "Aluminum", "None", 99.9, "Norway"); 
        
        Engine.displayInfo("W12", 600, "Petrol", 6.0f, true, 12, "Liquid", "9.8:1", 48, "Magnesium", 
                    900.2, "Electronic", "Euro 5", false, 6800, "Direct", 95.0, 87.5, "Chain", 
                    "Wet Sump", true, "Carbon Fiber", "Twin-Turbo", 89.1, "UK");     
					
		System.out.println("\nTile Details:\n");
        Tile.details("Kajaria", "Ceramic", "Porcelain", 25.50, "White");
        Tile.details("Somany", "Vitrified", "Granite", 30.75, "Gray");
        Tile.details("Johnson", "Mosaic", "Marble", 40.00, "Beige");
        Tile.details("Nitco", "Wooden", "Wood", 35.90, "Brown");
        Tile.details("Orientbell", "Terracotta", "Clay", 20.00, "Red");
		
		
		System.out.println("\nBomb Details\n");
		Bomb.details("Fragmentation", 5.0, "TNT", 50.0, true, "Time Fuse", 2.5, "RDX", "USA", false);
        Bomb.details("Incendiary", 3.5, "Thermite", 30.0, false, "Impact Fuse", 1.8, "Aluminum Powder", "UK", true);
        Bomb.details("High-Explosive", 10.0, "RDX", 100.0, true, "Electric Fuse", 3.0, "PETN", "Germany", false);
        Bomb.details("Smoke", 2.0, "Phosphorus", 20.0, false, "Burning Fuse", 4.5, "Sulfur", "Russia", true);
        Bomb.details("Cluster", 15.0, "C4", 200.0, true, "Proximity Fuse", 5.2, "HMX", "France", false);

		
		System.out.println("\nKey Details:\n");
        Key.details("Steel", "House Key", 6.5);
        Key.details("Brass", "Car Key", 5.0);
        Key.details("Aluminum", "Locker Key", 4.8);
        Key.details("Titanium", "Security Key", 7.2);
        Key.details("Copper", "Antique Key", 6.0);
		
		
				   
    }
}
