package designpatterns.creativepatterns.singletonmode;

/**
 * @Author liliang
 * @Date 2019/6/4 14:23
 * @Description  双重检查加锁
 **/
public class SingletonModel03 {

    private static volatile SingletonModel03 instance = null;

    private SingletonModel03(){}

    public static SingletonModel03 getInstance(){
        if (instance == null){
            synchronized (SingletonModel03.class){
                if (instance == null){
                    instance = new SingletonModel03();
                }
            }
        }
        return instance;
    }
}
