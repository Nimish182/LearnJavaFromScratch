import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of rows:");
        // int n = sc.nextInt(); // no of rows
        // System.out.println("Enter the number of columns:");
        // int m = sc.nextInt(); // no of columns
        // outer loop for rows
        int n = 4; // no of rows
        int m = 5; // no of columns
        for (int i = 1; i <= n; i++) {
            // inner loop for columns
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) // first and last row and column
                    System.out.print("*");
                else {
                    System.out.print(" ");      // here we print space for hollow rectangle
                }

            }
            System.out.println();
        }
    }
}
