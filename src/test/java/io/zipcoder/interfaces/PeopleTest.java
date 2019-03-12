package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PeopleTest {



    @Test
    public void add() {
    //Given
        ArrayList<Person> personList = new ArrayList<Person>();
        Person person = new Person(12);

    //When
        personList.add(person);

    //Then
        Assert.assertTrue(personList.contains(person));
        System.out.println(personList.contains(person));

    }

    @Test
    public void findById() {

     //Given
        ArrayList<Person> personList = new ArrayList<Person>();

     //  People people = new People();
        Person person = new Student(123);
        Person person1 = new Student(124);
        Person person2 = new Student(125);
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        //When
       // Person expected = person2;
       // Person actual = people.findById(123);
       // Person p = new Person(13);


    //Then
        Assert.assertTrue(personList.contains(person));
        System.out.println(personList.contains(person));
    }



    @Test
    public void remove() {

        //Given
        ArrayList<Person> personList = new ArrayList<Person>();
       // People people = new People();

        Person person = new Student(123);
        Person person1 = new Student(124);
        Person person2 = new Student(125);
        personList.add(person);
        personList.add(person1);
        personList.add(person2);
        personList.remove(person);
        int expected = 2;
        int actual = personList.size();

        Assert.assertEquals(expected, actual);
        System.out.println(actual);



    }
}