package cn.hwolf.strategy.impl;

import cn.hwolf.strategy.MemberStrategy;

/**
 * 普通会员
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/19.
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price) {
        System.out.println("没有折扣");
        return price;
    }

}

