import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("\033c");
        int n;
        System.out.println("enter the year");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%4==0 || n%400==0 && n%100!=0)
        {
            System.out.println("leapyear");
        }
       
        else {
            System.out.println(" not a leapyear");
        }
    
    }
    
}
