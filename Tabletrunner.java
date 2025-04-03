public class Tabletrunner {
    public static void main(String[] args) {
		System.out.println("Details of Tablet:");
        Tablet.detail(100, "Ibuprofen", "Dr.Rahul", false);  
        Tablet.detail(200, "Amoxicillin", "Dr.Sneha", true);  
        Tablet.detail(300, "Cetrizine", "Dr.Amit", false);  
        Tablet.detail(800, "Metformin", "Dr.Priya", true);  
        Tablet.detail(900, "Omeprazole", "Dr.Kavita", true);

		
    }
}
