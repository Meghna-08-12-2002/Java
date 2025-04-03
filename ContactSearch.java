class ContactSearch{
	public static long getMobileByEmail(String email){
		System.out.println("running getMobileByEmail in ContactSearch");
		
		long contact=0;
		
		if(email=="shalini123@gmail.com"){
			contact=9638527411L;
			System.out.println("for email: "+email);
			return contact;
		}
		else if(email=="radha234@gmail.com"){
			System.out.println("for email: "+email);
			contact=9876541233L;
			return contact;
		}
		else if(email=="KavyaN345@gmail.com"){
			System.out.println("for email: "+email);
			contact=9742587411L;
			return contact;
		}
		else if(email=="madhu02@gmail.com"){
			System.out.println("for email: "+email);
			contact=8944478523L;
			return contact;
		}
		else if(email=="nandinikadapa@gmail.com"){
			System.out.println("for email: "+email);
			contact=8336346278L;
			return contact;
			
		}
		else if(email=="Adyass342@gmail.com"){
			System.out.println("for email: "+email);
			contact=8886508813L;
			return contact;
		}
		else if(email=="parvati987sw@gmail.com"){
			System.out.println("for email: "+email);
			contact=9822543210L;
			return contact;
		}
		else if(email=="nikithanayak@gmail.com"){
			System.out.println("for email: "+email);
			contact=8976773210L;
			return contact;
		}
		else if(email=="Namitakrishna@gmail.com"){
			System.out.println("for email: "+email);
			contact=7888543210L;
			return contact;			
		}
		else if(email=="mahimanya678@gmail.com"){
			System.out.println("for email: "+email);
			contact=6365612334L;
			return contact;
		}
		else if(email=="BharathiT34@gmail.com"){
			System.out.println("for email: "+email);
			contact=6681234597L;
			return contact;
		}
		else if(email=="Jaina89@gmail.com"){
			System.out.println("for email: "+email);
			contact=7250123456L;
			return contact;
		}
		else if(email=="Ramyakrishnan@rediffmail.com"){
			System.out.println("for email: "+email);
			contact=9891954310L;
			return contact;			
		}
		else if(email=="RachitaramBindhu@gmail.com"){
			System.out.println("for email: "+email);
			contact=8745412345L;
			return contact;
		}
		else if(email=="Sonalmethero@gmail.com"){
			System.out.println("for email: "+email);
			contact=7561234560L;
			return contact;
		}
		else{
			System.out.println("contact not found for this email..");
		}
		return contact;
	}
	
	public static String getEmailByName(String name){
		System.out.println("running getEmailByName in ContactSearch");
		String email="";
		if(name=="Shalini"){
			System.out.println("email ID for "+name+" is ");
			email="shalini123@gmail.com";
			return email;
		}
		else if(name=="Radha"){
			System.out.println("email ID for "+name+" is ");
			email="radha234@gmail.com";
			return email;
		}
		else if(name=="KavyaN"){
			System.out.println("email ID for "+name+" is ");
			email="KavyaN345@gmail.com";
			return email;
		}
		else if(name=="Madhu"){
			System.out.println("email ID for "+name+" is ");
			email="madhu02@gmail.com";
			return email;
		}
		else if(name=="Nandhi"){
			System.out.println("email ID for "+name+" is ");
			email="nandinikadapa@gmail.com";
			return email;
		}
		else if(name=="Adya"){
			System.out.println("email ID for "+name+" is ");
			email="Adyass342@gmail.com";
			return email;
		}
		else if(name=="Parvati"){
			System.out.println("email ID for "+name+" is ");
			email="parvati987sw@gmail.com";
			return email;
		}
		else if(name=="Nikitha"){
			System.out.println("email ID for "+name+" is ");
			email="nikithanayak@gmail.com";
			return email;
		}
		else if(name=="Namita"){
			System.out.println("email ID for "+name+" is ");
			email="Namitakrishna@gmail.com";
			return email;
		}
		else if(name=="Mahimanya"){
			System.out.println("email ID for "+name+" is ");
			email="mahimanya678@gmail.com";
			return email;
		}
		else if(name=="BharathiT"){
			System.out.println("email ID for "+name+" is ");
			email="BharathiT34@gmail.com";
			return email;
		}
		else if(name=="Jaina"){
			System.out.println("email ID for "+name+" is ");
			email="Jaina89@gmail.com";
			return email;
		}
		else if(name=="Ramyakrishnan"){
			System.out.println("email ID for "+name+" is ");
			email="Ramyakrishnan@rediffmail.com";
			return email;
		}
		else if(name=="RachitaramBindhu"){
			System.out.println("email ID for "+name+" is ");
			email="RachitaramBindhu@gmail.com";
			return email;
		}
		else if(name=="Sonalmethero"){
			System.out.println("email ID for "+name+" is ");
			email="Sonalmethero@gmail.com";
			return email;
		}
		else{
			System.out.println("email not found for "+name);
		}
		return email;
	}
	
	public static String[] searchByLastName(String lastName){
		System.out.println("running searchByLastName in ContactSearch");
		
		String name1="Kareena Kapoor";
		String name2="Karishma Kapoor";
		String name3="Ranbir Kapoor";
		String name4="Anil Kapoor";
		String name5="Sonam Kapoor";
		String name6="Rohit Sharma";
		String name7="Anushka Sharma";
		String name8="Kapil Sharma";
		String name9="Sneha Sharma";
		String name10="Bhavana Sharma";
		String name11="Suneil Shetty";
		String name12="Shilpa Shetty";
		String name13="Athiya Shetty";
		String name14="Soundarya Shetty";
		String name15="Keerthi Shetty";
		
		String[] names={name1,name2,name3,name4,name5,name6,name7, name8, name9,name10,name11,name12, name13, name14, name15};
		
		
		String[] newArr={"","","","",""};
		int i=0;
		for(int j=0;j<newArr.length;){
			if(names[i].endsWith(lastName)){
				newArr[j]=names[i];
				j++;
			}
			i++;
		}
		return newArr;
		
		
	}
}