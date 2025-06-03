import java.util.*;
public class Comparision{
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=sc.nextInt();
        System.out.println("Enter the value of b");
        int b=sc.nextInt();
        
        if(a==b){
            System.out.println("a is equal to b");
        }
else{
    if(a>b){
        System.out.println("a is grater than b");

    }else{
        System.out.println("a is smaller than b");
    }
}
    }
}