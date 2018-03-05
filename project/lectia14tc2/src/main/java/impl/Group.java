package impl;

import impl.Staff;

import java.util.List;
import java.util.stream.Collectors;

public class Group {
    private List<Staff> allStaff;


    public Group(List<Staff> allStaff) {
        this.allStaff = allStaff;
    }

    public List <Staff> getAllStaff() {
        return allStaff;
    }

    public List<Staff> students() {
        return allStaff.stream()
                .filter(s-> s.getRoleName().equals("Student"))
                .collect( Collectors.toList());
    }

    public List<Staff> profesor() {
        return allStaff.stream()
                .filter(s-> s.getRoleName().equals("Profesor"))
                .collect( Collectors.toList());
    }

    public List<Staff> getListOfStaff() {
        return allStaff;
    }
}