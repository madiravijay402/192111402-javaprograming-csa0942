import java.util.Scanner;
public class EligibleToVote{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age:");
        int age=sc.nextInt();
        if(age>18){
            System.out.print("he is eligible to vote");
        }
        else if(age<0){
            System.out.print("please enter the valid number");
        }
        else{
            System.out.print("he is eligible to vote after "+(18-age)+" years");
        }
        sc.close();
    }
}
