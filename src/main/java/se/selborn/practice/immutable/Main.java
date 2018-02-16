package se.selborn.practice.immutable;

/**
 * Created by anders on 6/4/17.
 */
public class Main {

    public static void main(String[] args) {

        String name = "ANDERS";

        String str = name;

        str = str.concat(" SELBORN");


        System.out.println(str);

        String surName = new String("SELBORN");
        surName = surName.concat("__");

        System.out.println(surName);


    }



}
