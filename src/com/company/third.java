package com.company;

public class third {
    public static void main(String[] args){
        double m = 0, n = 0, a = 0;
        int array[] = new int [5];
        for(int i = 0; i < 5; i++){
            array[i] = (int) Math.round(Math.random() * 5);
            m = m + array[i];
            System.out.println(array[i] + "");
        }
        System.out.println("");
        int array_1[] = new int [5];
        for(int v = 0; v < 5; v++) {
            array_1[v] = (int) Math.round(Math.random() * 5);
            n = n + array_1[v];
            System.out.println("" + array_1[v] + "");
        }
        System.out.println("");
        int array_2[] = new int [5];
        for(int x = 0; x < 5; x++) {
            array_2[x] = (int) Math.round(Math.random() * 5);
            a = a + array_2[x];
            System.out.println(array_2[x] + "");
        }
        System.out.println("first cycle " + m/5);
        System.out.println("second cycle " + n/5);
        System.out.println("third cycle " + a/5);
        double f = Math.max(m/5, n/5);
        System.out.println(Math.max(f, a/5 ));

    }
}
