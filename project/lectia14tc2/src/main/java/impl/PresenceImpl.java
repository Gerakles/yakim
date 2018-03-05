package impl;

import api.Character;
import api.Presence;

import java.util.ArrayList;
import java.util.List;

public class PresenceImpl implements Presence {
    private Group group;
    private List <Staff> presentsStaff;

    public PresenceImpl(Group group) {
        this.group = group;
        presentsStaff = new ArrayList <Staff>();
    }

    @Override
    public boolean isPresent(Character character) {
        return presentsStaff.contains( character );
    }

    @Override
    public void check() {
        group.students().forEach( a -> {
            if (Math.random() > 0.3) presentsStaff.add(a);
        } );

        int sizeOfProfesor = 2;                                        //numai 2 profesori
        List <Staff> staffList = group.profesor();                      //creezi staffList
        for (int i = 0; i < sizeOfProfesor; i++) {
            int staffIndex = (int) (Math.random() * staffList.size());  //alegi random
            presentsStaff.add(staffList.get(staffIndex));                //adaugi profesori
            staffList.remove(staffIndex);                               //ca sa fie in tot deauna 2 profesori

        }

//        if (Math.random()>0.5) {
//            presentsStaff.add( group.profesor().get( 0 ) );
//            presentsStaff.add( group.profesor().get( 1 ) );
//        } else {
//            presentsStaff.add( group.profesor().get( 2 ));
//            presentsStaff.add( group.profesor().get( 3 ));

    }

}
