class Cab1Runner {
    public static void main(String[] args) {
        Cab1 cab1 = new Cab1("Model S", "Tesla", "Electric", "Red", 5, 500.0,
                true, true, false, 80000.0, 2023,
                "Automatic", "TS12345", true, 5,
                "John Doe", 4.9f, "Tesla Insurance", true, 12);

        Cab1 cab2 = new Cab1("Camry", "Toyota", "Petrol", "Black", 5, 15.0,
                true, true, false, 30000.0, 2022,
                "Automatic", "TN67890", false, 3,
                "Jane Smith", 4.5f, "State Farm", true, 10);

        Cab1 cab3 = new Cab1("Civic", "Honda", "Diesel", "White", 5, 20.0,
                true, false, false, 25000.0, 2021,
                "Manual", "KA34567", false, 2,
                "Robert Brown", 4.2f, "Geico", true, 8);

        System.out.println("Cab1 Details:");
        displayCabDetails(cab1);
        
        System.out.println("Updated Cab1 Details");
        displayCabDetails(cab2);
        
        System.out.println("Cab1 Details");
        displayCabDetails(cab3);
    }

    public static void displayCabDetails(Cab1 cab) {
        System.out.println("Model: " + cab.model);
        System.out.println("Brand: " + cab.brand);
        System.out.println("Fuel Type: " + cab.fuelType);
        System.out.println("Color: " + cab.color);
        System.out.println("Seating Capacity: " + cab.seatingCapacity);
        System.out.println("Mileage: " + cab.mileage + " km/l");
        System.out.println("Air Conditioning: " + cab.hasAirConditioning);
        System.out.println("GPS: " + cab.hasGPS);
        System.out.println("Sunroof: " + cab.hasSunroof);
        System.out.println("Price: ₹" + cab.price);
        System.out.println("Manufacturing Year: " + cab.manufacturingYear);
        System.out.println("Transmission: " + cab.transmissionType);
        System.out.println("Registration Number: " + cab.registrationNumber);
        System.out.println("Electric: " + cab.isElectric);
        System.out.println("Warranty: " + cab.warrantyPeriod + " years");
        System.out.println("Owner: " + cab.ownerName);
        System.out.println("Rating: " + cab.rating);
        System.out.println("Insurance Provider: " + cab.insuranceProvider);
        System.out.println("Music System: " + cab.hasMusicSystem);
        System.out.println("Service Interval: " + cab.serviceInterval + " months");
    }
}
