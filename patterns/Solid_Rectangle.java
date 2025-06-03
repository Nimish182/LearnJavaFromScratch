import java.util.Scanner;

public class Solid_Rectangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt(); // no of rows
        System.out.println("Enter the number of columns:");
        int m = sc.nextInt(); // no of columns
        // outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for columns
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
