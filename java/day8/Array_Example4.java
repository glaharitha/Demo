package day8;

import java.util.Arrays;

public class Array_Example4 {


    public static void main(String[] args) {

        int i [] = new int[5];
        i[2] = 500;
        i[1] = 100;
        i[3] = 350;
        i[4] = 650;
        i[0] = 850;

        for(int j : i){
            System.out.println(j);
        }

        System.out.println("************");

        Arrays.sort(i);
        for(int x=0;x < i.length;x++){
            System.out.println(i[x]);}


    }
}
