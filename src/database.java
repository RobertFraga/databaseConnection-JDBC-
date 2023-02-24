import java.sql.*;

public class database extends databaseAccess {

    public static void dataBase(){
        try(Connection connection = DriverManager.getConnection(DB_URL, User, PassWord);
            Statement statement = connection.createStatement()){
            String sql = "CREATE DATABASE STUDENTS";
            statement.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
