import java.util.Scanner;
class LcmMethod{
    int a,b,remainder;
    static int findgcd(int a,int b){
        int remainder;
        for(remainder=a%b;remainder!=0;remainder=a%b){
        a=b;
        b=remainder;
        remainder=a%b;
    }
        return a;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a =s.nextInt();
        System.out.print("Enter second number:");
        int b =s.nextInt();
        LcmMethod.findgcd(a,b);
        s.close();
        
    }
    
     }
