package cn.hwolf.visitor;

import cn.hwolf.visitor.impl.NodeA;
import cn.hwolf.visitor.impl.NodeB;
import cn.hwolf.visitor.impl.VisitorFirst;
import cn.hwolf.visitor.impl.VisitorSecond;


/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        NodeA nodeA = new NodeA("我是A");
        NodeB nodeB = new NodeB("我是B");
        objectStructure.add(nodeA);
        objectStructure.add(nodeB);
        Visitor visitor = new VisitorFirst();
        objectStructure.action(visitor);
        Visitor visitor1 = new VisitorSecond();
        objectStructure.action(visitor1);
    }
}
