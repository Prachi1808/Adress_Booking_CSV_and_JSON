package com.bridgelabz.corejavaexamples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnotationExample {


import java.lang.annotation.*;
import java.lang.reflect.Method;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface MethodInfo {
    String author() default "Prachi";

    String date();

    int revision() default 1;

    String comments();
}

public class AnnotationExample {
    @Deprecated
    @MethodInfo(comments = "Deprecated Method", date = "23 march 2022")
    public static void oldMethod() {
        System.out.println("Old Method Don't Use It.");
    }

    public static void annotationExample() {
        try {
            for (Method method : AnnotationExample.class.getMethods()) {
                if (method.isAnnotationPresent(MethodInfo.class)) {
                    try {
                        for (Annotation anno : method.getDeclaredAnnotations()) {
                            System.out.println("Annotation in Method '" + method + "': " + anno);
                        }
                        MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
                        if (methodAnno.revision() == 1) {
                            System.out.println("Method with Revision no 1 = " + method);
                        }
                    } catch (Throwable throwable) {
                        throwable.printStackTrace();
                    }
                }
            }
        } catch (SecurityException se) {
            se.printStackTrace();
        }
    }

    @Override
    @MethodInfo(author = "Prachi", comments = "Main Method", date = "23 march 2022", revision = 1)
    public String toString() {
        return "Overridden toString Method";
    }
}