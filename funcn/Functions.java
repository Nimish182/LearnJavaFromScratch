import java.util.*;

class Functions {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();

        int sum = calculateSum(a, b); // Calling the function to calculate sum
        System.out.println("Sum of two numbers is: " + sum);
    }

}
