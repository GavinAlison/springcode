package com.alison.app.annotationprocesser;

import java.lang.annotation.*;

/**
 * @Author alison
 * @Date 2019/12/1  16:28
 * @Version 1.0
 * @Description
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
@Inherited
@Documented
public @interface TestAnnotation  {
    String value();
}
