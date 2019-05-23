package designpatterns.creativepatterns.simplefactory;

/**
 * @Author liliang
 * @Date 2019/5/23 21:15
 * @Description
 **/
public class Test {

    public static void main(String[] args) {
        /**
         * 1. 实例化工厂
         * 2. 根据不同的产品类型，创建不同的产品
         * 3. 调用具体产品的方法
         */
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getInstence(0);
        car.create();
    }
}
