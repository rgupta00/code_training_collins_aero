package com.dp.creational.e.factory_method;

import java.io.File;

public class BatchProcessorTextImpl extends BatchProcessor{

	@Override
	public Parser createParser(File file) {
		return new TextParser(file);
	}

}
