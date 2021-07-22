package javaBasics.StringInJava;

import java.util.HashSet;

public class WrappedString {
    private String s;

    public WrappedString(String s){
        this.s=s;
    }




    public static void main(String[] args) {
        HashSet<Object> hs=new HashSet<>();

        WrappedString s1=new WrappedString("aaa");
        WrappedString s2=new WrappedString("aaa");

        String ss1=new String("aaa");
        String ss2=new String("aaa");

        hs.add(s1);
        hs.add(s2);
        hs.add(ss1);
        hs.add(ss2);
        System.out.println(hs.size());

    }
}
