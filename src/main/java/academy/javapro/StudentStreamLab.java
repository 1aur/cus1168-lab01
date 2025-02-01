package academy.javapro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors; 

public class StudentStreamLab {
    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = Arrays.asList(
                new Student("Alice", 3.5, "Junior"),
                new Student("Bob", 3.8, "Senior"),
                new Student("Charlie", 2.9, "Sophomore"),
                new Student("David", 3.1, "Freshman"),
                new Student("Eve", 3.9, "Junior")
        );

        // TODO - Filtering: Students with GPA > 3.0

        List<Student> filteredStudents = students.stream()
        .filter(student -> student.getGpa() > 3.0)
        .collect(Collectors.toList());

        System.out.println("Students with GPA > 3.0: ");
        filteredStudents.forEach(System.out::println); 
        System.out.println();


        // TODO - Mapping: Extract names of students with GPA > 3.0

        List<String> extractedNames = filteredStudents.stream()
        .map(student -> student.getName())
        .collect(Collectors.toList());

        System.out.println("High GPA student names: ");
        extractedNames.forEach(System.out::println); 
        System.out.println();


        // TODO - Reducing: Calculate the average GPA of all students
       
        double avgGPA = students.stream()
        .mapToDouble(student -> student.getGpa())
        .average()
        .orElse(0.0);

        System.out.printf("Average GPA: %.2f\n", avgGPA);
        System.out.println();


        // TODO Collecting: Collect all "Junior" students into a list
        
        List<Student> Juniors = students.stream()
        .filter(student -> student.getCollegeYear().equals("Junior"))
        .collect(Collectors.toList());

        System.out.println("Juniors: ");
        Juniors.forEach(System.out::println); 
        System.out.println();
    }
}
