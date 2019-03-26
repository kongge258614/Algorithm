package Thread;

/**
 * @Author: liliang
 * @Date: 2019/3/26 18:41
 * @Description:多线程生产者消费者模式   注意：虚假唤醒
 */
public class ProducerConsumer {
    public static void main(String[] args) {
        Apple apple = new Apple();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++){
                    apple.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"生产者A").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++){
                    apple.consum();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"消费者A").start();



        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++){
                    apple.produce();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"生产者B").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++){
                    apple.consum();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"消费者B").start();
    }
}


class Apple{

    private int number = 0;

    public synchronized void produce() throws InterruptedException {
        // 1. 判断
        while (number != 0){
            this.wait();
        }
        // 2. 干活
        ++number;
        System.out.println(Thread.currentThread().getName()+"---------->"+number);

        // 3. 通知
        this.notifyAll();
    }


    public synchronized void consum() throws InterruptedException {
        while (number == 0){
            this.wait();
        }
        --number;
        System.out.println(Thread.currentThread().getName()+"---------->"+number);
        this.notifyAll();
    }
}
