class Foreachrunner {
public static void main(String[] args) {
        String coin1 = "Gold Coin"; 
		String coin2 = "Silver Coin"; 
		String coin3 = "Bronze Coin"; 
		String coin4 = "Platinum Coin";
		String coin5 = "Copper Coin";
		
		double note1 = 10.5; 
		double note2 = 20.75; 
		double note3 = 50.25; 
		double note4 = 100.99; 
		double note5 = 500.50;

        String watch1 = "Smart Watch";
		String watch2 = "Analog";
		String watch3 = "Digital";
		String watch4 = "Luxury"; 
		String watch5 = "Sports";

        char camera1 = 'A'; 
		char camera2 = 'B'; 
		char camera3 = 'C'; 
		char camera4 = 'D'; 
		char camera5 = 'E';

        byte game1 = 1;
		byte game2 = 2; 
		byte game3 = 3; 
		byte game4 = 4; 
		byte game5 = 5;

        short bag1 = 100; 
		short bag2 = 250; 
		short bag3 = 500; 
		short bag4 = 750; 
		short bag5 = 1000;

        long pot1 = 10000L;
		long pot2 = 20000L;
		long pot3 = 30000L;
		long pot4 = 40000L; 
		long pot5 = 50000L;

        float router1 = 2.4f; 
		float router2 = 5.0f; 
		float router3 = 6.8f;
		float router4 = 8.2f;
		float router5 = 10.1f;
        
		String[] items = {
    String.valueOf(coin1), String.valueOf(coin2), String.valueOf(coin3), 
    String.valueOf(coin4), String.valueOf(coin5), 
    String.valueOf(note1), String.valueOf(note2), String.valueOf(note3), 
    String.valueOf(note4), String.valueOf(note5), 
    String.valueOf(watch1), String.valueOf(watch2), String.valueOf(watch3), 
    String.valueOf(watch4), String.valueOf(watch5), 
    String.valueOf(camera1), String.valueOf(camera2), String.valueOf(camera3), 
    String.valueOf(camera4), String.valueOf(camera5), 
    String.valueOf(game1), String.valueOf(game2), String.valueOf(game3), 
    String.valueOf(game4), String.valueOf(game5), 
    String.valueOf(bag1), String.valueOf(bag2), String.valueOf(bag3), 
    String.valueOf(bag4), String.valueOf(bag5), 
    String.valueOf(pot1), String.valueOf(pot2), String.valueOf(pot3), 
    String.valueOf(pot4), String.valueOf(pot5), 
    String.valueOf(router1), String.valueOf(router2), String.valueOf(router3), 
    String.valueOf(router4), String.valueOf(router5)
};

	int index = 0;  
    for (String item : items) {  
    System.out.println("Index: " + index + ", Value: " + item);  
    index++;  
}
    }
}