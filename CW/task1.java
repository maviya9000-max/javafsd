class GradeChecker {
    public static void main(String args[]) {
        
        int marks = 85; 

        if (marks >= 90) {
            System.out.println("Result: Distinction");
        } else if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}
