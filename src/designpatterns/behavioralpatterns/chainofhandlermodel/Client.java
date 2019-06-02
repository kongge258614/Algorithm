package designpatterns.behavioralpatterns.chainofhandlermodel;

import designpatterns.behavioralpatterns.chainofhandlermodel.factory.PriceHandlerFactory;
import designpatterns.behavioralpatterns.chainofhandlermodel.handler.PriceHandler;

/**
 * @Author liliang
 * @Date 2019/6/2 21:18
 * @Description
 **/
public class Client {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.setPriceHandler(PriceHandlerFactory.priceHandlerFactory());
        client.requestDiscount((float) 0.6);


    }
}
