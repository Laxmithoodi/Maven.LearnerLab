package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation(){
        long id = 34L;

        Teacher instructor = (Teacher)(Object) new Instructor(id);

        Assert.assertTrue(instructor instanceof Teacher);

    }

    @Test
    public void testInheritance(){
        long id = 34L;

        Person instructor = (Person)(Object) new Instructor(id);

        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach(){
        long id = 34L;

        Double expecTotalStudyTime = 5.0;

        Student st = new Student(5L);

        Instructor instructor = new Instructor(id);

        instructor.teach(st, 5);

        Double actualStudyTime = st.getTotalStudyTime();

        Assert.assertEquals(expecTotalStudyTime, actualStudyTime, 0);
        System.out.println(actualStudyTime);
    }


    @Test
    public void testLecture(){

        long id = 34L;


        Teacher teacher = new Instructor(123) ;
        Student[] learner = new Student[3];
        double expectedNumberOfHours = 8;

       //When
        learner[0] = new Student(12);
        learner[1] = new Student(13);
        learner[2] = new Student(14);
        teacher.lecture(learner, expectedNumberOfHours);
        double numberOfHoursPerLearner = expectedNumberOfHours / learner.length;

        //had to downcast in order to get student method of getTotalStudyTime
        double actualNumberOfhours =(learner[0].getTotalStudyTime());

        Assert.assertEquals(numberOfHoursPerLearner, actualNumberOfhours, 0.001);
        System.out.println(actualNumberOfhours);





    }



}
