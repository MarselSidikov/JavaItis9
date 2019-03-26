package ru.itis;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/java_itis";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager
                .getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        Statement statement = connection.createStatement();

        ResultSet result = statement.executeQuery("select * from taxi_user");
        // пока множество ответа не пустое
        while (result.next()) {
            // выводим данные текущей строки ответа
            System.out.println(result.getString("first_name"));
        }
    }
}
