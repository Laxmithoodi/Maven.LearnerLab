package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {


    Instructor[] instructors = new Instructor[]{};

    static final Instructors INSTANCE = new Instructors();


    public Instructors() {


        Instructor inst1 = new Instructor(121);
        Instructor inst2 = new Instructor(131);
        Instructor inst3 = new Instructor(141);
        Instructor inst4 = new Instructor(151);

        this.add(inst1);
        this.add(inst2);
        this.add(inst3);
        this.add(inst4);


    }


    public static Instructors getINSTANCE() {
        return INSTANCE;
    }


    public Instructor[] getArray() {

        return personList.toArray(new Instructor[personList.size()]);
    }
}



//
//
//        for (int i = 0; i <instructors.length; i++) {
//                Instructor instructor = instructors[i];
//                long id = inst1.getId();
//
//        }
