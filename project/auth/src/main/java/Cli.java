import api.Resource;
import model.User;
import service.Authentication;
import service.ResurcesList;
import service.RoleList;
import service.UserList;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Authentication yakim = new Authentication();
        Scanner sc = new Scanner( System.in );
        boolean exit = false;
        while (!exit && sc.hasNext()) {
            String coman = sc.nextLine();
            String[] yak = coman.split( " " );
            switch (yak[0]) {
                case "login":
                    if (yakim.login( yak[1], yak[2] ))
                        System.out.println( yakim.getcarentuser() );
                    else
                        System.out.println( "Good buy" );
                    break;
                case "new":
                    String userName = yak[1];
                    String pass = yak[2];
                    User u = UserList.service.createUser( userName, pass );
                    System.out.println( "Was created ");
                    break;
                case "info":
                    if (yakim.getcarentuser() != null) {
                        System.out.println( yakim.getcarentuser() );
                    } else
                        System.out.println( "please login" );
                    break;
                case "get":
                    Resource res = ResurcesList.findByTitle( yak[1] );
                    if (RoleList.findById( yakim.getcarentuser().getRoleid() ).hasAccess( res ))
                        System.out.println( "Have access " + res );
                    else
                        System.out.println( "Don't access " + res );
                    break;
                case "delete":
                    String uN = yak[1];
                    UserList.service.deleteUser( uN );
                    System.out.println( "Was deleted " + uN );
                    break;
                case "logaut":
                    yakim.setCarentuser( null );
                    break;
                case "exit":
                    exit = true;
            }
        }
    }
}