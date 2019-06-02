package designpatterns.behavioralpatterns.chainofhandlermodel.handler;

/**
 * @Author liliang
 * @Date 2019/6/2 20:56
 * @Description  小组长
 **/
public class Manager extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.1){
            System.out.println("我是销售组小组长，我可以批准10%的折扣");
        }else {
            priceHandler.processDiscount(discount);
        }
    }
}
