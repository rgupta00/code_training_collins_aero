package com.basic.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class B_ReadingAPhotoUsingByteStream {
    public static void main(String[] args) throws Exception{
       //copy a photo from one file to another using byte streams
    	///xxxxStream :byte stream
    	
    	//Time taken: 795 ms
    	
    	long start=System.currentTimeMillis();
    	
    	FileInputStream fis=
    			new FileInputStream(new File("/home/raj/Desktop/io_photo/mali.jpg"));
    	
    	FileOutputStream fos=
    			new FileOutputStream(new File("/home/raj/Desktop/io_photo/mali2.jpg"));
    	
    	int i=0;
    	while((i=fis.read())!=-1){
    		fos.write(i);
    	}
    	
    	fis.close();
    	fos.close();
    	
    	long end=System.currentTimeMillis();
    	System.out.println("Time taken: "+ (end-start)+" ms");
    }
    
}
