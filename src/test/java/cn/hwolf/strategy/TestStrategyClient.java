package cn.hwolf.strategy;

import cn.hwolf.strategy.impl.AdvancedMemberStrategy;
import cn.hwolf.strategy.impl.IntermediateMemberStrategy;
import cn.hwolf.strategy.impl.PrimaryMemberStrategy;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2017/12/20.
 */
public class TestStrategyClient {
    @Test
    public void testContextStrategy(){
        // 选择策略
        AdvancedMemberStrategy advancedMemberStrategy = new AdvancedMemberStrategy();
        IntermediateMemberStrategy intermediateMemberStrategy = new IntermediateMemberStrategy();
        PrimaryMemberStrategy primaryMemberStrategy = new PrimaryMemberStrategy();

        double bookPrice = 100.0;

        // 持有不同计算价格策略的对象
        Price price = new Price(advancedMemberStrategy);
        Price price1 = new Price(intermediateMemberStrategy);
        Price price2 = new Price(primaryMemberStrategy);
        // 测试数据
        Assert.assertTrue(price.contextStrategy(bookPrice) == 50.0);
        Assert.assertTrue(price1.contextStrategy(bookPrice) == 80.0);
        Assert.assertTrue(price2.contextStrategy(bookPrice) == 100.0);
    }
}
