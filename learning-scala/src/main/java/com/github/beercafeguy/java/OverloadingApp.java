package com.github.beercafeguy.java;

public class OverloadingApp {

    public static void main(String arr[]){

        display(new String("Hem"));
        display(new Integer(null));
    }
    private static void display(Object object){
        System.out.println("Object: "+object);
    }
    private static void display(String string){
        System.out.println("String: "+string);
    }

    private static void display(Integer integer){
        System.out.println("Integer: "+integer);
    }
}
