package impl;

import java.util.ArrayList;
import java.util.List;

public class Tekwill{
    public static void main(String[] args) {
        List <Staff> staffList = new ArrayList <>();
        try {
            staffList.add( new Profesor( "Denis B" ) );
            staffList.add( new Profesor( "Radu J" ) );
            staffList.add( new Profesor( "Andrei F" ) );
            staffList.add( new Profesor( "Vitalie D" ) );
            staffList.add( new Student( "Sergiu S 30" ) );
            staffList.add( new Student( "Serghei P 24" ) );
            staffList.add( new Student( "Iulian Iulian 30" ) );
            staffList.add( new Student( "Iachimciuc Bogdan 19" ) );

            Group group = new Group( staffList );
            Course courseOCA = new Course( group,  10 );

            courseOCA.start();
            courseOCA.printLessons();      //prezenta
            courseOCA.printPresence();     //suma absentelor
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println( "Exceptia in virsta" );
//            System.out.println(e.getMessage());
//        } catch (NotStartedException e) {
//            System.out.println( "Exceptia in virsta" );
//            System.out.println(e.getMessage());
        }

            catch (ArrayIndexOutOfBoundsException | NotStartedException e){
                System.out.println( "Exceptia in virsta" );
                System.out.println( e.getMessage() );
            } catch (Exception e) {
                System.out.println("Что-то не то");
                throw e;
            }



    }
}
