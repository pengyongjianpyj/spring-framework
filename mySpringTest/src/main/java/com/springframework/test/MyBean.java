package com.springframework.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author pengyongjian
 * @Description:
 * @date 2020-09-10 09:20
 */
@Component
@ComponentScan("com.springframework.test")
public class MyBean {
	private String testStr = "hello world!";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
}
