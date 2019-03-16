package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;



public class EducatorTest {



        @Test
        public void implementationTest(){
            Assert.assertTrue(Educator.FROILAN instanceof Teacher);
        }

        @Test
        public void inheritanceTest(){
            Assert.assertTrue(Educator.LEON instanceof Teacher);
            Assert.assertTrue(Educator.NHU instanceof Teacher);
        }


        @Test
        public void teach() {
            Student student = new Student(111);
            Educator.FROILAN.teach(student, 15);
            double expected = 15;
            double actual = student.getTotalStudyTime();

            Assert.assertEquals(expected, actual, .001);

        }

        @Test
        public void lecture() {
            Student[] student = new Student[3];
            Student student1 = new Student(11);
            Student student2 = new Student(22);
            Student student3 = new Student(33);
            student[0] = student1;
            student[1] = student2;
            student[2] = student3;

            Educator.NHU.lecture(student, 30);
            double expected = 10.0;
            double actual = student1.getTotalStudyTime();

            Assert.assertEquals(expected, actual, .001);
        }
    }
