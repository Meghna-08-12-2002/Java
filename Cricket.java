 class Cricket {
    
    public static void matchdetails(String dayname, String... playerNames) {
        System.out.println("Day name is: " + dayname);
        for (String player : playerNames) {
            System.out.println("Player Name: " + player);
        }  
    }

    public static void matchdetails(String dayname, int no_of_matches, int totalruns, String... playerNames) {
        float avgScore = (float) totalruns / no_of_matches;
        System.out.println("Day name is: " + dayname + ", Matches: " + no_of_matches +
                ", Total Runs: " + totalruns + ", Average Score: " + avgScore);
        for (String player : playerNames) {
            System.out.println("Player Name: " + player);
        }
    }

    public static void matchdetails(String dayname, int no_of_matches, int[] scores, String... playerNames) {
        System.out.println("Day name is: " + dayname);
        for (int i = 0; i < playerNames.length; i++) {
            float avg = (float) scores[i] / no_of_matches;
            System.out.println("Player: " + playerNames[i] + ", Matches: " + no_of_matches + ", Avg Score: " + avg);
        } 
    }
}
