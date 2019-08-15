package com.company;

import java.util.Collections;

public class Main {
    public static void fillRand(int [] ary){
        for(int i =0; i<ary.length; i++)
        {
            ary[i] = (int) (Math.random()*100);
        }
    }
    public static void printAry(int [] ary){
        System.out.print("|");
        for(int i =0; i< ary.length; i++)
        {
            System.out.print(ary[i] + "|");
        }
        System.out.println("\n-----------");
    }
    public static void main(String[] args) {
	int ary [] = new int[10];
	    fillRand(ary);
	    printAry(ary);
	    BubbleSort bubba = new BubbleSort(ary);
	    printAry(ary);
	    System.out.println("-----END SORTING ALG-----");
	    fillRand(ary);
	    printAry(ary);
	    SelectionSort select = new SelectionSort(ary);
	    printAry(ary);
        System.out.println("-----END SORTING ALG-----");
        fillRand(ary);
        printAry(ary);
        InsertionSort in = new InsertionSort(ary);
        printAry(ary);
    }
}
