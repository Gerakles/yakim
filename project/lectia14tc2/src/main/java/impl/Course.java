package impl;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private Group group;
    private int NumberofLessons;
    private List <Lesson> listofLessons;

    public Course(Group group, int NumberofLesson) {
        this.NumberofLessons = NumberofLesson;
        this.group = group;
    }

    public void start() {
        listofLessons = new ArrayList <>();
        for (int i = 0; i < NumberofLessons; i++) {
            Lesson lesson = new Lesson( group );
            lesson.start();
            listofLessons.add( lesson );
        }
    }

    public void printLessons() {
        checkStarted();
        for (Lesson lesson : listofLessons) {
            lesson.print();
        }
    }

    public void printPresence() {
        checkStarted();
        System.out.println( "\nPrintam presenta " );
        for (Staff presence : group.getAllStaff()) {
            int i = 0;
            int j = 0;
            System.out.println( presence );
            for (Lesson lessonpressence : listofLessons) {
                if (lessonpressence.getPresence().isPresent( presence )) {
                    i++;
                } else {
                    j++;
                }
            }
            System.out.println( "prezenta " + i + " obsenta " + j );
        }
    }
//    public void printPresence() {
//        System.out.println("presence");
//        for (Staff it : group.getListOfStaff()) {
//            long freg = listofLessons.stream().filter(s-> s.getPresence().isPresent(it)).count();
//            long absenta = NumberofLessons- freg;
//        }
//    }

    private void checkStarted() {
        if (listofLessons == null) {
            throw new NotStartedException();
        }
    }
}