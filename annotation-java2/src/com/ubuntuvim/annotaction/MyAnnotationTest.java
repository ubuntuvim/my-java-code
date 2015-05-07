package com.ubuntuvim.annotaction;

import com.ubuntuvim.annotaction.MyAnnotation01.ClsType;

/**
 * 此时的annotation是还没有效果的，还需要自己编写解析的程序。
 * @author cdq@fortunes.com.cn
 */

@MyAnnotation01(value="这是个注解在类上的注解 ...", clsType=ClsType.dynCls)
public class MyAnnotationTest {
	
	@MyAnnotation02(description="这是个注解在方法上的注解...", isAnnotation=false)
	public void testFun(String s) {
		System.out.println("my annotation test...= " + s);
	}
	
	@MyAnnotation02(description="this is annotation, use to main method...", isAnnotation=true)
	public static void main(String[] args) {
		System.out.println("00000000000000000000000000000");
	}
}
