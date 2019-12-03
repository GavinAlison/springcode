package com.alison.app.annotationprocesser;

/**
 * @Author alison
 * @Date 2019/12/1  16:31
 * @Version 1.0
 * @Description
 */
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("success");
        test();
    }

    @TestAnnotation(value = "method is test")
    public static void test()throws Exception{

    }
}
