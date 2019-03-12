package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    FROILAN,
    LEON,
    NHU,
    WHILHEM;

     private final Instructor instructor;

    Educator(){
        instructor = null;

    }



    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
