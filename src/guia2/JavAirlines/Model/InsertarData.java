package guia2.JavAirlines.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertarData {

    public void insertarData() {
        // 1. Usuarios obligatorios de la Fase 3 (INSERT OR IGNORE evita duplicados por
        // el UNIQUE de username)
        // 2. Mínimo 3 vuelos iniciales coherentes con la temática
        String seedVuelos = "INSERT INTO vuelos (origin, destiny, capability, status) "
                + "VALUES "
                + "('Medellín', 'Bogotá', 180, 'Programado'), "
                + "('Medellín', 'Cartagena', 150, 'A tiempo'), "
                + "('Cali', 'San Andrés', 160, 'Abordando')";

        try (Connection conn = ConexionDB.getConnection()) {
            if (conn == null) {
                System.out.println("No hay conexión con la base de datos.");
                return;
            }

            try (Statement stmt = conn.createStatement()) {
                // Verificamos si la tabla vuelos está vacía para no duplicarlos cada vez que
                // arranque el programa
                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM vuelos");
                if (rs.next() && rs.getInt(1) == 0) {
                    stmt.execute(seedVuelos);
                }

                System.out.println("Data inicial de JavAirlines verificada/insertada.");
            }
        } catch (SQLException e) {
            System.out.println("Error de base de datos al insertar data inicial: " + e.getMessage());
        }
    }
}