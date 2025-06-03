import java.util.Scanner;

public class Do_While_Pizza {
    public static void main(String args[]) {
        char ch;
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Welcome to pizzeria");
            System.out.println("1. Know about latest offers");
            System.out.println("2. Place a delicious order");
            System.out.println("3. Know your order delivery status");
            System.out.println("4. Cancel your order");
            System.out.println("5. Feedback");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Latest offers are: 50% off on all pizzas");
                    break;
                case 2:
                    System.out.println("Select your pizza:");
                    System.out.println("1. Margherita");
                    System.out.println("2. Nonveg Pizza");
                    System.out.println("3. Farmhouse Pizza");
                    System.out.print("Enter your pizza choice: ");
                    int pizzaChoice = sc.nextInt();
                    switch (pizzaChoice) {
                        case 1:
                            System.out.println("You have ordered Margherita Pizza!");
                            break;
                        case 2:
                            System.out.println("You have ordered Nonveg Pizza!");
                            break;
                        case 3:
                            System.out.println("You have ordered Farmhouse Pizza!");
                            break;
                        default:
                            System.out.println("Invalid pizza choice!");
                    }
                    System.out.println("Your order has been placed successfully.");
                    break;
                case 3:
                    System.out.println("Your order is out for delivery");
                    break;
                case 4:
                    System.out.println("Your order has been cancelled");
                    break;
                case 5:
                    System.out.println("Thank you for your feedback");
                    break;
                case 6:
                    System.out.println("Thank you for visiting us");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }

            // Ask if the user wants to continue
            System.out.print("Do you want to continue? (y/n): ");
            ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');

        sc.close();
    }
}