package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here
        fizzbuzz();
    }

    private static void fizzbuzz() {
        for (int i = 1; i <= 100; i++) { // for loop to print 1 -100


            if (i % 3 == 0 && i % 5 == 0) { // 3 and 5 have 0 modulo print fizzbuzz
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) { // 3 had 0 modulo print fizz
                System.out.print("Fizz");
            } else if (i % 5 == 00) { // 5 had 0 modulo print buzz
                System.out.println("Buzz");
            } else {
                System.out.println(String.valueOf(i));
            }
        }


    }

}


