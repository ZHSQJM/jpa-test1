package itcast;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/20 15:56
 * @package: itcast
 * @description:
 */
public class Bussiness {

    private volatile  boolean  flag = true;
    public synchronized void sub(int i) throws InterruptedException {
            if(!flag){
                this.wait();
            }
            for(int j = 0; j<10;j++){
                System.out.println("这里是子线程，这是第"+j+"次运行,外层是"+i+"次");
            }

             flag = false;
            //唤醒其他的线程
            this.notify();
    }

    public synchronized void main(int i) throws InterruptedException {
            if (flag) {
            this.wait();
            }
            for (int j = 0; j < 100; j++) {
                System.out.println("这里是主线程，这是第" + j + "次运行,外层是" + i + "次");
            }
            flag = true;
            this.notify();
    }
}
