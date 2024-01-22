import java.util.Scanner;
public class Reversed{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=sc.nextLine();
        for(int i=s.length();i>0;--i){
            System.out.print(s.charAt(i-1));
        }
        sc.close();
    }
}
