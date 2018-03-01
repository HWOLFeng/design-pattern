package cn.hwolf.flyweight;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 复合享元(ConcreteCompositeFlyweight)角色 ：复合享元角色所代表的对象是不可以共享的，
 * 但是一个复合享元对象可以分解成为多个本身是单纯享元对象的组合。复合享元角色又称作不可共享的享元对象。
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/1.
 */
public class ConcreteCompositeFlyweight implements Flyweight{
    private Map<Character,Flyweight> flyweightMap = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     * @param key
     * @param flyweight
     */
    public void add(Character key, Flyweight flyweight){
        flyweightMap.put(key,flyweight);
    }

    @Override
    public void operation(String state) {
        Flyweight fly = null;
        // 遍历Map
        for(Object o : flyweightMap.keySet()){
            fly = flyweightMap.get(o);
            fly.operation(state);
        }
    }
}
