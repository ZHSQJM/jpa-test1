package mooc1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;


/**
 * @project: synchronized
 * @author: zhs
 * @date: 2019/2/22 14:17
 * @package: mooc1
 * @description:
 */
public class Simple {

   // private  static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");

   // private  static DateTimeFormatter dateTimeFormatter = new DateTimeFormatter();
    public static void main(String[] args) {
        for(int  i =0;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                        simpleDateFormat.parse("20190222");
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
