package com.springframework.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pengyongjian
 * @Description:
 * @date 2020-09-09 18:46
 */
public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyBean.class);
		MyBean bean = applicationContext.getBean(MyBean.class);
		String testStr = bean.getTestStr();
		System.out.println(testStr);
	}
}
