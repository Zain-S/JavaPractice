package com.company;

public class Arrays {
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
}
