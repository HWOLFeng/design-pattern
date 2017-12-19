package cn.hwolf.observer;

import cn.hwolf.observer.impl.ObserverImpl;
import cn.hwolf.observer.impl.SubjectImpl;
import org.junit.Test;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public class TestObserverClient {
    /**
     * 推、拉一起模式，具体区别见代码
     */
    @Test
    public void pushAndPull(){
        // 被观察者
        SubjectImpl subject = new SubjectImpl();
        // 观察者
        Observer observer1 = new ObserverImpl();
        // 观察者2
        Observer observer2 = new ObserverImpl();
        // 注册观察者
        subject.attach(observer1);
        subject.attach(observer2);
        // 初始状态
        subject.change("初始状态");
        // 状态改变
        subject.change("状态改变");
    }
}
