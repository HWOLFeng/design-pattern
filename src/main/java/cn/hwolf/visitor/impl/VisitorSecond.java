package cn.hwolf.visitor.impl;

import cn.hwolf.visitor.Visitor;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public class VisitorSecond implements Visitor {
    @Override
    public void visit(NodeA a) {
        System.out.println(a.say() + "Second");
    }

    @Override
    public void visit(NodeB b) {
        System.out.println(b.say() + "Second");
    }
}
