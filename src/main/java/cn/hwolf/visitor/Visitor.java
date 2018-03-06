package cn.hwolf.visitor;

import cn.hwolf.visitor.impl.NodeA;
import cn.hwolf.visitor.impl.NodeB;

/**
 * 因为没有定下引用类型，访问者，访问不同的节点
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public interface Visitor {
    /**
     * 访问对象A
     * @param a
     */
    void visit(NodeA a);
    /**
     * 访问对象B
     * @param b
     */
    void visit(NodeB b);
}
