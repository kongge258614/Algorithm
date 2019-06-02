package designpatterns.behavioralpatterns.observermodel.classical;

/**
 * @Author liliang
 * @Date 2019/6/2 19:02
 * @Description
 **/
public class ObserverA implements Observer {
    private Subject subject;

    public ObserverA(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void register() {
        subject.attach(this);
    }

    @Override
    public void update(String message) {

        System.out.println("A收到了消息:"+message);
    }
}
