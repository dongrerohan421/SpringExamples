package com.spring.core.output.impl;

import com.spring.core.output.IOutputGenerator;

public class CsvOutputGenerator implements IOutputGenerator {

	@Override
	public void generateOutput() {
		System.out.println("CSV Output Generator");
	}

}
