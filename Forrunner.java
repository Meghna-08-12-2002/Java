class Forrunner {
    public static void main(String[] args) {
        String shirt1 = "Puma";
        String shirt2 = "Nike";
        String shirt3 = "Reebok";
        String shirt4 = "Levi's";
        String shirt5 = "Adidas";
		
		int clip1=1;
		int clip2=7;
		int clip3=9;
		int clip4=4;
		int clip5=3;
		
		String paint1="Asian Paints";
		String paint2="Berger Paints";
		String paint3="Dulux";
		String paint4="Nerolac";
		String paint5="Jotun";
		
		String wire1="Conductivity";
		String wire2="Material";
		String wire3="Insulation";
		String wire4="Resistance";
		String wire5="Flexibility";
		
		String wall1="Finish ";
		String wall2="Moisture Resistance";
		String wall3="Strength ";
		String wall4="Durability ";
		String wall5="Smart Features";
		
        char paper1='A';
        char paper2='?';
		char paper3='f';
		char paper4='!';
		char paper5='@';
		
		float poster1=0.1f;
		float poster2=5.1f;
		float poster3=2.3f;
		float poster4=3.3f;
		float poster5=2.70f;
		
		String wallet1="Full-Grain Leather";
		String wallet2="Top-Grain Leather ";
		String wallet3="Genuine Leather";
		String wallet4="Suede Leather";
		String wallet5="Patent Leather";
		
	String[] items = {
    shirt1, shirt2, shirt3, shirt4, shirt5,
    String.valueOf(clip1), String.valueOf(clip2), String.valueOf(clip3),
    String.valueOf(clip4), String.valueOf(clip5),
    paint1, paint2, paint3, paint4, paint5,
    wire1, wire2, wire3, wire4, wire5,
    String.valueOf(paper1), String.valueOf(paper2), String.valueOf(paper3),
    String.valueOf(paper4), String.valueOf(paper5),
    String.valueOf(poster1), String.valueOf(poster2), String.valueOf(poster3),
    String.valueOf(poster4), String.valueOf(poster5),
    wallet1, wallet2, wallet3, wallet4, wallet5
};


        for (int index = 0; index < items.length; index++) {
            System.out.println("Index: " + index + ", Value: " + items[index]);
        }
    }
}