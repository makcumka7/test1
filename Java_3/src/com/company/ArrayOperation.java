package com.company;

import java.io.*;

import java.util.*;


public class ArrayOperation {


    public static List<String> fillTheArray(List<String> array) {

        array.add("Hi");

        array.add("Hello");

        array.add("Car");

        array.add("Good");

        array.add("Not");

        array.add("Yes");

        array.add("Joke");

        array.add("bye");

        array.add("Bye");

        array.add("bye");

        return array;

    }

    public static List<String> fillTheArrayFromFile(List<String> array, String fileName) throws IOException {

        StringBuffer buffer = new StringBuffer();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()) {

            buffer.append(reader.readLine() + "\n");

        }

        if (buffer.length() > 0) {

            String[] tempArr = buffer.toString().split(" ");

            for (String temp : tempArr) {

                array.add(temp);

            }

        }

        return array;

    }


    public static void printUniqueWords(List<String> array) {

        Set<String> tempArray = new LinkedHashSet<>();

        for (String arr : array) {

            String a = arr.toLowerCase();

            tempArray.add(a);

        }

        for (String tempArr : tempArray) {

            int count = 0;

            for (String arr : array) {

                String a = arr.toLowerCase();

                if (tempArr.equals(a)) count++;

            }

            System.out.println("\"" + tempArr + "\"" + " repeated in the list = " + count);

        }

        System.out.println();

    }

}