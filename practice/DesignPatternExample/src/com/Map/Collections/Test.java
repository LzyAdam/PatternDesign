package com.Map.Collections;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] is={10,2,3,4,5};
        int[] is1={10,2,3,4,5};
        Arrays.toString(is);
        System.out.println(Arrays.toString(is));
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);
        Arrays.sort(is);
        System.out.println(Arrays.toString(is));

        System.out.println(Arrays.binarySearch(is,5));
        Arrays.binarySearch(is,5);

        Arrays.equals(is,is1);
        System.out.println(Arrays.equals(is,is1));//is排过序


    }
}
