public class FindFactorial{
    public static void main(String[] args) {
        int number = 5; // The number to find the factorial of
        long factorial = 1;

        // Loop from 1 to the given number
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiplies factorial by i
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

