import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class checkevenorodd{
    public static void main(String[] args) {
        int n;
        System.out.println("enter the any number");
        Scanner sc= new Scanner (System.in);
        n=sc.nextInt();
        if(n%2==0)
        System.out.println("number is even");
        else
        System.out.println("number is odd");
    }
    
}
