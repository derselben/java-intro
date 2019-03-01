package lesson04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program04 {
    public static void main(String[] args) {

        /** CLASS WORK */



        /** HOME WORK */

        ArrayList <String> arr = new ArrayList<>();
        // add 9 strings
        arr.add("Yemen");
        arr.add("Saint Pierre and Miquelon");
        arr.add("Bolivia");
        arr.add("Italy");
        arr.add("Switzerland");
        arr.add("Dominica");
        arr.add("Barbados");
        arr.add("Vanuatu");
        arr.add("Kuwait");

        Random r = new Random();
        int i = r.nextInt(arr.size());
        String v = arr.get(i);

        // remove 1 value
        System.out.println("***** Removing '" + v +"' from the Collection *****");
        arr.remove(v);

        // check if value is not in collection anymore and print the result
        if (!arr.contains(v)) System.out.println("***** '" + v + "' is not in the Collection anymore! *****\n");

        // print collection before sort
        for (String s: arr) System.out.println(s);

        // sort values in the collection
        Collections.sort(arr);
        System.out.println("\n***** Collection was sorted! *****");

        // print collection after sort
        for (String s: arr) System.out.println(s);

    }
}
