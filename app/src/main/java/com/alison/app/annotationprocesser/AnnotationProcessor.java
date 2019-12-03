//package com.alison.app.annotationprocesser;
//
//import javax.annotation.processing.AbstractProcessor;
//import javax.annotation.processing.RoundEnvironment;
//import javax.annotation.processing.SupportedAnnotationTypes;
//import javax.annotation.processing.SupportedSourceVersion;
//import javax.lang.model.SourceVersion;
//import javax.lang.model.element.*;
//import javax.lang.model.util.ElementFilter;
//import javax.tools.Diagnostic;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
///**
// * @Author alison
// * @Date 2019/12/1  16:21
// * @Version 1.0
// * @Description
// */
//@SupportedAnnotationTypes(value = {"com.alison.app.annotationprocesser.TestAnnotation"})
//@SupportedSourceVersion(value = SourceVersion.RELEASE_8)
//public class AnnotationProcessor extends AbstractProcessor {
//    @Override
//    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
//        System.out.println("Log in AnnotationProcessor.process");
//        for (TypeElement typeElement : annotations) {
//            //annotations的值是通过@SupportedAnnotationTypes声明的且目标源代码拥有的所有Annotations
//            System.out.println(typeElement);
//        }
//        System.out.println(roundEnv);
//        Set<? extends Element> elements = roundEnv.getRootElements();//获取源代码的映射对象
//        for (Element e : elements) {
//            //获取源代码对象的成员
//            List<? extends Element> enclosedElems = e.getEnclosedElements();
//            //留下方法成员,过滤掉其他成员
//            List<? extends ExecutableElement> ees = ElementFilter.methodsIn(enclosedElems);
//            for (ExecutableElement ee : ees) {
//                note("--ExecutableElement name is " + ee.getSimpleName());
//                List<? extends AnnotationMirror> as = ee.getAnnotationMirrors();//获取方法的Annotations
//                note("--as=" + as);
//                for (AnnotationMirror am : as) {
//                    //获取Annotation的值
//                    Map<? extends ExecutableElement, ? extends AnnotationValue> map = am.getElementValues();
//                    Set<? extends ExecutableElement> ks = map.keySet();
//                    for (ExecutableElement k : ks) {//打印Annotation的每个值
//                        AnnotationValue av = map.get(k);
//                        note("----" + ee.getSimpleName() + "." + k.getSimpleName() + "=" + av.getValue());
//                    }
//                }
//            }
//        }
//        return true;
//    }
//
//    private void note(String msg) {
//        processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, msg);
//    }
//}
