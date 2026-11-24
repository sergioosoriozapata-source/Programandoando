package guia2.JavAirlines.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionDB {

    private static final String DB_URL = "jdbc:sqlite:javairlines.db";

    // Abre y devuelve la conexión con javairlines.db
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return connection;
    }

    // Crea las tablas principales si todavía no existen
    public static void createTables() {
        String usersTableSql = "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "username TEXT NOT NULL UNIQUE, "
                + "password TEXT NOT NULL)";

        String flightsTableSql = "CREATE TABLE IF NOT EXISTS vuelos ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "origin TEXT NOT NULL, "
                + "destiny TEXT NOT NULL, "
                + "capability INTEGER NOT NULL, "
                + "status TEXT NOT NULL)";

        try (Connection connection = getConnection()) {
            if (connection == null) {
                return;
            }
            try (Statement statement = connection.createStatement()) {
                statement.execute(usersTableSql);
                statement.execute(flightsTableSql);
            }
        } catch (SQLException e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
        }
    }
}
