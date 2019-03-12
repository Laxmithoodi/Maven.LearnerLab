package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {





    @Test
    public void testConstructor(){

 //Given

        String name1 = "Laxmi";
        long expectedId  = 6789L;
        Person person = new Person(expectedId);
  //When

        long actualId = person.getId();

 // Then
        Assert.assertEquals(expectedId, actualId);
        System.out.println(actualId);

    }

    @Test
    public void testSetName(){
        //Given

        String expectedName = "Laxmi";
        long id1 = 6789L;
        Person person = new Person(id1);
        //When
        person.setName(expectedName);
        String actualName = person.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
        System.out.println(actualName);

    }






}
