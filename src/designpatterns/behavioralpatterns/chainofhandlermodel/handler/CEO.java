package designpatterns.behavioralpatterns.chainofhandlermodel.handler;

/**
 * @Author liliang
 * @Date 2019/6/2 20:57
 * @Description
 **/
public class CEO extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if (discount <= 0.5){
            System.out.println("我是CEO，我可以批准50%的折扣");
        }else {
            System.out.println("我是CEO，我可以拒绝50%的折扣");
        }
    }
}
