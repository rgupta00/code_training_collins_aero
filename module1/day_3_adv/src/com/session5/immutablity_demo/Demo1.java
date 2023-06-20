package com.session5.immutablity_demo;

import java.util.Arrays;
import java.util.Date;
//Marker Cloneable is empty!
class Foo implements Cloneable{
    private int i;
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    @Override
    protected Object clone() {
       try{
           return super.clone();
       }catch (Exception e){

       }
       return null;
    }
}
//Need of immutable class vs object?
final class MyImmutableClass{
//    private final int i;
//    private final int arr[];
//    private final Date date;
//    private Foo foo;

  
}
public class Demo1 {
    public static void main(String[] args) {
        int arr[]={5,6,77};
        Date date=new Date();
        Foo foo=new Foo();
        foo.setI(55);

       

        //Need of immutable classes? are thread safe

        //how to create immutable classes?
    }
}
