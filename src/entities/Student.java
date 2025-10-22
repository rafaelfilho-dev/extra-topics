package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade(){
        return grade1 + grade2 + grade3;
    }
    public boolean hasPassed(){
        return finalGrade() > 60.0;
    }
    public double missingPoints(){
        double missingPoints = 0;
        if (!hasPassed()){
            missingPoints = 60.0 - finalGrade();
        }
        return missingPoints;
    }

    public String toString(){
        if (hasPassed()){
            return "Final Grade = " + finalGrade() + String.format("%n") + "PASS";
        }
        else {
            return "Final Grade = " + finalGrade() + "FAILED. Missing Points: " + missingPoints();
        }
    }
}
