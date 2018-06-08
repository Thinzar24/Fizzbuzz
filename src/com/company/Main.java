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
        System.out.println(startnum);
        System.out.println(endnum);
        if(startnum == endnum) {
            System.out.println("Shazam!");
        }

        for (int i = startnum; i < endnum; i++) { // for loop to print 1 -100

            if (i % 3 == 0 && i % 5 == 0) { // 3 and 5 have 0 modulo print fizzbuzz
                    System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // 3 had 0 modulo print fizz
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // 5 had 0 modulo print buzz
                System.out.println("Buzz");
            } else {
                System.out.println(i);

            }
//            if (endnum < startnum) {
//                System.out.println(startnum);
//                System.out.println(endnum);
//            } else if (startnum == endnum) {
//                System.out.println("Shazam!!");
//
//
//            }
        }

   /* public static void Shazam() {

     for (int i = 1; i <= 101; i++) {

            if (endnum < startnum) {
                System.out.println(startnum);
                System.out.println(endnum);
                System.out.println("First and Last  number should not be same ");
            } else if (startnum == endnum) {
                System.out.println(" Shazam !");
            } else {
                System.out.println(i);
            }

        }

    }*/

    }
}


