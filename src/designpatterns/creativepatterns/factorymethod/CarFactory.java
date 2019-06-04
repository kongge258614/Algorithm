package designpatterns.creativepatterns.factorymethod;

/**
 * @Author liliang
 * @Date 2019/6/4 12:29
 * @Description  汽车工厂抽象父类
 **/
public abstract class CarFactory {

    // 车辆型号
    protected String vehicletype;

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public abstract Car product();
}
