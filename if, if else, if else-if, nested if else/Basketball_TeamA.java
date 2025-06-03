import java.util.Scanner;
class Basketball_TeamA{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int height=0;
        System.out.println("Enter the height in feets");
        height=sc.nextInt();
        if(height>=4){
            System.out.println("Shortlisited");
        }
else{
    System.out.println("Not Shortlisted");
    
}
    }
}