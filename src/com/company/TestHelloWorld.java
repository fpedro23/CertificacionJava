package com.company;

public class TestHelloWorld {

    public static void main(String[] args) {
        // write your code here
        HelloWorld hello = new HelloWorld();
        hello.greet();
    }
}


class HelloWorld {
    public void greet(){
        System.out.println("Hello world java");
    }
}
