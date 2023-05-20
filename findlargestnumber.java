import java.util.*;
public class findlargestnumber {
    public static void main(String[] args) {
      System.out.println("\033c");
    
        int n,m,b;
        System.out.println("enter the numbers");
        Scanner sc=new Scanner(System.in);
        n =sc.nextInt();
        Scanner s=new Scanner(System.in);
        m =s.nextInt();
        Scanner c=new Scanner(System.in);
        b =c.nextInt();
        if (n > m && n > b)
        
          {  
        System.out.println("largest number" +n);
          }
          else if(m>n && m>b)
          {
            System.out.println("largest number" +m);
          }
          else if (b>m && b>n)
       
         {
            System.out.println("largest number" +b);
          }
       

 
                 
    }
    
}
