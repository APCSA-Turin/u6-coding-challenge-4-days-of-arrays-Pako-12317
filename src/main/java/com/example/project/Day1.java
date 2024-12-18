package com.example.project;
import java.util.Random;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name) {
        

        // Validate input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        // Generate a random elf name
        Random random = new Random();
        String randomElfName = elf_names[random.nextInt(4)];

        return "Your elf name is: " + randomElfName + " " + name;
    }
}