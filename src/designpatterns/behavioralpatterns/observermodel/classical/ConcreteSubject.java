package designpatterns.behavioralpatterns.observermodel.classical;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liliang
 * @Date 2019/6/2 19:00
 * @Description
 **/
public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {

    }

    @Override
    public void notice(String message) {
        for (Observer observer:observers){
            observer.update(message);
        }
    }
}
