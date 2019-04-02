package ru.itis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main2 {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/java_itis";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager
                .getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        PreparedStatement preparedStatement = connection.prepareStatement("insert into taxi_user(first_name, last_name, is_man, age) values (?, ?, ?, ?)");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            boolean isMan = scanner.nextBoolean();
            int age = scanner.nextInt();

            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setBoolean(3, isMan);
            preparedStatement.setInt(4, age);

            preparedStatement.execute();

        }
    }
}
