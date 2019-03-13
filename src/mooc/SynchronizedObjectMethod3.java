package mooc;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/19 15:30
 * @package: PACKAGE_NAME
 * @description:
 */
public class SynchronizedObjectMethod3 implements Runnable {

    static SynchronizedObjectMethod3 instance = new  SynchronizedObjectMethod3();

    public static void main(String[] args) {
        Thread t1 =new Thread(instance);
        Thread t2 =new Thread(instance);
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()){

        }
        System.out.println("finish");
    }
    @Override
    public void run() {
        method();
    }
    public synchronized void method(){
        System.out.println("这里是线程"+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"结束了");
    }
}
