package cn.hwolf.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题(Subject)角色：
 * 抽象主题角色把所有对观察者对象的引用保存在一个聚集（比如ArrayList对象）里，每个主题都可以有任何数量的观察者。
 * 抽象主题提供一个接口，可以增加和删除观察者对象，抽象主题角色又叫做抽象被观察者(Observable)角色。
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public abstract class Subject {
    /**
     * 观察者集合
     */
    private List<Observer> list = new ArrayList<Observer>();

    /**
     * 注册观察者
     * @param observer
     */
    public void attach(Observer observer){
        list.add(observer);
        System.out.println("观察者："+list.size()+" 号注册");
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void remove(Observer observer){
        System.out.println("观察者： "+list.remove(observer)+" 移除");
    }

    /**
     * 通知所有观察者，状态改变
     * @param state
     */
    public void notifyAllObservers(String state){
        for (Observer observer : list) {
            observer.update(state);
        }
    }

    /**
     * 通知所有观察者状态改变，无参数
     */
    public void notifyAllObservers(){
        for (Observer observer : list) {
            observer.update(this);
        }
    }
}
