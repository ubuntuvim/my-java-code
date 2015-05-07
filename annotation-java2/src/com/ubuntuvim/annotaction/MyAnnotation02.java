package com.ubuntuvim.annotaction;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * annotation的定义使用 @interface
 * @author cdq@fortunes.com.cn
 */
@Target(ElementType.METHOD)  //  定义注解使用的位置。仅仅使用在方法上
@Retention(RetentionPolicy.RUNTIME)  // 定义注释解析的时机，为运行时
@Documented
public @interface MyAnnotation02 {
	//  定义annotation的属性
	String description() default "";
	boolean isAnnotation() default true;
}
