package com.spring.core.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.output.OutputHelper;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("outputhelper.xml");

		OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
		output.generateOutput();
	}

}
