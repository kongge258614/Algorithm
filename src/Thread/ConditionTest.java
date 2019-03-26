package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: liliang
 * @Date: 2019/3/26 17:26
 * @Description:  有A、B、C 三件事情，这三件事情按照 A(1)、B(2)、C(3) 的顺序执行
 */
public class ConditionTest {
    public static void main(String[] args) {
        Execute execute = new Execute();
        for (int i=0;i<9;i++){
            new Thread(() -> {execute.printA();},"A").start();
            new Thread(() -> {execute.printB();},"B").start();
            new Thread(() -> {execute.printC();},"C").start();
        }
    }
}


class Execute{
    private int number = 1;

    Lock lock = new ReentrantLock();

    Condition ca = lock.newCondition();
    Condition cb = lock.newCondition();
    Condition cc = lock.newCondition();

    public void printA(){
        lock.lock();
        try {
            // 1.判断
            while (number != 1){
                ca.await();
            }
            // 2.执行
            System.out.println(Thread.currentThread().getName());
            // 3.通知
            number = 2;
            cb.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printB(){
        lock.lock();
        try {
            // 1.判断
            while (number != 2){
                cb.await();
            }
            // 2.执行
            System.out.println(Thread.currentThread().getName());
            // 3.通知
            number = 3;
            cc.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printC(){
        lock.lock();
        try {
            // 1.判断
            while (number != 3){
                cc.await();
            }
            // 2.执行
            System.out.println(Thread.currentThread().getName());
            // 3.通知
            number = 1;
            ca.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}