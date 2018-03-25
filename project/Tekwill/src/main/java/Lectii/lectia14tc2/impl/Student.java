package Lectii.lectia14tc2.impl;

public class Student extends Staff {
    public Student(String text) {
        super( text );
    }

    @Override
    public String getRoleName() {
        return "Student";
    }
}
