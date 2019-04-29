package _2_Structural_Pattern.Exam4.work_2_ProxyPattern;

public class RealBusiness extends Business{

    @Override
    public void method() {
        System.out.println("调用了业务方法");
    }
}
