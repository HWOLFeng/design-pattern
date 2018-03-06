package cn.hwolf.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/6.
 */
public class ObjectStructure {
    private List<Node> nodes = new ArrayList<Node>();

    /**
     * 执行方法操作
     * @param visitor
     */
    public void action(Visitor visitor) {
        for (Node node : nodes) {
            node.accept(visitor);
        }

    }

    /**
     * 添加一个新元素
     * @param node
     */
    public void add(Node node) {
        nodes.add(node);
    }
}
