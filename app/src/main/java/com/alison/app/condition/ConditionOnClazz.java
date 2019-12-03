package com.alison.app.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @Author alison
 * @Date 2019/12/3  20:17
 * @Version 1.0
 * @Description
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnClazzCondition.class)
public @interface ConditionOnClazz {
    Class<?>[] value();
}
