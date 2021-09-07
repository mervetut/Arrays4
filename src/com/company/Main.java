package com.company;

public class Main {

    public static void main(String[] args) {
	int [] array = new int[] {5, 4, -7, -2, -1};
        System.out.print("Original array: ");
        for (int j : array) {
            System.out.print(j + " ");
        }

        System.out.println();

        System.out.print("The array in reverse order: ");
	for (int i = array.length -1; i >=0; i--)
        System.out.print(array[i] + " ");
    }
}
