import java.sql.*;

public class DatBase {
    // SQLite connection string
    static final String url = "jdbc:sqlite:D://lectii/yakim/db/mesto_peremen.db";

    public static void main(String[] args) {
        DatBase app = new DatBase();
        app.createNewTable();
        app.insert("Bogdan", "yakim",1);
        app.selectAll();
    }
    private void createNewTable() {
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS user (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	password text,\n"
                + "	id_role integer\n"
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
    private void insert(String name, String passowrd, int idRole) {
        String sql = "INSERT INTO user(name,password,id_role) VALUES(?,?,?)";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, passowrd);
            pstmt.setInt(3, idRole);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
private void selectAll() {
        String sql = "SELECT id, name, password, id_role FROM user";

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("name") + "\t" +
                        rs.getString("password") + "\t" +
                        rs.getInt("id_role"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

