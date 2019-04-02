package ru.itis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Main3 {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/java_itis";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager
                .getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        Statement statement = connection.createStatement();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            boolean isMan = scanner.nextBoolean();
            int age = scanner.nextInt();
            //language=SQL

            // ','',true,0); DROP TABLE CAR; insert into taxi_user (first_name, last_name, is_man, age) values ('
            String query =
                    "insert into taxi_user(first_name, last_name, is_man, age) " +
                            "values('" + firstName + "','" + lastName + "'," + isMan + "," + age + ");";
            System.out.println(query);
            statement.executeUpdate(query);

        }
    }
}
