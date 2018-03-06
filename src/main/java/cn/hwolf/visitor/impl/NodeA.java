package cn.hwolf.visitor.impl;

import cn.hwolf.visitor.Node;
import cn.hwolf.visitor.Visitor;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public class NodeA implements Node {
    private String aWords;

    public NodeA(String words) {
        this.aWords = words;
    }

    @Override
    public String say() {
        return aWords;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
