package ru.itis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    // строки для подключения к БД из Java
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/java_itis";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        // создаем подключение к базе данных
        Connection connection = DriverManager
                .getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        // создаем объект-"выражение" для отправки запросов в бд
        Statement statement = connection.createStatement();
        // отправляем в базу данных запрос
        // и получаем результат - множество строк ответа
        ResultSet result = statement.executeQuery("select * from taxi_user");
        // пока множество ответа не пустое
        while (result.next()) {
            // выводим данные текущей строки ответа
            System.out.println(result.getString("first_name"));
        }
    }
}
