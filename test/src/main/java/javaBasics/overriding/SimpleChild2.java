package javaBasics.overriding;

import javaBasics.overriding2.Child;

import java.util.ArrayList;

public class SimpleChild2 extends Parent {
        int x=1111111;
    protected int doStuff(){
        return x;
    }

    public static void main(String[] args) {
        Parent p=new SimpleChild2();
        System.out.println(p.doStuff());
    }
}
