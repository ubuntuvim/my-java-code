package com.ubuntuvim.annotaction;

import java.lang.reflect.Method;

/**
 * 使用反射机制解析注解在方法或者类上的注解
 * @author cdq@fortunes.com.cn
 */
public class ParseAnnotation {
	public static void main(String[] args) {
		try {
			Object obj = Class.forName("com.ubuntuvim.annotaction.MyAnnotationTest").newInstance();
			//  @com.ubuntuvim.annotaction.MyAnnotation01(value=这是个注解在类上的注解 ...)
//			Annotation[] ants = obj.getClass().getDeclaredAnnotations();  //  得到注解在类、接口、枚举上的注解
//			for (Annotation a : ants) {
//				System.out.println(a.toString());
//			}
			MyAnnotation01 an1 = obj.getClass().getAnnotation(MyAnnotation01.class);
			System.out.println(an1.clsType());
			if (MyAnnotation01.ClsType.dynCls.equals(an1.clsType())) {
				System.out.println("这是个动态类。。。");
			} else if (MyAnnotation01.ClsType.staticCls.equals(an1.clsType())) {
				System.out.println("这是个静态类。。。");
			} else {
				System.out.println("其他类型的类。。。");
			}
			
			
			Method[] mts = obj.getClass().getDeclaredMethods();
			for (Method m : mts) {
				if (m.isAnnotationPresent(MyAnnotation02.class)) {
					MyAnnotation02 na2 = m.getAnnotation(MyAnnotation02.class);
					String description = na2.description();
					boolean isAnnotation = na2.isAnnotation();
					System.out.println("方法的描述为 = " + description);
					if (isAnnotation) {
						System.out.println("注解为true");
					} else {
						System.out.println("注解为false");
					}
					//  使用反射执行方法
//					try {
//						m.invoke(obj, "执行方法传入的参数。。。" );
//					} catch (IllegalArgumentException e) {
//						e.printStackTrace();
//					} catch (InvocationTargetException e) {
//						e.printStackTrace();
//					}
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
