package designpatterns.behavioralpatterns.chainofhandlermodel.handler;

/**
 * @Author liliang
 * @Date 2019/6/2 20:54
 * @Description  基层销售
 **/
public class Sales extends PriceHandler {

    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.05){
            System.out.println("我是基层销售，我可以批准5%的折扣");
        }else {
            priceHandler.processDiscount(discount);
        }

    }
}
