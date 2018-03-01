package cn.hwolf.observer.impl;

import cn.hwolf.observer.Observer;
import cn.hwolf.observer.Subject;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public class ObserverImpl implements Observer {
    /**
     *  观察者所观察的状态
     */
    private String subjectState;


    @Override
    public void update(String state) {
        setSubjectState(state);
        System.out.println("This Observer method update state: "+ getSubjectState());
    }

    /**
     * 拉模式，观察者持有引用
     * @param subject
     */
    @Override
    public void update(Subject subject) {
        setSubjectState(((SubjectImpl)subject).getState());
        System.out.println("Subject is param : "+ getSubjectState());
    }

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
