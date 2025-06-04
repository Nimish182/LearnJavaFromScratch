import java.util.Scanner;

class Sum {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers to calculate their sum:");
        // Taking input from the user
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b); // Calling the function to calculate sum
        System.out.println(sum);
    }

}
