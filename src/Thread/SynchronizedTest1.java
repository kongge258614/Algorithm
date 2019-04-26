package Thread;

import java.util.concurrent.TimeUnit;

public class SynchronizedTest1 {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car();
        car.consume();
        new Thread(()->{
            try {
                car.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}


class Car{


    public synchronized void produce() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("生产.............");
    }

    public synchronized void consume() throws InterruptedException {
        System.out.println("消费.............");
        TimeUnit.SECONDS.sleep(2);
    }
}
