package day8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array_Example7 {


    public static void main(String[] args) {

        ArrayList<String> std = new ArrayList<String>() ;
        std.add("Lahari");
        std.add("Amulya");
        std.add("Pooja");
        std.add("Sravanthi");
        System.out.println("Total count in array : "+ std.size());

        ListIterator it = std.listIterator() ;
        {
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("started****************");
            while (it.hasPrevious()){
                System.out.println(it.previous());
            }
        }
    }
}
