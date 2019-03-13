package itcast;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/20 15:29
 * @package: itcast
 * @description:
 */
public class ThreadTest  {

    public static void main(String[] args) throws InterruptedException {

        Bussiness bussiness = new Bussiness();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =1;i<=50;i++){
                    try {
                        bussiness.sub(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


     for(int i =1;i<=50;i++){
         bussiness.main(i);
     }
    }



}
