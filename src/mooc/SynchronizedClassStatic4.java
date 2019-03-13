package mooc;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/19 15:46
 * @package: PACKAGE_NAME
 * @description:
 */
public class SynchronizedClassStatic4  implements  Runnable{


    static SynchronizedClassStatic4 instance1 = new  SynchronizedClassStatic4();
    static SynchronizedClassStatic4 instance2 = new  SynchronizedClassStatic4();

    Object object = new Object();

    public static void main(String[] args) {
        Thread t1 =new Thread(instance1);
        Thread t2 =new Thread(instance2);
        t1.start();
        t2.start();
    }
    @Override
    public void run() {
        method();
    }
    public   void method() {
      synchronized (SynchronizedClassStatic4.class) {
            System.out.println("这里是锁对象，这里是同步代码块" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行完毕");
       }
    }
}
