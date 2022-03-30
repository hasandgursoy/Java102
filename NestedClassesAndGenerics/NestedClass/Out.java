package NestedClassesAndGenerics.NestedClass;

// Outer Class
public class Out {
    
    public int a = 5;

    // Inner Class
    public class In{
        public int a = 1;

        public void run (){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Out.this.a); // This struct is new . If we want to reach Out parameters we must write Out.this.parameter 
        }
    }

    public static class NewIn {
        public static int a = 12;

        public static void run (){
            System.out.println(a);
            System.out.println(NewIn.a);
            System.out.println(Out.NewIn.a);
            
        }
        
    }



    public void run() {
        In in = new In();
        in.run();    
    }

    public In getIn(){
        In in  = new In();
        return in;
    }
}
