package mooc;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/19 14:31
 * @package: PACKAGE_NAME
 * @description:
 */
public class DisappearRequest1 implements Runnable {

    static  AtomicInteger integer = new AtomicInteger(0);
   Lock lock =new ReentrantLock();
    static  Integer a = 0;
    static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected  Integer initialValue(){
return   0;
        }
    };
    static AtomicInteger atomicInteger = new AtomicInteger(0);
    static DisappearRequest1 disappearRequest1 = new DisappearRequest1();
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(disappearRequest1);
        Thread thread2 = new Thread(disappearRequest1);
        thread2.start();
        thread.start();
        thread.join();
        thread2.join();
        System.out.println(integer.get());
        }

    @Override
    public  void run() {
        try {
           // lock.lock();
            for (int j = 0; j < 100000; j++) {
                  integer.getAndIncrement();
            //    a++;
                //   threadLocal.set(a);
            }
        }finally {
          //  lock.unlock();
        }
    }
}
