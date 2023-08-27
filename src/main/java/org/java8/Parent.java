package org.java8;

public class Parent implements MyInterface {
    public  static  void  main(String args[]){
        MyInterface mi = () -> System.out.println("Hello");
         mi.showInterface();
    }

    @Override
    public void showInterface() {

    }
}

