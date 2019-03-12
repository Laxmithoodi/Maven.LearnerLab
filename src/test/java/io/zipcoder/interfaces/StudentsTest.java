package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {



    @Test
    public void testStudents() {



        Students instance = Students.getINSTANCE();
        Students instance1 = Students.getINSTANCE();
        instance.add(new Student(12));
        instance1.add(new Student(14));

        Assert.assertEquals(instance, instance1);
        System.out.println(instance);
        System.out.println("instance1:" + instance1);


    }
}