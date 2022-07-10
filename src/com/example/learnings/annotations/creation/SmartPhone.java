package com.example.learnings.annotations.creation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Syntax to create annotations, having no variables - Marker Annotations, having one variable -
 * Single Value Annotations, having more than one variable - Multiple Value Annotations Also
 * see @Deprecated , @Inherited
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
  String os() default "Symbian";

  int version() default 1;
}
