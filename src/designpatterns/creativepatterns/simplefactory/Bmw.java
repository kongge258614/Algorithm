package designpatterns.creativepatterns.simplefactory;

/**
 * @Author liliang
 * @Date 2019/5/23 21:11
 * @Description  具体的汽车
 **/
public class Bmw implements Car {
    @Override
    public void create() {
        System.out.println("-------生产宝马汽车--------");
    }
}
