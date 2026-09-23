import java.util.Scanner;
class armstrong{
   static boolean isArmstrong(int n){
     int  sum=0;
       int original = n;
       while (n>0){
          int digit = n%10;
           sum = sum + digit*digit*digit ;
         n = n/10;
       }
       return sum==original;
   }
}
   public class main{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number:" );
       int n = sc.nextInt();
       if(armstrong.isArmstrong(n))
           System.out.print("Armstrong");
           sc.close();
       
   }
    }   