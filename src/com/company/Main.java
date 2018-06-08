package com.company;

import java.util.*;


public class Main {
    static Scanner scan = new Scanner(System.in);
    static Random r = new Random();
    static int startnum, endnum;


    public static void main(String[] args) {
        // write your code here
        fizzbuzz();
        //Shazam();

    }

    public static void fizzbuzz() {

        startnum = 1 + r.nextInt(100);
        endnum = 1 + r.nextInt(100);


        int digt = endnum - startnum; // variable for digt

        if (startnum == endnum) { // if first and end is same print out shazam
            System.out.println(startnum);
            System.out.println(endnum);
            System.out.println("Shazam!");

            // if start & last number are last tha 10 print won't take long
        } else if (digt < 10) {
            System.out.println("This won't take long!");
        }

        for (int i = startnum; i < endnum; i++) { // for loop to print 1 -100

            if (i % 3 == 0 && i % 5 == 0) { // 3 and 5 have 0 modulo print fizzbuzz
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // 3 had 0 modulo print fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // 5 had 0 modulo print buzz
                System.out.println("Buzz");
            }else if (i % 7 == 0){
                  System.out.println(i + " multiple of serven ");

                } else {
                System.out.println(i);


            }
        }
    }
}


