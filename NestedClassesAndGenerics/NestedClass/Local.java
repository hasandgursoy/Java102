package NestedClassesAndGenerics.NestedClass;

public class Local {
    
    public void run(){

        class InLocal {

            private int a;

            public InLocal(int a){
                this.a = a;
            }

            public int getA() {
                return a;
            }

          
        }

        InLocal y = new InLocal(15);
        System.out.println(y.getA());
        System.out.println("Local sınıfı çalıştı.");

        




    }

}
