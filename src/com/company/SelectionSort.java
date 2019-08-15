package com.company;

public class SelectionSort {

    public void selectionSort(int[] ary) {
        int length = ary.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (ary[j] < ary[minIndex])
                    minIndex = j;
            }
            int temp = ary[minIndex];
            ary[minIndex] = ary[i];
            ary[i] = temp;


        }
    }

    SelectionSort(int ary[]) {
        selectionSort(ary);
    }
}
