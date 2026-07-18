import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Students {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", 75),
                new Student("Anu", 58),
                new Student("Kiran", 90),
                new Student("Sneha", 65)
        );

        List<String> names = students.stream()
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}