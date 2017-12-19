package cn.hwolf.strategy.impl;

import cn.hwolf.strategy.MemberStrategy;

/**
 * 中级会员打折策略
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("中级会员打8折");
        return price * 0.8;
    }
}
