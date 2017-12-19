package cn.hwolf.observer.impl;

import cn.hwolf.observer.Subject;

/**
 * 实现类，被观察者，状态会发生改变
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public class SubjectImpl extends Subject {
    private String state;

    /**
     * 状态改变
     * @param newState
     */
    public void change(String newState){
        setState(newState);
        System.out.println("Subject 状态改变为: "+getState());
        // 通知观察者
        this.notifyAllObservers(newState);
        // 拉通知观察者
        this.notifyAllObservers();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
