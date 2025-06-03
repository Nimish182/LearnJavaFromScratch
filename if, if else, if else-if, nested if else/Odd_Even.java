import java.util.*;
public class Odd_Even{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println(x+" Is a Even no.");}
            else{
                System.out.println(x+" Is a Odd no.");
            }
        }
    }