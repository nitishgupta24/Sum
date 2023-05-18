public class addtwobinarynumber{
    public static void main(String[] args) {
        System.out.println("\033c");
        String x="11";
        String y="10";
        
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String result = Integer.toBinaryString(sum);
        System.out.println("add two binary number is "+result);
    }

}
