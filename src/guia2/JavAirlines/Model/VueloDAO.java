package guia2.JavAirlines.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VueloDAO {

    // CREATE
    public boolean agregar(Vuelo v) {
        String sql = "INSERT INTO vuelos (destiny, capability, status, origin) VALUES (?, ?, ?, ?)";
        try (Connection conn = ConexionDB.getConnection()) {
            if (conn == null) {
                System.out.println("No hay conexión con la base de datos.");
                return false;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, v.getDestiny());
                ps.setInt(2, v.getCapability());
                ps.setString(3, v.getStatus());
                ps.setString(4, v.getOrigin());
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar vuelo: " + e.getMessage());
            return false;
        }
    }

    // READ
    public List<Vuelo> verTodos() {
        List<Vuelo> vuelos = new ArrayList<>();
        String sql = "SELECT id, destiny, capability, status, origin FROM vuelos ORDER BY id";
        try (Connection conn = ConexionDB.getConnection()) {
            if (conn == null) return vuelos;
            try (PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    vuelos.add(new Vuelo(
                            rs.getInt("id"),
                            rs.getString("destiny"),
                            rs.getInt("capability"),
                            rs.getString("status"),
                            rs.getString("origin")));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al listar vuelos: " + e.getMessage());
        }
        return vuelos;
    }

    // UPDATE
    public boolean actualizar(Vuelo v) {
        String sql = "UPDATE vuelos SET destiny = ?, capability = ?, status = ?, origin = ? "
                   + "WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection()) {
            if (conn == null) {
                System.out.println("No hay conexión con la base de datos.");
                return false;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, v.getDestiny());
                ps.setInt(2, v.getCapability());
                ps.setString(3, v.getStatus());
                ps.setString(4, v.getOrigin());
                ps.setInt(5, v.getFlightId());
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar vuelo: " + e.getMessage());
            return false;
        }
    }

    // DELETE
    public boolean eliminar(int flightId) {
        String sql = "DELETE FROM vuelos WHERE id = ?";
        try (Connection conn = ConexionDB.getConnection()) {
            if (conn == null) {
                System.out.println("No hay conexión con la base de datos.");
                return false;
            }
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, flightId);
                return ps.executeUpdate() > 0;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar vuelo: " + e.getMessage());
            return false;
        }
    }

    public static void insertarDatosIniciales() {
        String sqlContar = "SELECT COUNT(*) FROM vuelos";
        String sqlInsert = "INSERT INTO vuelos (destiny, capability, status, origin) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionDB.getConnection()) {
            if (conn == null) {
                System.out.println("No hay conexión con la base de datos.");
                return;
            }

            try (PreparedStatement ps = conn.prepareStatement(sqlContar);
                 ResultSet rs = ps.executeQuery()) {
                if (rs.next() && rs.getInt(1) > 0) return; // ya hay datos
            }

            Object[][] base = {
                    {"Medellín", 180, "Programado", "Bogotá"},
                    {"Cartagena", 150, "Programado", "Medellín"},
                    {"Bogotá", 120, "Retrasado", "Cartagena"}
            };

            try (PreparedStatement ps = conn.prepareStatement(sqlInsert)) {
                for (Object[] d : base) {
                    ps.setString(1, (String) d[0]);
                    ps.setInt(2, (Integer) d[1]);
                    ps.setString(3, (String) d[2]);
                    ps.setString(4, (String) d[3]);
                    ps.addBatch();
                }
                ps.executeBatch();
            }

            System.out.println("Datos iniciales de vuelos insertados.");
        } catch (SQLException e) {
            System.out.println("Error al insertar datos iniciales: " + e.getMessage());
        }
    }
}