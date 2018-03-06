package cn.hwolf.visitor.impl;

import cn.hwolf.visitor.Node;
import cn.hwolf.visitor.Visitor;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public class NodeB implements Node {
    private String bWords;

    public NodeB(String words) {
        this.bWords = words;
    }

    @Override
    public String say() {
        return bWords;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
