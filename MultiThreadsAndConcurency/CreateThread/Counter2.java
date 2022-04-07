package MultiThreadsAndConcurency.CreateThread;


public class Counter2 implements Runnable {

    private String name;
    private int id;
    private boolean isRun = true;

    public Counter2(String name, int id) {
        this.setName(name);
        this.setId(id);
    }

    @Override
    public void run() {

        System.out.println(this.getName() + " sayacı başladı !");
        int i = 0;
        while (isRun) {

                
                try {
                    Thread.sleep(1000L * this.id);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(this.getName() + " : " + i++ + ",");
            
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void stopper(){
        this.isRun = false;
    }

}
