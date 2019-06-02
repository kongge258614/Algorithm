package designpatterns.behavioralpatterns.chainofhandlermodel.handler;

/**
 * @Author liliang
 * @Date 2019/6/2 20:57
 * @Description  副总裁
 **/
public class VicePresident extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.4){
            System.out.println("我是副总裁，我可以批准40%的折扣");
        }else {
            priceHandler.processDiscount(discount);
        }
    }
}
