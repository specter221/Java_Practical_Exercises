package com.client.java;

import java.util.Scanner;

import com.stackroute.java.robo.Robo;


public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter num1");
        int num1= sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the a-addition,b-subtraction,c-multiplication,d-division");
        String operation= sc.next();
        Robo rob=new Robo();
        float x=rob.compute(num1,num2,operation);

        System.out.println(x);

    }
}
