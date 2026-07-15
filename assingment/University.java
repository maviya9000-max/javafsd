// Interface 1
interface Attendable {
    void attendClass();
    void markAttendance();
}

// Interface 2
interface Evaluable {
    void takeExam();
    void calculateGrade();
}

// Interface 3
interface Printable {
    void printReport();
}

// Student class
class Student implements Attendable, Evaluable, Printable {

    private String name;
    private int marks;
    private char grade;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public void attendClass() {
        System.out.println(name + " attended today's class.");
    }

    @Override
    public void markAttendance() {
        System.out.println("Attendance marked for " + name);
    }

    @Override
    public void takeExam() {
        System.out.println(name + " appeared for the semester exam.");
    }

    @Override
    public void calculateGrade() {
        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Grade: " + grade);
    }

    @Override
    public void printReport() {
        System.out.println("\n----- Student Report -----");
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
    }
}

class University {
    public static void main(String[] args) {

        Student s = new Student("Ashwin", 99);

        s.attendClass();
        s.markAttendance();
        s.takeExam();
        s.calculateGrade();
        s.printReport();
    }
}