import java.util.*;

class Multiplication_Func {
    public static int calculateMul(int a, int b) {
        return a * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        // int sum = calculateMul(a, b); // Calling the function to calculate sum
        System.out.println("Sum of two numbers is: " + calculateMul(a, b));
    }

}
