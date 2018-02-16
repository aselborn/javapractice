package se.selborn.practice.lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Some Labda Stuff!");

        Boolean exists = Names().stream()
                .anyMatch(t -> t.contains("Anders"));

        String test = Names().stream()
                .filter(p -> p.equals("Selborn"))
                .findFirst().get();




        System.out.println(String.format("%s, - %s",exists, test));

    }

    public static List<String> Names()
    {
        List<String> names = new ArrayList<>();

        names.add("Anders");
        names.add("Olof");
        names.add("Selborn");

        return names;

    }


}
