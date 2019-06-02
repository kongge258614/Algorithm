package designpatterns.behavioralpatterns.chainofhandlermodel.factory;

import designpatterns.behavioralpatterns.chainofhandlermodel.handler.*;

/**
 * @Author liliang
 * @Date 2019/6/2 20:41
 * @Description  创建处理价格的责任链的工厂
 **/
public class PriceHandlerFactory {


    public static PriceHandler priceHandlerFactory(){
        PriceHandler sales = new Sales();
        PriceHandler manager = new Manager();
        PriceHandler director = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(manager);
        manager.setSuccessor(director);
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }





}
