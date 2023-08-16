package com.webservice.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassStream {

    public static void main(String[] args) {
        Integer[] a = new Integer[]{1, 2, 3, 4, 8, 5, 5};
        var x = Stream.of(a);
        List<Integer> b = Stream.of(a).collect(Collectors.toList());
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        // Tìm phần tử lớn nhất trong danh sách
        int maxNumber = Collections.max(b);
    }
}
