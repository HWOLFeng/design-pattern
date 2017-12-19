package cn.hwolf.strategy;

/**
 * 会员打折策略
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public interface MemberStrategy {
    /**
     * 策略方法
     */
    double calcPrice(double price);
}
