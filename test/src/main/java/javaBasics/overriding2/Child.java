package javaBasics.overriding2;

import javaBasics.overriding.Parent;

public class Child extends Parent {

    public static void main(String[] args) {
        new Child().callStuff();
    }

    void callStuff(){
        System.out.println("this: "+ this.doStuff());

        Parent p=new Parent();

//        System.out.println("parent:  "+p.doStuff()); //error at compile time
    }

}
