package com.java.three;

import java.util.Scanner;

public class Sequence {

    static Scanner sc = new Scanner(System.in);
    static int size = sc.nextInt();

    static class ReverseSequenceSelector implements selector{

         @Override
        public void end() {
         }

        @Override
        public void current() {
            for(int i=size-1 ; i>=0 ; i--)
            {
                System.out.print("\t"+i);
            }
        }

        @Override
        public void next() {
        }
    }


    public static void main(String[] args) {
        ReverseSequenceSelector rev = new ReverseSequenceSelector();
        rev.current();
    }
}



