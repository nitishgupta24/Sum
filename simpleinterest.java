import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        System.out.println("\033c");
        float P,R,T;
        System.out.println("enter the principle");
        Scanner sc=new Scanner (System.in);
        P=sc.nextInt();
        System.out.println("enter the rate");
        Scanner s=new Scanner (System.in);
        R=s.nextInt();
        System.out.println("enter the time");
        Scanner c=new Scanner (System.in);
        T=c.nextInt();
        float SI = (P * T * R) / 100;
        System.out.println("Simple interest = " + SI);
    }
    
}
