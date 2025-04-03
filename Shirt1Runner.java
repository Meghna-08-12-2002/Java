class Shirt1Runner {
    public static void main(String[] args) {
        Shirt1 shirt = new Shirt1();
        
        System.out.println("Shirt1 Style: " + shirt.Style);
        System.out.println("Shirt1 Pattern: " + shirt.Pattern);
        System.out.println("Shirt1 Quantity: " + shirt.Quantity);
        System.out.println("Shirt1 Collar Type: " + shirt.collartype);
        System.out.println("Shirt1 Has Pocket: " + shirt.hasPocket);

        shirt.Style = "Casual";
        shirt.Pattern = "Striped";
        shirt.Quantity = 2;
        shirt.collartype = "Button-down";
        shirt.hasPocket = true;

        System.out.println("Updated Shirt1 Style: " + shirt.Style);
        System.out.println("Updated Shirt1 Pattern: " + shirt.Pattern);
        System.out.println("Updated Shirt1 Quantity: " + shirt.Quantity);
        System.out.println("Updated Shirt1 Collar Type: " + shirt.collartype);
        System.out.println("Updated Shirt1 Has Pocket: " + shirt.hasPocket);
    }
}
