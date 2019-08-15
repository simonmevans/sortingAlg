package com.company;

public class InsertionSort {

    public void insertionSort(int ary[]) {
        int length = ary.length;
        for (int i = 0; i < length; i++) {
            int key = ary[i];
            int j = i;
            while (j > 0 && ary[j - 1] > key) {
                ary[j] = ary[j - 1];
                j = j - 1;
            }
            ary[j] = key;
        }
    }
    InsertionSort(int ary[]){
        insertionSort(ary);
    }
}
