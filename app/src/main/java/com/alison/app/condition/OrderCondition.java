package com.alison.app.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author alison
 * @Date 2019/12/1  11:59
 * @Version 1.0
 * @Description
 */
public class OrderCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return System.getProperty("order") != null;
    }
}
