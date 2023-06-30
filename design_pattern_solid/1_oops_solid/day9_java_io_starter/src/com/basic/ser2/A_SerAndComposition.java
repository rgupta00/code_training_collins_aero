package com.basic.ser2;

import com.basic.ser1.Account;

import java.io.*;

//all the composite object must be seril.... then it will not fail
class Collor{
    int size;
}
class Dog implements Serializable{
     Collor collor;
     String dogName;
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
