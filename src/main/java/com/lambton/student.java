package com.lambton;

public class student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    private int marks5;
    private int total;
    private float percentage;
    String result;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public int getMarks4() {
        return marks4;
    }

    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }

    public int getMarks5() {
        return marks5;
    }

    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }

    public int getTotal() {
        return total;
    }


    public float getPercentage() {
        return percentage;
    }


    public String getResult() {
        return result;
    }

    public void calculateTotal() {
        total = marks1 + marks2 + marks3 + marks4 + marks5;
    }
    float per;
    public void percentage() {
        per = total / 5 * 100;

    }

    int count = 0;

    private boolean determine() {
        if (marks1 < 50) {
            count++;
        }
        if (marks3 < 50) {
            count++;
        }
        if (marks4 < 50) {
            count++;
        }
        if (marks5 < 50) {
            count++;
        }
        if (marks2 < 50) {
            count++;
        }
        if (count == 0) {
            return true;

        } else {
            return false;
        }
    }

    public void generateResult() {
        if (determine() == true) {
            System.out.println("pass");
        } else {
            System.out.println("fail");


        }


    }

    public void grades() {
        if (per<= 49)
            System.out.println("F");


        else if (per <= 59)
            System.out.println("D");
        else if (per <= 62)
            System.out.println("C-");
        else if (per <= 62)
            System.out.println("C-");
        else if (per<= 66)
            System.out.println("C");
    }
}