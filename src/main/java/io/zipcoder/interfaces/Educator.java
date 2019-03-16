package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    FROILAN(121L),
    LEON(212L),
    NHU(313L);


    private final Instructor instructor;

    private double timeWorked;

    Educator(Long id) {

        this.instructor = new Instructor(id);
        Instructors.getINSTANCE().personList.add(this.instructor);


    }

    public Instructor getInstructor(Long id) {
        return instructor;
    }


    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;

    }



    public void lecture(Learner[] learners, double numberOfHours) {

        double hoursToAdd = numberOfHours/ learners.length;
        for (int i = 0; i < learners.length; i++){
            learners[i].learn(hoursToAdd);
        }
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;

    }
}
