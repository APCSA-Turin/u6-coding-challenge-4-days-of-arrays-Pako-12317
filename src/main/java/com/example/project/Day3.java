package com.example.project;

public class Day3 {
  public static String[][] generateSnowflake(int size) {
    if (size % 2 == 0 || size <= 0) {
        throw new IllegalArgumentException("Size must be an odd positive number.");
    }

    // Initialize the grid with spaces
    String[][] grid = new String[size][size];
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
            grid[i][j] = " ";
        }
    }

    int mid = size / 2;

    // Draw symmetrical snowflake pattern
    for (int i = 0; i < size; i++) {
        grid[i][mid] = "*"; // Vertical line
        grid[mid][i] = "*"; // Horizontal line
        grid[i][i] = "*";   // Top-left to bottom-right diagonal
        grid[i][size - i - 1] = "*"; // Top-right to bottom-left diagonal
    }

    return grid;
  }

  public static void printSnowflake(String[][] snowflake) {
    for (String[] row : snowflake) {
        for (String cell : row) {
            System.out.print(cell);
        }
        System.out.println();
    }
  }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
