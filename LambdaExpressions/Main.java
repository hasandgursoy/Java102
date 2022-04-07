package LambdaExpressions;

public class Main {

    public static void main(String[] args) {

        // Java8 öncesi

        Runnable r1 = new Runnable() {

            @Override
            public void run() {
                System.out.println("Runnable sınıfı");
            }

        };
        r1.run();

        // Java8 sonrası

        Runnable r2 = () -> System.out.println("r2 sınıfı ");
        r2.run();

        // Functional Programing
        // Fonksiyonel olabilmesi için tek bir işi yapması gerekir.
        // Genelde abstract interfaceden kalıtım alır ve bir tane işi vardır.

        Runnable r3 = () -> {
            System.out.println("r3 sınıfı");
            System.out.println("r3 sınıfı devamı");
        };
        r3.run();

        // Oluşturduğumuz interface üzerinden objeler üretelim 
        // Ancak şimdiki yol biraz zor 
        Matematik toplama = new Matematik() {

            @Override
            public int transaction(int a, int b) {
                return a-b;
            }
            
        };

        Matematik cikarma = new Matematik() {

            @Override
            public int transaction(int a, int b) {

                return a+b;
            }
            
        };

        // Kolay yol (Functional Way)

        Matematik sumEasy = (a,b) -> a+b;
        Matematik minusEasy = (a,b) -> a-b;
        Matematik multipleEasy = (a,b) -> a*b;
        Matematik divide = (a,b) -> {
            if(b == 0){
                b = 1;
            }
            return a/b;
        };


    }

}
