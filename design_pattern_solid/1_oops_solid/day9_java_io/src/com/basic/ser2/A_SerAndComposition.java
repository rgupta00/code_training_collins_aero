package com.basic.ser2;

import com.basic.ser1.Account;

import java.io.*;

//all the composite object must be seril.... then it will not fail
class Collor{
    int size;
}
class Dog implements Serializable{
     transient  Collor collor;
     String dogName;
     //java is not allowed me to have composite object ie not serilization
     
     //i want to interfare bw ser process
     
     //callback methods
     private void writeObject(ObjectOutputStream oos) throws IOException{
    	 oos.defaultWriteObject();
    	 oos.writeInt(collor.size);
     }
     
     private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
    	 ois.defaultReadObject();
    	 collor=new Collor();
    	 collor.size=ois.readInt();
     }
}




public class A_SerAndComposition {
    public static void main(String[] args)throws Exception {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("dataser.ser")));
        Dog dog=new Dog();
        dog.dogName="foo";
        Collor collor=new Collor();
        collor.size=28;

        dog.collor=collor;

        oos.writeObject(dog);

        dog=null;

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("dataser.ser")));
        dog=(Dog) ois.readObject();
        System.out.println(dog.dogName);
        System.out.println(dog.collor.size);

        System.out.println("--------------------");

    }
}
