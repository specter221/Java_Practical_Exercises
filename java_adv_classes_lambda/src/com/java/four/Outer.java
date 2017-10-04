package com.java.four;

public class Outer {

    public static Hand method() {

        class Palm implements Hand {

            @Override
            public void facepalm() {
                System.out.println("he");
            }

        }
        Palm palm = new Palm();
        palm.facepalm();
        return palm;
    }
}

class MainClass{
    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();
    }
}
