package com.alison.app.condition;

import com.alison.app.condition.pojo.Order;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author alison
 * @Date 2019/12/1  13:07
 * @Version 1.0
 * @Description
 */
public class ConditionalTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

    @Test
    public void testBean() {
        System.setProperty("order", "1");
        applicationContext.register(BeanConfig.class);
        applicationContext.refresh();

        // 获取所有的bean , 通过获取所有bean的名字，在根据名字获取bean
        String[] beans = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beans).forEach(beanName -> System.out.println(applicationContext.getBean(beanName)));
        // 获取对应类型的数据
        Map<String, Order> map = applicationContext.getBeansOfType(Order.class);
        System.out.println(map);
    }
}
