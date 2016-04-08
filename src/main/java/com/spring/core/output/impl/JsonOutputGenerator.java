package com.spring.core.output.impl;

import com.spring.core.output.IOutputGenerator;

public class JsonOutputGenerator implements IOutputGenerator {

	@Override
	public void generateOutput() {
		System.out.println("Json Output Generator");
	}

}
