class IronBoxRunner {   
    public static void main(String[] args) {       
        IronBox ironBox = new IronBox();       
        System.out.println("IronBox Brand: " + ironBox.brand);       
        System.out.println("IronBox Power: " + ironBox.power);       
        System.out.println("IronBox Has Steam: " + ironBox.hasSteam);       
        System.out.println("IronBox Weight: " + ironBox.weight);        

        ironBox.brand = "Philips";       
        ironBox.power = 1200;       
        ironBox.hasSteam = true;       
        ironBox.weight = 1.5;        

        System.out.println("Updated IronBox Brand: " + ironBox.brand);       
        System.out.println("Updated IronBox Power: " + ironBox.power);       
        System.out.println("Updated IronBox Has Steam: " + ironBox.hasSteam);       
        System.out.println("Updated IronBox Weight: " + ironBox.weight);   
    } 
}
