import java.util.Scanner;
public class GcdLcmCalculator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.of.elements:");
        int n=sc.nextInt();
        System.out.print("enter the numbers:");
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        long lcm=1;
        long gcd=num[0]; 
    for(int number:num){
        lcm=lcm*number/gcd(lcm,number);
        gcd=gcd(gcd,number);
    }
    System.out.print("LCM:"+lcm);
    System.out.print(" GCD:"+gcd);
    sc.close();
    }
    private static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
}
