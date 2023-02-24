import java.sql.*;

public class selection extends databaseAccess{
    public static void dataBaseSelection(){
        System.out.println("Connecting to a selected database...");
        // Open a connection
        try(Connection connection = DriverManager.getConnection(DB_URL, User, PassWord)) {
            System.out.println("Connected database successfully...");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
