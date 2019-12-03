package com.alison.app.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

import java.util.Map;

/**
 * @Author alison
 * @Date 2019/12/3  20:20
 * @Version 1.0
 * @Description
 */
public class OnClazzCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        context==>ConditionEvaluator$ConditionContextImpl
        System.out.println(context);
//        System.out.println(context.getRegistry());
//        System.out.println(context.getBeanFactory());
//        System.out.println(context.getClassLoader());
//        System.out.println(context.getResourceLoader());
//        System.out.println(context.getEnvironment());

//        metadata ==> StandardAnnotationMetadata
        System.out.println(metadata);
//        metadata.getAnnotationAttributes("com.alison.app.condition.ConditionOnClazz")
//        {value=[class com.alison.app.condition.pojo.Order]}
        Map<String, Object> conditionMap = metadata.getAnnotationAttributes(ConditionOnClazz.class.getName());
        return ClassUtils.isPresent(((Class[]) conditionMap.get("value"))[0].getName(), OnClazzCondition.class.getClassLoader());
    }
}
