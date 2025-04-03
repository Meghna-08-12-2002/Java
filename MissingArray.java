class MissingArray {   
    public static void main(String[] args) {       
        int[] num = {1, 3, 5, 7, 9};       

        for (int i = 0; i <= 9; i++) {  
            boolean check = false;
            for (int n : num) {  
                if (n == i) {  
                check=true;
                }
            }
            if(check==false) {  
                System.out.println("missingnum: " + i);  
            }  
        }  
    }  
}
