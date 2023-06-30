package com.dp.creational.e.factory_method;

public class DemoFactoryMethod {

	public static void main(String[] args) {

		//CSV
		BatchProcessor batchProcessor = new BatchProcessorTextImpl();
		batchProcessor.processBatch("data");
	}

}
