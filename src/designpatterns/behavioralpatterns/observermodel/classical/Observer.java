package designpatterns.behavioralpatterns.observermodel.classical;

/**
 * @Author liliang
 * @Date 2019/6/2 19:01
 * @Description
 **/
public interface Observer {
    void register();

    void update(String message);
}
