package designpatterns.behavioralpatterns.chainofhandlermodel.handler;

/**
 * @Author liliang
 * @Date 2019/6/2 20:46
 * @Description  责任链  自己持有自己对象的引用，目的是为设置后继处理对象
 **/
public abstract class PriceHandler {

    /**
     * 直接后继，用于传递请求
     */
    protected PriceHandler priceHandler;

    public void setSuccessor(PriceHandler priceHandler){
        this.priceHandler = priceHandler;
    }

    /**
     * 处理折扣的申请
     */
    public abstract void processDiscount(float discount);
}
