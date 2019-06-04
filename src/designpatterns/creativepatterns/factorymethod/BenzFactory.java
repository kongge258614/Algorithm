package designpatterns.creativepatterns.factorymethod;

/**
 * @Author liliang
 * @Date 2019/6/4 12:31
 * @Description
 **/
public class BenzFactory extends CarFactory {

    @Override
    public Car product() {
        switch (vehicletype){
            case "G":
                return new BenzGCar();
            case "S":
                return new BenzSCar();
            default:
                return null;
        }
    }
}
