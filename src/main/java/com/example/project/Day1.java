package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name) {
        

        // Validate input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        // Generate a random elf name
        Random rand = new Random();
        String randomElfName = elf_names[rand.nextInt()];
        String elfName = randomElfName + " " + name;

        return "Your elf name is: " + elfName;
    }
}