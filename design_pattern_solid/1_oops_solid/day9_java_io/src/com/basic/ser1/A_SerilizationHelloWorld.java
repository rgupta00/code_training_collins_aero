package com.basic.ser1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A_SerilizationHelloWorld {
    public static void main(String[] args)throws Exception {

    
        Account account=new Account(1,"raj",560000);
  
        account.id=44;
        account.name="tarun";
        account.salary=567777.00;
        account.bankName="PNB";
        
        //Ser io proess
        
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("demo.txt")));
        oos.writeObject(account);
        
        System.out.println(account);
        System.out.println("--------------------");
        

    }
}
