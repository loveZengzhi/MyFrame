package xumi.spring.demo.design.abstractfactory;

/**
 * @author: zzxu
 * @date: 2021/5/7 16:25
 * @description:
 */
public class MacButton implements ButtonInterface{
    @Override
    public void paint() {
        System.out.println("MacButton");
    }
}
