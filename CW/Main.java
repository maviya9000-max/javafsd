class Result {

    void calculateGrade() {
        System.out.println("Calculating Grade");
    }
}

class UGStudent extends Result {

    @Override
    void calculateGrade() {
        System.out.println("Grade calculated using UG rules");
    }
}

class PGStudent extends Result {

    @Override
    void calculateGrade() {
        System.out.println("Grade calculated using PG rules");
    }
}

public class Main {

    public static void main(String[] args) {

        Result r;

        r = new UGStudent();
        r.calculateGrade();

        r = new PGStudent();
        r.calculateGrade();
    }
}