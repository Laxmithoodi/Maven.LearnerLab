package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    //instantiate them
    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getINSTANCE();

    private static final ZipCodeWilmington  INSTANCE = new ZipCodeWilmington();


    private ZipCodeWilmington(){ }



    public void hostLecture(Teacher teacher, double numberOfHours){


        teacher.lecture(students.getArray(), numberOfHours);
        }


      public  void hostLecture(long id, double numberOfHours){

         Instructor teacher=  instructors.findById(id);

            //teacher.lecture(students.getArray(), numberOfHours);
            hostLecture(teacher, numberOfHours);


      }



    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }


//    @Override
//    public Person[] getArray() {
//        return new Person[0];
//  }

}
