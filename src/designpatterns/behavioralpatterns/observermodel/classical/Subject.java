package designpatterns.behavioralpatterns.observermodel.classical;

/**
 * @Author liliang
 * @Date 2019/6/2 18:58
 * @Description
 **/
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notice(String message);

}
