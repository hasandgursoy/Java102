package NestedClassesAndGenerics.WrapperClass;

public class Main {

    public static void main(String[] args) {

        int a = 20; // Primitive
        Integer b = 20; // Wrapper

        System.out.println(b + a);

        String str = "abc";
        Short s = 2;

        System.out.println(s.toString() + str);

        // Wrapper classes very usefull for type conversions

        a = Integer.parseInt("20");
        double c = Double.parseDouble("30");
        double result = a + c;
        System.out.println(result);
        System.out.println(Double.toString(result));

        // Autoboxing

        Integer y = a; // Background =  Integer.valueOf(a);

        // Boxing

        Integer z = Integer.valueOf(a); 

        // Unboxing

        int sa = z.intValue();
        System.out.println(sa);



    }
}
