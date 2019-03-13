package mooc;

/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/20 09:43
 * @package: PACKAGE_NAME
 * @description:
 */
public class SynchronizedRecursion {

    int a = 0;
    public static void main(String[] args) {
        SynchronizedRecursion synchronizedRecursion = new SynchronizedRecursion();
        synchronizedRecursion.method();
    }

    private synchronized void method() {
        System.out.println("这里是方法 ，a="+a);
        if(a==0){
            a++;
            method();
        }
    }
}
