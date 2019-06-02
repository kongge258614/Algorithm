package designpatterns.behavioralpatterns.chainofhandlermodel.handler;

/**
 * @Author liliang
 * @Date 2019/6/2 20:56
 * @Description  项目组领导人
 **/
public class Director extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.2){
            System.out.println("我是销售组负责人，我可以批准20%的折扣");
        }else {
            priceHandler.processDiscount(discount);
        }
    }
}
