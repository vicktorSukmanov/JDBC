package jm.task.core.jdbc.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/user";

    private static final String NAME = "root";

    private static final String PASSWORD = "root";

public static Connection getConnection()  {
    Connection connection = null;
    try {
        Class.forName(DRIVER).getDeclaredConstructor().newInstance();
        connection = DriverManager.getConnection(URL,NAME,PASSWORD);

    } catch (Exception e){
        System.out.println("Не удалось установить соединение с БД");
    }
    return connection;
}
}
