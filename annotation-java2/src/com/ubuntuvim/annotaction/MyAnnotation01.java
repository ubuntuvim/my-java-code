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
@Target(ElementType.TYPE)  //  定义注解使用的位置，可以使用在类、接口或enum声明
@Retention(RetentionPolicy.RUNTIME)  // 定义注释解析的时机，为运行时
@Documented
public @interface MyAnnotation01 {
	String value() default "";  // 定义annotation的一个属性，默认值为“”
	//  生命几种类型
	enum ClsType {
		staticCls, dynCls, otherCls
	};
	//    定义几种类的类型
	ClsType clsType() default ClsType.dynCls;
}
