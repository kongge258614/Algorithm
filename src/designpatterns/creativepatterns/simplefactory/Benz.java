package designpatterns.creativepatterns.simplefactory;

/**
 * @Author liliang
 * @Date 2019/5/23 21:10
 * @Description 具体的汽车
 **/
public class Benz implements Car {
    @Override
    public void create() {
        System.out.println("------生产奔驰汽车----");
    }
}
