package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = 23;
        int[] arr = {6, 25, 91, 23, 72, 9, 18, 6};
        boolean found = false;

        for (int i = 0; i < 8; i++) {
            if (arr[i] == n) {
                found = true;
                break;
            }
        }
        System.out.println(found);

    }
}
