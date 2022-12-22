package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] colors = new String[4];
        colors[0] = "test0";
        colors[1] = "test1";
        colors[2] = "test2";
        System.out.println(colors.length);
//        for (int i = 0; i<colors.length; i++){
////            System.out.println(colors[i]);
//        }
//        for (int i = colors.length-1; i>=0; i--){
//            System.out.println(colors[i]);
//        }
//        System.out.println("Hello world!");
       System.out.println(Arrays.toString(colors));
    }

}