import java.util.*;

public class Tables_While {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(i * n);
            i++;
        }

    }

}
