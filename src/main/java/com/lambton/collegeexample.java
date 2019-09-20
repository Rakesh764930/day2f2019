package com.lambton;

public class collegeexample {

    public static void main(String[] args)
    {
         student s1=new student();
         s1.setFirstName("Rakesh");
         s1.setLastName("Kumar");
         s1.setMarks1(86);
         s1.setMarks2(87);
        s1.setMarks3(88);
        s1.setMarks4(89);
        s1.setMarks5(90);
        System.out.println(s1.getFullName());
        s1.generateResult();

     s1.grades();


    }




}
