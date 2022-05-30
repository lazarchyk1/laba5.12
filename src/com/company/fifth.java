package com.company;

public class fifth {
    public static void main(String[] args) {
        int array[] = new int[15];
        int count = 0;
        for (int i = 0; i < 15; i++) {
            array[i] = (int) Math.round(Math.random() * 10);
            System.out.print(array[i] + " ");
            if(array[i]%2==0){
                count++;
            }
        }
        System.out.println();
        System.out.println("Parnich elementiv v cycle: " + count);
    }
}