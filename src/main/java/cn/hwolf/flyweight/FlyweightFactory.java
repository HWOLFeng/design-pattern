package cn.hwolf.flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元工厂(FlyweightFactory)角色 ：本角 色负责创建和管理享元角色。
 * 本角色必须保证享元对象可以被系统适当地共享。当一个客户端对象调用一个享元对象的时候，
 * 享元工厂角色会检查系统中是否已经有 一个符合要求的享元对象。如果已经有了，
 * 享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，
 * 享元工厂角色就应当创建一个合适的享元对象。
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/3/1.
 */
public class FlyweightFactory {
    private Map<Character,Flyweight> flyweightMap = new HashMap<>();

    /**
     * 复合享元工厂方法
     * @param flyweightList
     * @return
     */
    public Flyweight factory(List<Character> flyweightList){
        // 不同对象
        ConcreteCompositeFlyweight concreteFlyweight = new ConcreteCompositeFlyweight();
        for (Character character : flyweightList) {
            concreteFlyweight.add(character,this.factory(character));
        }
        return concreteFlyweight;
    }

    /**
     * 单纯享元工厂方法，如果存在就不添加
     * @param character
     * @return
     */
    public Flyweight factory(Character character) {
        Flyweight flyweight = flyweightMap.get(character);
        if (flyweight == null){
            //如果对象不存在则创建一个新的Flyweight对象
            flyweight = new ConcreteFlyweight(character);
            //把这个新的Flyweight对象添加到缓存中
            flyweightMap.put(character,flyweight);
        }
        return flyweight;
    }
}
