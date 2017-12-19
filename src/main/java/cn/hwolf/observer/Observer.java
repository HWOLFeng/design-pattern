package cn.hwolf.observer;

/**
 * 观察者接口
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public interface Observer {
    /**
     * 推模型
     * @param state
     */
    void update(String state);

    /**
     * 拉模型
     * @param subject
     */
    void update(Subject subject);
}
