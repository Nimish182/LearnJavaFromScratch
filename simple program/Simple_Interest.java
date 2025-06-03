import java.util.Scanner;
public class Simple_Interest
{
    public static void main(String args[])
    {
        int p;
        float r;
        int n;
        float si;
        float amt;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p=input.nextInt();
        System.out.println("Enter the rate of interest");
        r=input.nextFloat();
        System.out.println("Enter the no. of years");
        n=input.nextInt();
        si=(p*r*n)/100; //formula of simple interest
        amt=si+p;  //formula for total amount
        System.out.println("\nThe Simple interest is:"+si);
        System.out.println("\nThe total amount to be paid is:"+amt);
    }
}