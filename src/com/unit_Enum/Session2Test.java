package com.unit_Enum;

import java.lang.annotation.*;

public class Session2Test {

    @Documented
    @Target({ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface SelfAnnotation{
        String run();
    }

    public static void main(String[] args) {

    }
}
