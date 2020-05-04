
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grzegorz Konopka
 */
public class Grade {
    
    private ArrayList<Integer> results;
    private ArrayList<Integer> grades;
    private int accepted;


    public Grade() {
        this.results = new ArrayList<Integer>();
        this.grades = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getGrades() {
        return results;
    }
    
    public void addResult(int result) {
        this.results.add(result);
        addGrade(result);
    }
    
    private int grade(int result) {
      if ( result >= 0 && result <= 29 ){
            return 0;
        } else if ( result >= 30 && result <= 34 ){
            this.accepted++;
            return 1;
        } else if ( result >= 35 && result <= 39 ){
            this.accepted++;
            return 2;
        } else if ( result >= 40 && result <= 44 ){
            this.accepted++;
            return 3;
        } else if ( result >= 45 && result <= 49 ){
            this.accepted++;
            return 4;
        } else if ( result >= 50 && result <= 60 ){
            this.accepted++;
            return 5;
        } else return -1;
    }
    
    private void addGrade(int result) {
        if (result >=0 && result <= 60) {
            grades.add(grade(result));
    }
    }

    @Override
    public String toString() {
        return results.toString();
    }
    
    public String resultsToGradeString() {
        return grades.toString();
    }
    
    public void printAcceptance(){
        double acceptance = (double) this.accepted/ (double) this.grades.size();
        acceptance *= 100;
        System.out.print("Acceptance percentage: " + acceptance);
    }
    
    public void printGrades() {
        String grade5 = "5: ";
        String grade4 = "4: ";
        String grade3 = "3: ";
        String grade2 = "2: ";
        String grade1 = "1: ";
        String grade0 = "0: ";
        System.out.println("Grade distribution:");
        for (int i = 0; i < grades.size(); i++) {
            switch (grades.get(i)) {
                case 5:
                    grade5 += "*";
                    continue;
                case 4:
                    grade4 += "*";
                    continue;
                case 3:
                    grade3 += "*";
                    continue;
                case 2:
                    grade2 += "*";
                    continue;
                case 1:
                    grade1 += "*";
                    continue;
                case 0:
                    grade0 += "*";
                    continue;
                default:
                    break;
            }
        }
        System.out.println(grade5);
        System.out.println(grade4);
        System.out.println(grade3);
        System.out.println(grade2);
        System.out.println(grade1);
        System.out.println(grade0);
        
    }

}
