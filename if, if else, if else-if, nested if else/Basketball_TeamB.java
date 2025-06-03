import java.util.Scanner;
class Basketball_TeamB {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int height=0;
        int avg=0;
        System.out.println("Enter the heights in feets");
        height=sc.nextInt();
        System.out.println("Enter the average average no. of baskets per match");
        avg=sc.nextInt();
        if(height>=4 && avg>=3){
            System.out.println("Shortlisted");
        }
        else if(height>=4 && avg<3){
            System.out.println("Not Shortlisted");
                }
                else if(height<4 && avg>=3){
                    System.out.println("Shortlisted");
                }
                else{
                    System.out.println("Not Shortlisted");
                }
    }
}