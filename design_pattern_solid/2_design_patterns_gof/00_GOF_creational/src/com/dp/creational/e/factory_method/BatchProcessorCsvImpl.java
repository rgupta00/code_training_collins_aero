package com.dp.creational.e.factory_method;

import java.io.File;

public class BatchProcessorCsvImpl extends BatchProcessor {

	@Override
	public Parser createParser(File file) {
		return new CsvParser(file);
	}

}
