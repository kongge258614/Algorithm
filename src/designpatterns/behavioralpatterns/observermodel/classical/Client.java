package designpatterns.behavioralpatterns.observermodel.classical;

/**
 * @Author liliang
 * @Date 2019/6/2 19:12
 * @Description
 **/
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer observerA = new ObserverA(subject);
        Observer observerB = new ObserverB(subject);
        observerA.register();
        observerB.register();

        subject.notice("下发通知");
    }
}
