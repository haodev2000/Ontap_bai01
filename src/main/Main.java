package main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {-5,-5,7,1,-5,3,-5,5,-5,6};

        Arrays.sort(a);
        int[] b = new int[a.length];

        int j = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == 0){
                continue;
            }
            b[j] = a[i];
            j++;
        }

        for (Integer c : b){
            System.out.print(c);
        }
    }

}
