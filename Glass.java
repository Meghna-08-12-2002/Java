class Glass {
    public static void seller(String name, String address, String contact, String license, double rating) {
        System.out.println("Seller Name: " + name + ", Address: " + address + ", Contact: " + contact + ", License: " + license + ", Rating: " + rating);
    }
    public static void buyer(String name, String address, String contact, String purchaseHistory, String feedback) {
        System.out.println("Buyer Name: " + name + ", Address: " + address + ", Contact: " + contact + ", Purchase History: " + purchaseHistory + ", Feedback: " + feedback);
    }
}