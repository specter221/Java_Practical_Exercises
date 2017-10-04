package com.stackroute.java.robo;

public class Robo{

    public float compute(float num1, float num2, String operation) {

        float result=0;

        switch (operation) {
            case "a":
                result = num1 + num2;
                break;

            case "b":
                result = num1 - num2;
                break;

            case "c":
                result = num1 * num2;
                break;


            case "d":
                result = num1 / num2;
                break;

            default:
                System.out.println("invalid input");
        }

            return result;

    }

}
