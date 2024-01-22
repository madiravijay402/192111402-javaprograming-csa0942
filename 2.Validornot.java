import java.util.Scanner;
public class ValidOrNot{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the name:");
        String s1=sc.nextLine();
        System.out.print("enter the name2:");
        String s2=sc.nextLine();
        if(s1.equals(s2)){
            System.out.print("The string is valid");
        }
        else{
            System.out.print("The string is not valid");
        }
        sc.close();
    }
}
