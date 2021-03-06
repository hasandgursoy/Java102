package MultiThreadsAndConcurency.CriticalSectionAndRaceContition;

public class OrderMatic implements Runnable {

    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic() {
        this.setOrderNo(1);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public void run() {
        
        synchronized (LOCK) {
            this.increaseOrder();
        }
    }

    public synchronized void increaseOrder() {
        this.orderNo++;
        System.out.println("Thread : " + Thread.currentThread().getName() + " Order No :" + this.orderNo);

    }

}
