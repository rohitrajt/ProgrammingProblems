package com.rohit;

public class FibonacciNumbers {

    /**
     * Will print fibonacci numbers
     *
     * @param num : number of fibonacci numbers to print
     */
    public void print(int num) {

        int a = 0;

        int b = 1;

        int result = 0;

        for (int i = 0; i < num; i++) {

            if (i == 0) {
                System.out.println(0);
                continue;
            }

            if (i == 1) {
                System.out.println(1);
                continue;
            }


            result = a + b;

            System.out.println(result);

            a = b;

            b = result;
        }
    }

    public int get(int n) {
        if(n == 1) {
            return 0;
        }

        if( n == 2 ) {
            return 1;
        }

        return get(n - 1 ) + get(n - 2);
    }
}
