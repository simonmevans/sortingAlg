package com.company;

public class BubbleSort {

    public  void printAry(int[] ary, int pass) {
        System.out.print("Pass " +(pass+1)+ " |");
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "|");
        }
        System.out.println("\n-----------");
    }

    public void bubbleSort(int ary[]) {
        int length = ary.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (ary[j] > ary[j + 1]) {
                    int temp = ary[j];
                    ary[j] = ary[j + 1];
                    ary[j + 1] = temp;
                }
            }
            printAry(ary, i);
        }
    }

    BubbleSort(int ary[]) {
        bubbleSort(ary);
    }
}
