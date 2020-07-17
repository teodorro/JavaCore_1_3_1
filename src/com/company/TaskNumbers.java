package com.company;

import java.util.Arrays;
import java.util.List;

public class TaskNumbers {
    public void start(){
        List<Integer> listik = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        listik.stream().filter(x -> x > 0).filter(y -> y % 2 == 0).sorted().forEach(System.out::println);
    }
}
