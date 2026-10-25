import java.util.Scanner;

public class FindLargest{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    System.out.print("Enter number of elements:");
        int n=s.nextInt();
    int[] arr=new int[n];
        System.out.print("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();}
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.print("largest="+largest);
   
        }
}
