package designpatterns.creativepatterns.factorymethod;

/**
 * @Author liliang
 * @Date 2019/6/4 12:36
 * @Description
 **/
public class BenzGCar implements Car {
    @Override
    public void drive() {
        System.out.println("奔驰大G跑起来了............");
    }
}
