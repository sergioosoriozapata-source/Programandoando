package guia2.JavAirlines.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    // Inicializa las tablas y los usuarios por defecto al crear el DAO
    public UsuarioDAO() {
        ConexionDB.createTables();
        insertarUsuarioSiNoExiste();
    }

    // Valida las credenciales del login usando PreparedStatement
    public Usuario autenticar(String username, String password) {
        String querySql = "SELECT id, username, password FROM usuarios WHERE username = ? AND password = ?";

        try (Connection connection = ConexionDB.getConnection()) {
            if (connection == null) {
                throw new RuntimeException("No se pudo establecer la conexión.");
            }

            try (PreparedStatement statement = connection.prepareStatement(querySql)) {
                statement.setString(1, username);
                statement.setString(2, password);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return new Usuario(
                                resultSet.getInt("id"),
                                resultSet.getString("username"),
                                resultSet.getString("password")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e.getMessage());
        }

        return null;
    }

    // Inserta los usuarios iniciales del sistema
    public void insertarUsuarioSiNoExiste() {
        insertarUsuarioSiNoExiste("carlos", "1234");
        insertarUsuarioSiNoExiste("saul", "1234");
        insertarUsuarioSiNoExiste("sergio", "1234");
        insertarUsuarioSiNoExiste("barbas", "1234");
    }

    // Inserta un usuario solo si el username no existe en la base de datos
    public void insertarUsuarioSiNoExiste(String username, String password) {
        String checkSql = "SELECT id FROM usuarios WHERE username = ?";
        String insertSql = "INSERT INTO usuarios (username, password) VALUES (?, ?)";

        try (Connection connection = ConexionDB.getConnection()) {
            if (connection == null) {
                return;
            }

            boolean userExists = false;
            try (PreparedStatement checkStatement = connection.prepareStatement(checkSql)) {
                checkStatement.setString(1, username);
                try (ResultSet resultSet = checkStatement.executeQuery()) {
                    if (resultSet.next()) {
                        userExists = true;
                    }
                }
            }

            if (!userExists) {
                try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                    insertStatement.setString(1, username);
                    insertStatement.setString(2, password);
                    insertStatement.executeUpdate();
                    System.out.println("Usuario inicial creado: " + username);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
    }
}
