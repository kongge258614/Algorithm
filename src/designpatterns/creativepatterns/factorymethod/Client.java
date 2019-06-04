package designpatterns.creativepatterns.factorymethod;

/**
 * @Author liliang
 * @Date 2019/6/4 12:38
 * @Description
 **/
public class Client {

    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();     //在springboot中可以直接使用@Autowire注入
        carFactory.setVehicletype("S");
        Car car = carFactory.product();
        car.drive();

    }
}
