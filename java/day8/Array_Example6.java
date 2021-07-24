package day8;

import java.util.ArrayList;
import java.util.List;

public class Array_Example6 {

    public static void main(String[] args) {

        List<String> std = new ArrayList<String>();
        std.add("Lahari");
        std.add("Amulya");
        std.add("Pooja");
        std.add("Sravanthi");

        System.out.println("Size of the array : " + std.size());
        System.out.println("Name is in list : "+ std.get(3));
        for (String st:std) {
            System.out.println(st);
        }
    }
}
