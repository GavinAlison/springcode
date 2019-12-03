package com.alison.app.condition;

import com.alison.app.condition.pojo.Order;
import com.alison.app.condition.pojo.Orderdetail;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * @Author alison
 * @Date 2019/12/1  13:01
 * @Version 1.0
 * @Description
 */
//@Configuration   没有必要在加configuration注解
//@Conditional({OrderCondition.class}) // 会自动检测OrderCondition##matches的结果，true 注册容器, false 不进行注册
//@ConditionOnClazz(Order.class)
@ConditionalOnClass
public class BeanConfig {

    //    @Conditional({OrderCondition.class, OrderFalse.class})
    @Bean(name = "order")
    public Order order() {
        return new Order(1, "Air", "Apple air");
    }

    @Bean("orderdetail")
    public Orderdetail orderDetail() {
        return new Orderdetail(1L, "购物者", 1L);
    }
}
