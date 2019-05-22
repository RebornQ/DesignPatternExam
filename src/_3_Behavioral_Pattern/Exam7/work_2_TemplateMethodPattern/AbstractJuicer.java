package _3_Behavioral_Pattern.Exam7.work_2_TemplateMethodPattern;

/**
 * 现在我们很多家庭都有了榨汁机。
 * 榨汁的过程大体上为水果切片-->放入榨汁机-->加入调味料-->启动。
 * 可根据需要加入蜂蜜或苏打水，也可以什么调料都不加，制作纯果汁。
 * 请用模板方法模拟这个过程
 */
public abstract class AbstractJuicer {

    // 模板方法，用final修饰，不允许子类覆盖。
    public final void makeJuice() {
        cutFruit(); // 切水果
        putInJuicer();  // 放入榨汁机

        //通过钩子方法来确定某一步骤是否执行
        if (isAddSeasoning()) {
            addSeasoning(); // 加入调味料
        } else {
            System.out.println("没加调味料");
        }

        startJuicing(); // 开始榨汁
    }

    // 基本方法—具体方法
    private void cutFruit() {
        //实现代码
        System.out.println("切水果");
    }

    private void putInJuicer() {
        System.out.println("放入榨汁机");
    }


    // 基本方法—抽象方法
    public abstract void addSeasoning();

    // 基本方法—具体方法
    private void startJuicing() {
        System.out.println("开始榨汁");
    }

    // 基本方法—钩子方法
    public boolean isAddSeasoning() {
        return false;
    }
}
