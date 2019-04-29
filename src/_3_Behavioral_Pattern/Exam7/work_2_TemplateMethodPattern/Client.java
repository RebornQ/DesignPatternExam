package _3_Behavioral_Pattern.Exam7.work_2_TemplateMethodPattern;

/**
 * 现在我们很多家庭都有了榨汁机。
 * 榨汁的过程大体上为水果切片-->放入榨汁机-->加入调味料-->启动。
 * 可根据需要加入蜂蜜或苏打水，也可以什么调料都不加，制作纯果汁。
 * 请用模板方法模拟这个过程
 */
public class Client {
    public static void main(String[] args) {
        AbstractJuicer juicer = new Honey();
        juicer.setAddSeasoning(true);
        juicer.makeJuice();
    }
}
