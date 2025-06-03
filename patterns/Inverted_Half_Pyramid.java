import java.util.Scanner;

public class Inverted_Half_Pyramid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        // int n = 4;
        for (int i = n; i >= 1; i--) { // i-- means i is decreasing by 1 in each iteration
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}