import java.util.*;

class Tables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the no. for which you want table");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }

    }

}
