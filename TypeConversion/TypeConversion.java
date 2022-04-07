package TypeConversion;


public class TypeConversion {

    public static void main(String[] args) {
        
        // Wideng Casting

        int a = 10;
        double b = a; 

        System.out.println(b);

        // Narrowing Casting

        double pi = 3.14;
        int s = (int) pi;
        System.out.println(s);

        // Wrapper Class Casting

        int as = 20;
        System.out.println("Integer :"+a);

        String str = String.valueOf(as);
        System.out.println(str);

        int ba = Integer.parseInt(str);
        System.out.println(ba);









    }

    
}