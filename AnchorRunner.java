class AnchorRunner {   
    public static void main(String[] args) {       
        Anchor anchor = new Anchor();       
        System.out.println("Anchor Type: " + anchor.type);       
        System.out.println("Anchor Weight: " + anchor.weight);       
        System.out.println("Anchor Material: " + anchor.material);       
        System.out.println("Anchor Is Rust Proof: " + anchor.isRustProof);        

        anchor.type = "Fluke";       
        anchor.weight = 15;       
        anchor.material = "Steel";       
        anchor.isRustProof = true;        

        System.out.println("Updated Anchor Type: " + anchor.type);       
        System.out.println("Updated Anchor Weight: " + anchor.weight);       
        System.out.println("Updated Anchor Material: " + anchor.material);       
        System.out.println("Updated Anchor Is Rust Proof: " + anchor.isRustProof);   
    } 
}
