package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

 class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        // Input loop
        while (true) {
            System.out.print("Enter student's grade (or type 'done' to finish): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double grade = Double.parseDouble(input);
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade! Grade must be between 0 and 100.");
                } else {
                    grades.add(grade);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        // Calculate average
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = sum / grades.size();

        // Find highest and lowest grades
        double highest = Collections.max(grades);
        double lowest = Collections.min(grades);

        // Output results
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
    }
}
