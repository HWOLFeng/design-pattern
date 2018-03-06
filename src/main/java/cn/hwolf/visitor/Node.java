package cn.hwolf.visitor;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public interface Node {
    /**
     * 表明身份
     * @return
     */
    String say();

    void accept(Visitor visitor);
}
