import java.sql.*;

class databaseAccess {
    static final String DB_URL = "jdbc:mysql://localhost/students";
    static final String User = "boogeyman";
    static final String PassWord = "09327271336";
    static final String connection = "SELECT id, first, last, age FROM REGISTRATION";

    public static void Access(){
        // Open a connection
        try(Connection databaseConnection = DriverManager.getConnection(DB_URL, User, PassWord);
            Statement statement = databaseConnection.createStatement();
            ResultSet result = statement.executeQuery(connection)) {
            // Extract data from result set
            while (result.next()) {
                // Retrieve by column name
                System.out.println("ID: " + result.getInt("id"));
                System.out.println("    Age: " + result.getInt("age"));
                System.out.println("    First: " + result.getString("first"));
                System.out.println("    Last: " + result.getString("last"));
                System.out.println("===================================================================================================================================================");
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
