import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ScoreList {
    static final String url = "jdbc:sqlite:D://lectii/src/db/GUI_Yakim.db";
    public static ScoreList service = new ScoreList();

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
}
