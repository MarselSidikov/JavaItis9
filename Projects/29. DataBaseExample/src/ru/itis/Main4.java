package ru.itis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
    // строки для подключения к БД из Java
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/java_itis";
    private static final String DB_USERNAME = "postgres";
    private static final String DB_PASSWORD = "qwerty007";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager
                .getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        Statement statement = connection.createStatement();
        // получаем результат - набор строк всех пользователей
        // и всех машин
        // понятно, что есть дубликаты пользователей
        // потому что у одного пользователя
        // может быть несколько машин
        ResultSet result = statement.executeQuery("select taxi_user.id as u_id, " +
                "* from taxi_user left join car c on taxi_user.id = c.owner_id;");

        // создаем мапу, для того, чтобы хранить
        // id владельцев и самих владельцев
        // как java-объектов
        Map<Long, Human> humansMap = new HashMap<>();
        // бежим по всем строкам результата бд
        while (result.next()) {
            // вытаскиваем id владельца из текущей строки
            long id = result.getLong("u_id");
            // если до этого в мапе не был зафиксирован
            // такой id, значит мы встретили этого
            // владельца в первый раз
            if (!humansMap.containsKey(id)) {
                // создаем java-объект, который содержит
                // данные о владельце, взятые из текущей строки
                Human human = new Human(
                        id,
                        result.getString("first_name"),
                        result.getString("last_name"),
                        result.getInt("age"),
                        result.getBoolean("is_man"));
                // кладем в мап этот id как ключ
                // а в качестве значения кладем сам объект
                humansMap.put(id, human);
            }
        }

        for (Human human : humansMap.values()) {
            System.out.println(human.getFirstName() + " " + human.getLastName());
        }
    }
}
