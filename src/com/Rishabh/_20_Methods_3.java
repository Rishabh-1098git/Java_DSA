package com.Rishabh;

import java.util.Arrays;

public class _20_Methods_3 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 34, 12, 56};
        ChangeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void ChangeArr(int[] array) {
            array[0]=99;// here the original object is changed bcz object's value is passed by
                    // reference means both  arr and array points toward same object and
                    // changes made by one will reflect in others.
    }


}