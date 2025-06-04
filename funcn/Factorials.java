import java.util.*;

class Factorials {
    public static void printFactorial(int n) {
        int fact = 1; // intialiazing with 1 as zero cannot be multiplied and factorial of 0 is also 1
        // loop
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return; // return statement to exit the function
        }
        for (int i = n; i >= 1; i--) {
            fact = fact * i; // multiplying the number with the factorial
        }

        System.out.println("Factorial of " + n + " is: " + fact);
        return; // return statement to exit the function

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = sc.nextInt();

        printFactorial(n);
    }

}
