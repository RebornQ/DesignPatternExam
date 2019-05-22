# DesignPatternExam
这是我学习设计模式时的实验作业，放到Github留个备份

## 题目
要求：用**C#**和**JAVA**实现都可
### [实验一  创建型软件设计模式（一）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_1_Creational_Pattern/Exam1)
实验目的：
1. 学会使用`工厂模式`来创建对象
2. 学会使用`单例模式`来创建对象

实验内容：
1. 有一款游戏软件，分为与电脑对战和与人对战两种玩法，而每种玩法又分简易操作和复杂操作两种，假设现在需要你根据选择的情况创建具体的游戏对象，你会采用什么样的工厂模式进行设计，请给出设计方案。
2. 请任意设计一个单例模式的例子，要求用饿汉式和懒汉式各实现一次。

    > 注：
    > - 懒汉式单例，类在第一次被引用时，才会将自己实例化
    > - 饿汉式单例，类在被加载时就将自己实例化。
3. 请设计一个多例模式（如3例）的例子

### [实验二  结构型软件设计模式（一）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_2_Structural_Pattern/Exam2)
实验目的：
1. 学会使用`适配器模式`
2. 学会使用`桥接模式`
 
实验内容：
1. 某公司打算开发一个根据邮编代号来判断地点的功能，目前开发方已开发了一个类U，类中有方法`string findzipcode（string zipcode）`，在输入美国邮编的情况下得到美国的地址。假定现在又想开发中国邮编查询的功能，这时开发方获得了一个中国邮编查询的类C，该类也有类似的方法 `string zipcode(int code[6])`，请分别用类适配器和对象适配器模式来模拟解决这个问题。（注：中国邮编是6位，美国邮编是5位）。
2. 某日志记录器既可以支持不同的操作系统（windows和linux），还可以支持多种编程语言（java和python），并且可以使用不同的输出方式（txt和doc）。请使用桥接模式设计该系统。

### [实验三  结构型软件设计模式（二）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_2_Structural_Pattern/Exam3)
 
实验目的：
1. 学会使用`组合模式`
2. 学会使用`外观模式`

实验内容：
1. 某教育机构组织结构如下图所示：

    ![某教育机构组织结构](/images/%E6%9F%90%E6%95%99%E8%82%B2%E6%9C%BA%E6%9E%84%E7%BB%84%E7%BB%87%E7%BB%93%E6%9E%84.png)     
    在该教育机构的OA系统中可以给各级办公室下发公文，试采用组合模式设计该机构的组织结构，绘制相应的类图并编程模拟实现，在客户端代码中模拟下发公文。
2. 使用外观模式实现教室设备的统一操作，包括上课和下课两个按钮，设备包括电脑、幕布、投影仪、话筒、黑板灯。

### [实验四  结构型软件设计模式（三）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_2_Structural_Pattern/Exam4)
实验目的：
1. 学会使用`装饰模式`
2. 学会使用`代理模式`

实验内容
1. 有一个小吃店，餐牌如下：

    | 面料 | 配料 |
    | --- | --- |
    | 素面  10元 | 加牛肉  5元 |
    | 素粉  9元 | 加猪肉  3元 |
    |  | 加蛋    2元 |
    
    顾客在选定粉或面的基础上，可以加任意的东西（可同时加多种东西），请用装饰模式模拟一下算账程序。
2. 某应用软件需要记录业务方法的调用日志，在不修改现有类的基础上，记录业务方法`method()`的调用次数，并在`method()`调用之前输出调用时间。请用代理模式来设计日志模块的结构。

### [实验五  行为型软件设计模式（一）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_3_Behavioral_Pattern/Exam5)
实验目的：
1. 学会使用`命令模式`
 
实验内容：
1. 有一个烧烤城，有两个摊位，一个摊位是烤鱼的，另外一个摊位可以烤肉串，也可以烤鸡翅。顾客不直接去摊位点食物，而是告诉服务员想吃什么，服务员去摊位下单并把烤好的食物拿给顾客。请用命令模式模拟这个过程。

### [实验六  行为型软件设计模式（二）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_3_Behavioral_Pattern/Exam6)
 
实验目的：
1. 学会使用`观察者模式`
2. 学会使用`迭代器模式`
 
实验内容：
1. 有一个美丽的善良的姑娘，很多的追求者。

    追求者队伍会不断的变换
    
    追求者最喜欢问的话“你在干嘛”
    
    善良的姑娘不断的回复。
    
    困惑
    
    姑娘：不断回复给很多人
    
    追求者：不断询问
    
    现在改用用关注的方式
    
    如果boy关注了女孩，则可以通过数据绑定方法获得女孩的状态列表。
    
    女孩会更新自己的状态
2. 任意编一个迭代器模式遍历数据集合的程序

### [实验七  行为型软件设计模式（三）](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_3_Behavioral_Pattern/Exam7)
 
实验目的：
1. 学会使用`策略模式`来编写程序
2. 学会使用`模板方法模式`来编写程序
 
实验内容：
1. 假设有下面一段代码
    
    ```java
    public class Keyword{
        public static void main(string[] args)
        {
            int choice;
            string word="test";
            if(choice==1) find1(word);
            else if (choice==2) find2(word);
            else if (choice==3) find3(word);
            else if (choice==4) find4(word);
            else find5(word);
        }
        public find1(string word)
        {
            // 代码部分省略
        }
        public find2(string word)
        {
            // 代码部分省略
        }
        // 其余的类此处省略…
    }
    ```
    这段代码打算根据不同的choice来选择不同的find方法执行，但这种设计方案不符合开闭原则，请使用策略模式来重新设计以上的类。
2. 现在我们很多家庭都有了榨汁机。榨汁的过程大体上为`水果切片-->放入榨汁机-->加入调味料-->启动`。可根据需要加入蜂蜜或苏打水，也可以什么调料都不加，制作纯果汁。请用模板方法模拟这个过程

### [综合实验](https://github.com/RebornQ/DesignPatternExam/tree/master/src/_4_IntergratedExam)

实验内容：
1. 某市海关，为增加进出口企业主动缴税的积极性，对商品报税有一定的奖励制度，奖励方案包括降低税率（税款>=10000,则税费打95折）、减免税款（5000=<税款<10000,则税费减少300）等，且随着国家政策的改变，奖励方案很可能经常会变动。

    此外，由于各种商品税率不一样，计税时需要查询国家进出口税率系统（`TaxRateCalculator`，给出商品的`code`，可查出商品税率）。

    不幸的是，海关设计自己系统的时候，定义了和国家进出口税率系统不一样的接口(`TaxRateInterface`，定义的方法名称不一样)。

    请设计一下海关的计税系统。（税费=税率*商品数量）