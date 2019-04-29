package _2_Structural_Pattern.Exam4.work_2_ProxyPattern;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Proxy extends Business {

    private int callTimes = 0;

    private RealBusiness realBusiness = new RealBusiness();

    private void preMethod() {
        System.out.println("调用时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())));
    }

    @Override
    public void method() {
        preMethod();
        realBusiness.method();
        postMethod();
    }

    private void postMethod() {
        callTimes++;
        System.out.println("调用了" + callTimes + "次");
    }
}
