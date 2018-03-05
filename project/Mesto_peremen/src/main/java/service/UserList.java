package service;

import body.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserList {
    // SQLite connection string
    static final String url = "jdbc:sqlite:D://lectii/src/db/mesto_peremen.db";
    public static UserList service = new UserList();

    public List <User> findAll() {
        String sql = "SELECT id, name, password,id_role FROM user";
        List <User> users = new ArrayList <>();

        try (Connection connection = this.conect();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery( sql )) {

            while (resultSet.next()) {
                int id = resultSet.getInt( "ID" );
                String name = resultSet.getString( "name" );
                String password = resultSet.getString( "password" );
                int idRole = resultSet.getInt( "id_role" );
                users.add( new User( id, name, password, idRole ) );
            }
        } catch (SQLException e) {
            System.out.println( e.getMessage() );
        }
        return users;
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

    public User createUser(String name, String password) {
        String sql = "INSERT INTO user(name,password,id_role) VALUES(?,?,2)";

        try (Connection connection = this.conect();
             PreparedStatement preparedStatement = connection.prepareStatement( sql )) {
            preparedStatement.setString( 1, name );
            preparedStatement.setString( 2, password );
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println( e.getMessage() );
        }
        return null;
    }

    public User deleteUser(String name) {
        String sql = "DELETE FROM user Where name=?";

        try (Connection connection = this.conect();
             PreparedStatement preparedStatement = connection.prepareStatement( sql )) {
            preparedStatement.setString( 1, name );
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println( e.getMessage() );
        }
        return null;
    }
}
