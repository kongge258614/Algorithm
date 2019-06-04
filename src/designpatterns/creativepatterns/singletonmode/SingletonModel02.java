package designpatterns.creativepatterns.singletonmode;

/**
 * @Author liliang
 * @Date 2019/6/4 14:19
 * @Description  饿汉式（静态代码块）  这种写法和静态常量的本质是一样的，是静态常量写法的一种变形。
 **/
public class SingletonModel02 {

    private static SingletonModel02 instance = null;

    static {
        instance = new SingletonModel02();
    }

    private SingletonModel02(){}

    public static SingletonModel02 getInstance(){
        return instance;
    }
}
