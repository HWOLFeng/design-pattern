package cn.hwolf.strategy;

/**
 * 持有 MemberStrategy 引用, Context 背景
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public class Price {
    private MemberStrategy memberStrategy;

    public Price(){

    }

    /**
     *
     * @param memberStrategy 具体策略对象
     */
    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * 打折策略
     */
    public double contextStrategy(double price){
       return this.memberStrategy.calcPrice(price);
    }
}
