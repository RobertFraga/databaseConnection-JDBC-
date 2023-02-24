import java.sql.*;

public class tables extends databaseAccess{
    static final String DB_URL = "jdbc:mysql://localhost/students";
    public static void dataBaseTables(){
        try(Connection conn = DriverManager.getConnection(DB_URL, User, PassWord);
            Statement stmt = conn.createStatement()){
            String sql = "CREATE TABLE REGISTRATION " +
                    "(id INTEGER not NULL, " +
                    " first VARCHAR(255), " +
                    " last VARCHAR(255), " +
                    " age INTEGER, " +
                    " PRIMARY KEY ( id ))";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
