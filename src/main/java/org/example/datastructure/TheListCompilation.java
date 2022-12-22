package org.example.datastructure;

import java.util.ArrayList;
import java.util.List;

public class TheListCompilation {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("test");

        System.out.println("-------------using for without the index------");
        for (String color:colors){
            System.out.println(color);
        }
        System.out.println("-------------using foreach------");
        colors.forEach(System.out::println);

        System.out.println("-------------using for with index------");
        for (int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }

    }

}
