public class hcf {
    public static void main(String[] args) {
        int num1 = 36, num2 = 60, hcf = 1;

        for(int i = 1; i <= num1 && i <= num2; ++i) {
            if(num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.printf("HCF of %d and %d is: %d", num1, num2, hcf);
    }
}
