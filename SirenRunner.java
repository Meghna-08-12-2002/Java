class SirenRunner {   
    public static void main(String[] args) {       
        Siren siren = new Siren();       
        System.out.println("Siren Sound Type: " + siren.soundType);       
        System.out.println("Siren Volume: " + siren.volume);       
        System.out.println("Siren Is Emergency: " + siren.isEmergency);       
        System.out.println("Siren Power Source: " + siren.powerSource);        

        siren.soundType = "Wailing";       
        siren.volume = 120;       
        siren.isEmergency = true;       
        siren.powerSource = "Battery";        

        System.out.println("Updated Siren Sound Type: " + siren.soundType);       
        System.out.println("Updated Siren Volume: " + siren.volume);       
        System.out.println("Updated Siren Is Emergency: " + siren.isEmergency);       
        System.out.println("Updated Siren Power Source: " + siren.powerSource);   
    } 
}
