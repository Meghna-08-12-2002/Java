class CricketRunner {
    
    public static void main(String[] args) {
        
        Cricket.matchdetails("Monday", "Dhoni", "Virat", "Rohit");

        Cricket.matchdetails("Tuesday", 10, 500, "Dhoni", "Virat");

        int[] scores = {500, 600, 450};
        Cricket.matchdetails("Wednesday", 10, scores, "Dhoni", "Virat", "Rohit");
    }
}

  
  