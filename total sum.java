import java.util.*;
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,i=0;
        System.out.println("Enter number to find its total sum");
        k=sc.nextInt();
        while(k!=0)
        {System.out.print(k%10+"+");
            i+=k%10;
            k=k/10;
         

            
        }
        System.out.println("The sum of number is  "+i);
       sc.close();
    }
    
}
