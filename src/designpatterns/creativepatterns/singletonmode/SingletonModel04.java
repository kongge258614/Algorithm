package designpatterns.creativepatterns.singletonmode;

/**
 * @Author liliang
 * @Date 2019/6/4 14:29
 * @Description  静态内部类
 **/
public class SingletonModel04 {

    private SingletonModel04(){}

    private static class SingletonInstance{
        private static final SingletonModel04 instance = new SingletonModel04();
    }

    public static SingletonModel04 getInstance(){
        return SingletonInstance.instance;
    }

}
