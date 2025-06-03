import java.util.Scanner;
class Basketball_TeamC {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int height=0;
        int avg=0;
        System.out.println("Enter the height in feets");
        height=sc.nextInt();
        System.out.println("Enter the average no. of baskets per match");
        avg=sc.nextInt();
        if(height>=4){
            if(avg>=3){
                System.out.println("Shortlisted");
            }
            else{
                System.out.println("Not Shortlisted");
            }
        }
            else{
                if(avg>=3){
                    System.out.println("Shortlisted");
                }
                else{
                    System.out.println("Not Shortlisted");
                }
            }
        }
        
    }
