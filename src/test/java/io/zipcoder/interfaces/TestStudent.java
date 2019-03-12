package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test

    public void testInheritance(){
        long id = 6799L;

        Person student = (Person)(Object) new Student(id);
        Assert.assertTrue(student instanceof Person);

    }

    @Test

    public void testImplementation(){
        long id = 6799L;

        Learner student = (Learner)(Object) new Student(id);
        Assert.assertTrue(student instanceof Learner);

    }


    @Test
    public void testLearn(){

     //Given
        long id1 = 6999L;
        double numberOfHours = 5;
        Student student = new Student(id1);
        double expectedTotalStudyTime = 5;
    //When
        student.learn(numberOfHours);
        Double actualTotalStudyTime = student.getTotalStudyTime();

     //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime, 0);
        System.out.println(actualTotalStudyTime);
    }

}
