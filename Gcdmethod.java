import java.util.Scanner;
class gcd{
    static void findgcd(int a,int b){
        int remainder;
        for(remainder=a%b;remainder!=0;remainder=a%b){
            a=b;
            b=remainder;
            remainder=a%b;
        }
        System.out.print("Gcd="+b);
    }
}
public class Gcdmethod{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter first number:");
        int a =s.nextInt();
        System.out.print("Enter second number:");
        int b =s.nextInt();
        gcd.findgcd(a,b);
        s.close();
    }
}
        
        
    
