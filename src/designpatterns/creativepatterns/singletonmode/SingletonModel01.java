package designpatterns.creativepatterns.singletonmode;

/**
 * @Author liliang
 * @Date 2019/6/4 14:14
 * @Description  饿汉式（静态常量）
 **/
public class SingletonModel01 {

    // 类一被加载时，便创建了单例对象
    private static final SingletonModel01 instance = new SingletonModel01();

    // 私有的构造方法，保证单例对象永远不能被被外部对象所创建
    private SingletonModel01() {
    }

    public static SingletonModel01 getInstance(){
        return instance;
    }


}
