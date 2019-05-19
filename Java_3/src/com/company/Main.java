package com.company;

import java.io.IOException;

import java.util.*;


public class Main {

    static final String FILE_NAME1 = "C:\\Users\\DaMax\\Downloads\\Урок 1.txt";

    static final String FILE_NAME2 = "C:\\Users\\DaMax\\Downloads\\Урок 1.txt";




    public static void main(String[] args) {

        // first homework item

        List<String> wordArray = new ArrayList<String>();

        wordArray = ArrayOperation.fillTheArray(wordArray);

        System.out.println(wordArray + "\n");

        ArrayOperation.printUniqueWords(wordArray);

        wordArray.clear();

        try {

            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME2);

        } catch (IOException e) {

            System.out.println("Failed to fill array from file!\n");

        }

        try {

            wordArray = ArrayOperation.fillTheArrayFromFile(wordArray, FILE_NAME1);

        } catch (IOException e) {

            System.out.println("Failed to fill array from file!\n");

        }

        System.out.println(wordArray + "\n");

        ArrayOperation.printUniqueWords(wordArray);

        // second homework item

        Phonebook phonebook = new Phonebook();


        phonebook.add(2304578, "Sizov");

        phonebook.add(5678794, "Bubnov");

        phonebook.add(3456783, "Vetrov");

        phonebook.add(3456278, "Panin");

        phonebook.add(9786053, "Jobs");

        phonebook.add(6475893, "Klein");


        phonebook.get("Sizov");

        phonebook.get("Bubnov");

        phonebook.get("Panin");

        phonebook.get("Klein");

    }

}
