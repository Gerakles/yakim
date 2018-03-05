package impl;

import impl.Staff;

public class Student extends Staff {
    public Student(String text) {
        super( text );
    }

    @Override
    public String getRoleName() {
        return "Student";
    }
}
