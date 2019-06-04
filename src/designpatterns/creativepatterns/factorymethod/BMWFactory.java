package designpatterns.creativepatterns.factorymethod;

/**
 * @Author liliang
 * @Date 2019/6/4 12:32
 * @Description
 **/
public class BMWFactory extends CarFactory {


    @Override
    public Car product() {
        switch (vehicletype){
            case "7":
                return new BMW7Car();
            default:
                return null;
        }
    }
}
