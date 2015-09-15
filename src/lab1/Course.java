/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Sweetle
 */
public abstract class Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    public Course(String courseName,String courseNumber,double credits, String prerequisites)
    {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }
    public Course(){
    
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() ==0){
            System.out.println("not a valid course number");
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
             throw new IllegalArgumentException();
        }
        this.prerequisites = prerequisites;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length()== 0){
        prerequisites = "NONE";
    }
        this.prerequisites = prerequisites;
    }
    
    public final void printCourseInfo(){
   System.out.println("Course Name: " + this.getCourseName());
   System.out.println("Course Number: " + this.getCourseNumber());
   System.out.println("Number of Credits: " + this.getCredits());
   System.out.println("Prerequisite Course: " + this.getPrerequisites()+ "\n");
    }
   }

