import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        double average = calculateAverage(grades);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Average grade: " + average);

        scanner.close();
    }

    public static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}

