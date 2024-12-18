
package com.example.project;
import java.util.Random;
import java.util.ArrayList;

public class Day2{
    public static String[][] nameSort(String[] names) {
        if (names.equals(null) || names.length == 0) {
            throw new IllegalArgumentException("The names array cannot be null or empty");
        }

        // Lists to hold names for "Nice" and "Naughty"
        ArrayList <String> niceList = new ArrayList<>();
        ArrayList <String> naughtyList = new ArrayList<>();
        Random random = new Random();

        // Randomly assign each name to "Nice" or "Naughty"
        for (int i = 0; i<names.length; i++) {
            if (random.nextBoolean()) {
                niceList.add(names[i]);
            } else {
                naughtyList.add(names[i]);
            }
        }

        // Convert lists to arrays and store them in a 2D array
        String[][] sortedNames = new String[2][];
        sortedNames[0] = niceList.toArray(new String[0]);
        sortedNames[1] = naughtyList.toArray(new String[0]);

        return sortedNames;
    }

    public static void main(String[] args) {

    }
}