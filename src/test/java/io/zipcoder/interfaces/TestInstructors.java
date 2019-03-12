package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test

    public void testInstructors(){
        Instructors instance1 = Instructors.getINSTANCE();
        Instructors instance2 = Instructors.getINSTANCE();
        Assert.assertEquals(instance1, instance2);


    }
}
