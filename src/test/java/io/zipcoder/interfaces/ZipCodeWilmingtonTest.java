package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void hostLecture() {

        Students students = Students.getINSTANCE();
        Instructors instructors = Instructors.getINSTANCE();

        Student student1 = new Student(12);
        Student student2 = new Student(13);
        Student student3 = new Student(14);
        double numberOfHours = 6;

        students.add(student1);
        students.add(student2);
        students.add(student3);
        student1.learn(numberOfHours);


        Instructor instructor = new Instructor(1221);
        instructors.add(instructor);
        double expected = 6;

        double actual = student1.getTotalStudyTime();

        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getINSTANCE();

        zipCodeWilmington.hostLecture(instructor, 20);

        Assert.assertEquals(expected, actual, 0);
        System.out.println(actual);


    }


    @Test
    public void testHostLecture1() {

        /**Create a testHostLecture method which ensures that each of the Student's totalStudyTime
         instance variable is incremented by the specified numberOfHours upon invoking the hostLecture method.*/

        //Given
        Students students = Students.getINSTANCE();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getINSTANCE();


        Instructor instructor = Instructors.getINSTANCE().findById(121);

        Student student1 = new Student(12);
        Student student2 = new Student(13);
        students.add(student1);
        students.add(student2);

        //When
        ZipCodeWilmington.getINSTANCE().hostLecture(instructor, 10);
       // zipCodeWilmington.hostLecture(instructor, 10);
        double expected = 2.5;
        double actual = student1.getTotalStudyTime();

        //Then

        Assert.assertEquals(expected, actual, 0);


    }
}