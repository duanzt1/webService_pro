package client;

import example.HelloWorld;

public class Client {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHelloWorldFrom("duan");
    }
}
