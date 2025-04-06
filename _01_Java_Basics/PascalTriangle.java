package _01_Java_Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();
        scanner.close();

        if(numRows <= 0) {
            System.out.println("Enter a positive number of rows.");
            return;
        }

        List<List<Integer>> triangle = generatePascalTriangle(numRows);
        printPascalTriangle(triangle);
    }
     // Function to generate Pascal's Triangle
    public static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == 1) {
                    row.add(1);
                } else {
                    // Each element is the sum of the two elements directly above it
                    int previousRowElement1 = triangle.get(i - 1).get(j - 1);
                    int previousRowElement2 = triangle.get(i - 1).get(j);
                    row.add(previousRowElement1 + previousRowElement2);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

     // Function to print Pascal's Triangle in a formatted way
    public static void printPascalTriangle(List<List<Integer>> triangle) {
        int maxDigits = String.valueOf(triangle.get(triangle.size() - 1).get(triangle.size() / 2)).length();
        int paddingUnit = maxDigits + 1;

        for (int i = 0; i < triangle.size(); i++) {
            // Add leading spaces for alignment
            int spaces = (triangle.size() - 1 - i) * paddingUnit / 2;
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.printf("%" + paddingUnit + "d", triangle.get(i).get(j));
            }
            System.out.println();
        }
    }
}
