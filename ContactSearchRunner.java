class ContactSearchRunner{
	public static void main(String... args){
				
		String email="shalini123@gmail.com";
		long contact1=ContactSearch.getMobileByEmail(email);
		System.out.println("contact: "+contact1);
		
		long contact2=ContactSearch.getMobileByEmail("radha234@gmail.com");
		System.out.println("contact: "+contact2);
		
		long contact3=ContactSearch.getMobileByEmail("KavyaN345@gmail.com");
		System.out.println("contact: "+contact3);
		
		long contact4=ContactSearch.getMobileByEmail("madhu02@gmail.com");
		System.out.println("contact: "+contact4);
		
		long contact5=ContactSearch.getMobileByEmail("nandinikadapa@gmail.com");
		System.out.println("contact: "+contact5);
		
		long contact6=ContactSearch.getMobileByEmail("Adyass342@gmail.com");
		System.out.println("contact: "+contact6);
		
		long contact7=ContactSearch.getMobileByEmail("parvati987sw@gmail.com");
		System.out.println("contact: "+contact7);
		
		long contact8=ContactSearch.getMobileByEmail("nikithanayak@gmail.com");
		System.out.println("contact: "+contact8);
		
		long contact9=ContactSearch.getMobileByEmail("Namitakrishna@gmail.com");
		System.out.println("contact: "+contact9);
		
		long contact10=ContactSearch.getMobileByEmail("mahimanya678@gmail.com");
		System.out.println("contact: "+contact10);
		
		long contact11=ContactSearch.getMobileByEmail("BharathiT34@gmail.com");
		System.out.println("contact: "+contact11);
		
		long contact12=ContactSearch.getMobileByEmail("Jaina89@gmail.com");
		System.out.println("contact: "+contact12);
		
		long contact13=ContactSearch.getMobileByEmail("Ramyakrishnan@rediffmail.com");
		System.out.println("contact: "+contact13);
		
		long contact14=ContactSearch.getMobileByEmail("RachitaramBindhu@gmail.com");
		System.out.println("contact: "+contact14);
		
		long contact15=ContactSearch.getMobileByEmail("Sonalmethero@gmail.com");
		System.out.println("contact: "+contact15);
		
		
		
		
		String email1=ContactSearch.getEmailByName("Shalini");
		System.out.println(email1);
		
		String email2=ContactSearch.getEmailByName("Radha");
		System.out.println(email2);
		
		String email3=ContactSearch.getEmailByName("KavyaN");
		System.out.println(email3);
		
		String email4=ContactSearch.getEmailByName("Madhu");
		System.out.println(email4);
		
		String email5=ContactSearch.getEmailByName("Nandhi");
		System.out.println(email5);
		
		String email6=ContactSearch.getEmailByName("Adya");
		System.out.println(email6);
		
		String email7=ContactSearch.getEmailByName("Parvati");
		System.out.println(email7);
		
		String email8=ContactSearch.getEmailByName("Nikitha");
		System.out.println(email8);
		
		String email9=ContactSearch.getEmailByName("Namita");
		System.out.println(email9);
		
		String email10=ContactSearch.getEmailByName("Mahimanya");
		System.out.println(email10);
		
		String email11=ContactSearch.getEmailByName("BharathiT");
		System.out.println(email11);
		
		String email12=ContactSearch.getEmailByName("Jaina");
		System.out.println(email12);
		
		String email13=ContactSearch.getEmailByName("Ramyakrishnan");
		System.out.println(email13);
		
		String email14=ContactSearch.getEmailByName("RachitaramBindhu");
		System.out.println(email14);
		
		String email15=ContactSearch.getEmailByName("Sonalmethero");
		System.out.println(email15);
							
		String[] lname1=ContactSearch.searchByLastName("Kapoor");
		for(String name:lname1){
			System.out.println(name);
		}
		
		
		String[] lname2=ContactSearch.searchByLastName("Sharma");
		for(String name:lname2){
			System.out.println(name);
		}
		
		
		String[] lname3=ContactSearch.searchByLastName("Shetty");
		for(String name:lname3){
			System.out.println(name);
		}
		

	}
}