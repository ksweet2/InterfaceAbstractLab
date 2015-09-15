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
public class Startup {
    public static void main(String[] args) {
        Course c1 = new AdvancedJavaCourse("Advanced Java", "152-135",4.0,"152-134");
        Course c2 = new IntroToProgrammingCourse("Intro to Programming", "152-107",2.0);
        Course c3 = new IntroJavaCourse("Intro to Java", "152-134",4.0,"152-107");
        
        Course[] courses = {c1,c2,c3};
        
        for(Course course : courses){
            course.printCourseInfo();
        }
    }
}
