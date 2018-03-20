package com.missingartifacts;

import java.util.Scanner;

/**
 * Sample Input

     10
     1 42
     2
     1 14
     3
     1 28
     3
     1 60
     1 78
     2
     2
 Sample Output

     14
     14
 */


public class Main {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
