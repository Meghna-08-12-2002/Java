class ReverseArray{

 public static void main(String[] args){
 
  int[] arr={9,8,7,6,5,4,3,2};
  int k=2;
  k=k%arr.length;
  int[] temp=new int[arr.length];
  for(int i=0;i<arr.length;i++){
  temp[i]=arr[(i+k)%arr.length];
 }
  System.out.println("Reverse Array is:");
  for(int num:temp){
	System.out.println(num+"");
  }
 }
}
