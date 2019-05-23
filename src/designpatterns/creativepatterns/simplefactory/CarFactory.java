package designpatterns.creativepatterns.simplefactory;

/**
 * @Author liliang
 * @Date 2019/5/23 21:23
 * @Description  汽车工厂
 **/
public class CarFactory {

    public Car getInstence(int type){
        switch (type){
            case 0 :
                return new Benz();
            case 1 :
                return new Bmw();
            default:
                return null;
        }
    }
}
