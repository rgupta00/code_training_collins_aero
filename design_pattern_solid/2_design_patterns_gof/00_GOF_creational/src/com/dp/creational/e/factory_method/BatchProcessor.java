package com.dp.creational.e.factory_method;

import java.io.File;
import java.util.List;

//Factory method design pattern: code flexiblity 

abstract public class BatchProcessor {

	
	public abstract Parser createParser(File file);
	
	public void processBatch(String fileName) {
		File file = openFile();
//		TextParser parser = new TextParser(file);
		Parser parser = createParser(file);

		List<Record> records = parser.parse();
		processorRecords(records);
		writeSummray();
		closeFile();
	}

	private void processorRecords(List<Record> records) {
		System.out.println("processing each record to db");
	}

	private void writeSummray() {
		System.out.println("writing summery report");
	}

	private void closeFile() {
		System.out.println("closing the file...");
	}

	private File openFile() {
		System.out.println("open the file...");
		return null;
	}
}