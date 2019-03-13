package mooc;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/19 14:45
 * @package: PACKAGE_NAME
 * @description:
 */
public class SynchronizedObjectCodeBlock2 implements Runnable{

    static SynchronizedObjectCodeBlock2 instance = new  SynchronizedObjectCodeBlock2();

    static SynchronizedObjectCodeBlock2 instance1 = new  SynchronizedObjectCodeBlock2();
    public static void main(String[] args) {
        Thread t1 =new Thread(instance);
        Thread t2 =new Thread(instance1);
        t1.start();
        t2.start();
    }
    @Override
    public  synchronized void run() {
      // synchronized (this) {
            System.out.println("这里是锁对象，这里是同步代码块11111" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName()+"执行完毕");
      //  }
    }
}
