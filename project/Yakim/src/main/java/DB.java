import java.sql.*;

public class DB {
    static final String url = "jdbc:sqlite:D://lectii/yakim/db/GUI_Yakim.db";

    public static void main(String[] args) {
        DB app = new DB();
//        app.createNewTable();
//        app.insert( "Bogdan",0 );
        app.sellectAll();
    }

    private void createNewTable() {
        String sql = "CREATE TABLE IF NOT EXISTS user (\n"
                + "	name text NOT NULL,\n"
                + " score integer PRIMARY KEY\n"
                + ");";
        try (Connection conn = this.connect();
             Statement statement = conn.createStatement()) {
            // create a new table
            statement.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private Connection connect() {
        // SQLite connection string
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    private void insert(String name, int score) {
        String sql = "INSERT INTO user(name,score) VALUES(?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, score);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private void sellectAll() {
        String sql = "SELECT name, score FROM user";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("name") + "\t" +
                        rs.getInt("score"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}