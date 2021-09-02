package com.company;

import java.util.Arrays;

public class ArraysClass {
    public void twoDArray(){
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
    public void print2DArray(){
        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void print2DArrayUsingForEach(){
        int[][] a = {
                {1, -2, 3},
                {-4, -5, 6, 9},
                {7},
        };

        for (int[] i: a) {
            for(int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
    public void threeDArray(){
        int num[][][] = {
                {
                        {1, 2, 3, 9},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        for (int i = 0; i < num.length; ++i) {
            for(int j = 0; j < num[i].length; ++j)
            {
                for (int k = 0; k < num[i][j].length; ++k) {
                    System.out.print(num[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
    }
    public void threeDArrayUsingForEach(){
        int num[][][] = {
                {
                        {1, 2, 3, 9},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        for (int[][] i: num) {
            for(int[] j: i)
            {
                for (int k: j) {
                    System.out.print(k + "\t");
                }
                System.out.println();
            }
        }
    }
    public void simpleArray(){
        int[] num = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(num));
    }
    public void copyArrayUsingArrayCopy(){
        int[] n1 = {2, 3, 12, 4, 12, -2};
        int[] n3 = new int[5];
        int[] n2 = new int[n1.length];
        System.arraycopy(n1, 0, n2, 0, n1.length);
        System.out.println("n2 = " + Arrays.toString(n2));
        System.arraycopy(n1, 2, n3, 1, 2);
        System.out.println("n3 = " + Arrays.toString(n3));
    }
}
