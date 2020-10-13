package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] lista = {5,4,3,2,1};

        tulostus(lista);
        System.out.println("");
        bubbleSort(lista);
        tulostus(lista);


    }

    public static void bubbleSort(int[] n) {

        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j+1]) {
                    int apu = n[j];
                    n[j] = n[j+1];
                    n[j+1] = apu;
                }
            }
        }

    }

    public static void tulostus(int[] n) {
        System.out.print("[ ");
        for (int i = 0; i < n.length; i++) {
            if (i == n.length - 1) {
                System.out.print(n[i] + " ");
                break;
            }
            System.out.print(n[i] + ", ");
        }
        System.out.print("]");
    }
}
