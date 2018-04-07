import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ScoreList {
    static final String url = "jdbc:sqlite:D://lectii/src/db/GUI_Yakim.db";
    public static ScoreList service = new ScoreList();

    public User createUser(String name, int score) {
        String sql = "INSERT INTO user(name,score) VALUES(?,?)";


        try (Connection connection = this.conect();
             PreparedStatement preparedStatement = connection.prepareStatement( sql )) {
            preparedStatement.setString( 1, name );
            preparedStatement.setInt( 2, score );
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println( e.getMessage() );
        }
        return null;
    }

    private Connection conect() {
        // SQLite connection string
        Connection connection = null;
        try {
            connection = DriverManager.getConnection( url );
        } catch (SQLException e) {
            System.out.println( e.getMessage() );
        }
        return connection;
    }

    static class User {
        private String name;
        private int score;

        User(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }
    }
//
//    private static class UserList {
//        // SQLite connection string
//        static final String url = "jdbc:sqlite:D://lectii/src/db/GUI_Yakim.db";
//        private static UserList service = new UserList();
//
//        public List <User> findAll() {
//            String sql = "SELECT name, score FROM user";
//            List <User> users = new ArrayList <>();
//
//            try (Connection connection = this.conect();
//                 Statement statement = connection.createStatement();
//                 ResultSet resultSet = statement.executeQuery( sql )) {
//
//                while (resultSet.next()) {
//                    String name = resultSet.getString( "name" );
//                    int score = resultSet.getInt( "score" );
//                    users.add( new User( name, score ) );
//                }
//            } catch (SQLException e) {
//                System.out.println( e.getMessage() );
//            }
//            return users;
//        }
//
//        private Connection conect() {
//            // SQLite connection string
//            Connection connection = null;
//            try {
//                connection = DriverManager.getConnection( url );
//            } catch (SQLException e) {
//                System.out.println( e.getMessage() );
//            }
//            return connection;
//        }
//
//        public User createUser(String name, int score) {
//            String sql = "INSERT INTO user(name,score) VALUES(?,?)";
//
//            try (Connection connection = this.conect();
//                 PreparedStatement preparedStatement = connection.prepareStatement( sql )) {
//                preparedStatement.setString( 1, name );
//                preparedStatement.setInt( 2, score );
//                preparedStatement.executeUpdate();
//            } catch (SQLException e) {
//                System.out.println( e.getMessage() );
//            }
//            return null;
//        }
//
//        public User deleteUser(String name) {
//            String sql = "DELETE FROM user Where name=?";
//
//            try (Connection connection = this.conect();
//                 PreparedStatement preparedStatement = connection.prepareStatement( sql )) {
//                preparedStatement.setString( 1, name );
//                preparedStatement.executeUpdate();
//            } catch (SQLException e) {
//                System.out.println( e.getMessage() );
//            }
//            return null;
//        }
//    }
//
//    private class Authentification {
//        public User carentUser;
//
//        public boolean login(String name) {
//            for (User user : UserList.service.findAll()) {
//                if (name.equals( user.getName() )) {
//                    carentUser = user;
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        public User getCarentUser() {
//            return carentUser;
//        }
//
//        public void setCarentUser(User carentUser) {
//            this.carentUser = carentUser;
//        }
//    }

}
