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
        // Threadleri extend etmek yerine birden Runnable yapılar da kullanabiliriz. Hem interface olduğu için miras kısmı boş kalır.

        // Runnable ile oluşturduğumuz yapıları thread sınıfından üretilmiş nesne atıyoruz.

        Counter2 s1 = new Counter2("s1");
        Counter2 s2 = new Counter2("s2");
        Counter2 s3 = new Counter2("s3");

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);

        t1.start();
        t2.start();
        t3.start();

        





    }
}
