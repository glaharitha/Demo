package day8;

import java.util.Arrays;

public class Array_Example3 {


    public static void main(String[] args) {

        String std [] = {"Ravinder","Niveditha","Laharitha","Pranitha","Santosh"};

        for (String st:std){
            if(st.contains("Santosh")){
                System.out.println(st + " present in list");
            }

        }
        Arrays.sort(std);
        for(int i=0;i <std.length;i++){
            System.out.println(std[i]);}
        //System.out.println(std);
    }
}
