package guia2.JavAirlines.View;

import java.util.List;

import javax.swing.JOptionPane;

import guia2.JavAirlines.Model.Vuelo;

public class MenuView {

    // Devuelve: 1-5 opción válida, 0 entrada inválida, -1 si cancelan
    public int mostrarMenuPrincipal() {
        String menu = "=== JAVAIRLINES ===\n"
                + "1. Agregar vuelo\n"
                + "2. Ver todos los vuelos\n"
                + "3. Actualizar vuelo\n"
                + "4. Eliminar vuelo\n"
                + "5. Cerrar sesión\n\n"
                + "Ingrese una opción:";

        String entrada = JOptionPane.showInputDialog(null, menu);
        if (entrada == null) return -1;

        try {
            return Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            mostrarError("Debe ingresar un número del 1 al 5.");
            return 0;
        }
    }

    // Devuelve null si cancelan o si algún dato es inválido
    public Vuelo pedirDatosVuelo() {
        String origin = JOptionPane.showInputDialog(null, "Origen:");
        if (origin == null) return null;

        String destiny = JOptionPane.showInputDialog(null, "Destino:");
        if (destiny == null) return null;

        String cap = JOptionPane.showInputDialog(null, "Capacidad (número de pasajeros):");
        if (cap == null) return null;

        String status = JOptionPane.showInputDialog(null, "Estado (Programado / Retrasado / Cancelado):");
        if (status == null) return null;

        if (origin.isBlank() || destiny.isBlank() || status.isBlank()) {
            mostrarError("Ningún campo puede quedar vacío.");
            return null;
        }

        int capability;
        try {
            capability = Integer.parseInt(cap.trim());
        } catch (NumberFormatException e) {
            mostrarError("La capacidad debe ser un número entero.");
            return null;
        }

        if (capability <= 0) {
            mostrarError("La capacidad debe ser mayor que cero.");
            return null;
        }

        return new Vuelo(destiny.trim(), capability, status.trim(), origin.trim());
    }

    // Devuelve el texto crudo del ID; null si cancelan
    public String pedirId() {
        String id = JOptionPane.showInputDialog(null, "Ingrese el ID del vuelo:");
        return (id == null) ? null : id.trim();
    }

    public void mostrarLista(List<Vuelo> vuelos) {
        if (vuelos == null || vuelos.isEmpty()) {
            mostrarMensaje("No hay vuelos registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("--- VUELOS REGISTRADOS ---\n\n");
        for (Vuelo v : vuelos) {
            sb.append("#").append(v.getFlightId())
              .append(" | ").append(v.getOrigin())
              .append(" -> ").append(v.getDestiny())
              .append(" | ").append(v.getStatus())
              .append(" | capacidad ").append(v.getCapability())
              .append("\n");
        }
        mostrarMensaje(sb.toString());
    }

    public boolean confirmarEliminacion(int flightId) {
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Seguro que desea eliminar el vuelo #" + flightId + "?",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        return respuesta == JOptionPane.YES_OPTION;
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}