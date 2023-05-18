import java.util.*;
public class swappingnumber {
    public static void main(String[] args) {
        System.out.println("\033c");
        int a;
        int b;
        int temp;
        System.out.println("enter the first number a is");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter the second number b is");
        Scanner s=new Scanner(System.in);
        b=s.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("number swapping a is"+a+"\nnumber swapping b is" +b);
    }
    
}
