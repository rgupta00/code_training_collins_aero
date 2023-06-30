package com.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class C_ReadingAPhotoUsingByteStreamWithBuffer {
    public static void main(String[] args) throws Exception{
       //copy a photo from one file to another using byte streams
    	///xxxxStream :byte stream
    	
    	//Time taken: 795 ms
    	//Time taken: 1 ms
    	long start=System.currentTimeMillis();
    	
    	FileInputStream fis=
    			new FileInputStream(new File("/home/raj/Desktop/io_photo/mali.jpg"));
    	
    	FileOutputStream fos=
    			new FileOutputStream(new File("/home/raj/Desktop/io_photo/mali3.jpg"));
    	//4KB
    	byte[] byteBuffer= new byte[4*1024];
    	
    	int noOfByteRead=0;
    	while((noOfByteRead=fis.read(byteBuffer))!=-1){
    		fos.write(byteBuffer);
    	}
    	
    	fis.close();
    	fos.close();
    	
    	long end=System.currentTimeMillis();
    	System.out.println("Time taken: "+ (end-start)+" ms");
    }
    
}






