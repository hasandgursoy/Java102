public class Main {
    public static void main(String[] args) {
        
        System.out.println("Uygulama başladı");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Uygulama bitti");

        Counter c1 = new Counter("Counter-1");
        Counter c2 = new Counter("Counter-2");

        c1.start();
        c2.start();

        // Threadler extend edilmedilir.
        // Normalde bir sefer de tek bir thread çalışır ancak biz bunu kendi threadlerimizi üreterek aşabiliyoruz.
        // Bu durum da Multithread kavramını ortaya çıkarıyor.
        // Threadler'in başlaması için start() fonksiyonunu kullanıyoruz.



    }
}
