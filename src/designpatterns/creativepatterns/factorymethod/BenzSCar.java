package designpatterns.creativepatterns.factorymethod;

/**
 * @Author liliang
 * @Date 2019/6/4 12:37
 * @Description
 **/
public class BenzSCar implements Car {
    @Override
    public void drive() {
        System.out.println("奔驰S跑起来了............");
    }
}
