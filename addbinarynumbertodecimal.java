public class addbinarynumbertodecimal{
    public static void main(String[] args) {
        System.out.println("\033c");
        String a="10";
        String b="01";
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);
        int sum=num1+num2;
        String result = Integer.toBinaryString(sum);
        System.out.println("decimal number is"+sum);
    }
    
}
