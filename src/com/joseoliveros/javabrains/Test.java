package com.joseoliveros.javabrains;

public class Test {

    public static void main(String[] args) {

        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println(a);
        System.out.println(b);
    }
}
