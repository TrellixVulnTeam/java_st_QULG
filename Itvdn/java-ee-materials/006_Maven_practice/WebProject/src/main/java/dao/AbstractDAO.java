package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Asus on 08.02.2018.
 */
public abstract class AbstractDAO implements InterfaceDAO  {

    private final String URL = "jdbc:mysql://localhost:3306/flowers";
    private final String USER = "root";
    private final String PASSWORD = "root";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
