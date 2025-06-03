import java.util.Scanner;

class Tables_DoWhile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println(i * n);
            i++;
        } while (i <= 10);
    }

}
