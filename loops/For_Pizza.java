import java.util.Scanner;

class For_Pizza {
    public static void main(String args[]) {
        float jan = 0, feb = 0, mar = 0, apr = 0, may = 0, jun = 0;
        float tot = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pizzas sold in January: ");
        jan = sc.nextFloat();
        System.out.println("Enter the number of pizzas sold in February: ");
        feb = sc.nextFloat();
        System.out.println("Enter the number of pizzas sold in March: ");
        mar = sc.nextFloat();
        System.out.println("Enter the number of pizzas sold in April: ");
        apr = sc.nextFloat();
        System.out.println("Enter the number of pizzas sold in May: ");
        may = sc.nextFloat();
        System.out.println("Enter the number of pizzas sold in June: ");
        jun = sc.nextFloat();
        tot = jan + feb + mar + apr + may + jun;
        System.out.println("Total number of pizzas sold in 6 months: " + tot);
        System.out.println("Average number of pizzas sold per month: " + tot / 6);
        // this is a comment

    }

}
