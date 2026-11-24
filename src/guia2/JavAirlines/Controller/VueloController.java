package guia2.JavAirlines.Controller;

import guia2.JavAirlines.Model.Usuario;
import guia2.JavAirlines.Model.Vuelo;
import guia2.JavAirlines.Model.VueloDAO;
import guia2.JavAirlines.View.MenuView;
import java.util.List;

public class VueloController {

    private final String usuarioActivo;
    private final VueloDAO vueloDAO;
    private final MenuView view;

    public VueloController() {
        this.usuarioActivo = "Operador";
        this.vueloDAO = new VueloDAO();
        this.view = new MenuView();
    }

    public VueloController(Usuario usuario) {
        if (usuario != null && usuario.getUsername() != null && !usuario.getUsername().isBlank()) {
            this.usuarioActivo = usuario.getUsername().trim();
        } else {
            this.usuarioActivo = "Operador";
        }
        this.vueloDAO = new VueloDAO();
        this.view = new MenuView();
    }

    public void iniciar() {
        boolean ejecutando = true;

        while (ejecutando) {
            int opcion = view.mostrarMenuPrincipal();

            switch (opcion) {
                case -1, 5 -> ejecutando = false; // -1 es cancelar diálogo, 5 cerrar sesión
                case 0 -> {
                    /* Entrada no numérica: MenuView ya mostró el error */ }
                case 1 -> agregarVuelo();
                case 2 -> verVuelos();
                case 3 -> actualizarVuelo();
                case 4 -> eliminarVuelo();
                default -> view.mostrarError("Opción no válida. Elige un número del 1 al 5.");
            }
        }
    }

    private void agregarVuelo() {
        Vuelo nuevoVuelo = view.pedirDatosVuelo();
        if (nuevoVuelo == null)
            return; // Cancelado o datos inválidos (MenuView ya notificó)

        boolean guardado = vueloDAO.agregar(nuevoVuelo);

        if (guardado) {
            view.mostrarMensaje(
                    "Vuelo guardado por " + usuarioActivo + ":\n"
                            + "Origen: " + nuevoVuelo.getOrigin() + " -> Destino: " + nuevoVuelo.getDestiny()
                            + "\nCapacidad: " + nuevoVuelo.getCapability() + " | Estado: " + nuevoVuelo.getStatus());
        } else {
            view.mostrarError("No se pudo guardar el vuelo. Revisa la conexión a la base de datos.");
        }
    }

    private void verVuelos() {
        List<Vuelo> vuelos = vueloDAO.verTodos();
        view.mostrarLista(vuelos);
    }

    private void actualizarVuelo() {
        Integer flightId = solicitarIdValido();
        if (flightId == null)
            return;

        Vuelo datosNuevos = view.pedirDatosVuelo();
        if (datosNuevos == null)
            return;

        // Reconstruimos el objeto incluyendo el flightId que pidió el usuario
        Vuelo vueloActualizado = new Vuelo(
                flightId,
                datosNuevos.getDestiny(),
                datosNuevos.getCapability(),
                datosNuevos.getStatus(),
                datosNuevos.getOrigin());

        boolean actualizado = vueloDAO.actualizar(vueloActualizado);

        if (actualizado) {
            view.mostrarMensaje("Vuelo #" + flightId + " actualizado correctamente.");
        } else {
            view.mostrarError("No se pudo actualizar el vuelo #" + flightId + " (revisa si el ID existe).");
        }
    }

    private void eliminarVuelo() {
        Integer flightId = solicitarIdValido();
        if (flightId == null)
            return;

        if (view.confirmarEliminacion(flightId)) {
            boolean eliminado = vueloDAO.eliminar(flightId);
            if (eliminado) {
                view.mostrarMensaje("Vuelo #" + flightId + " eliminado.");
            } else {
                view.mostrarError("No se pudo eliminar el vuelo #" + flightId + " (revisa si el ID existe).");
            }
        }
    }

    // Convierte y valida el String que devuelve view.pedirId()
    private Integer solicitarIdValido() {
        String idTexto = view.pedirId();
        if (idTexto == null)
            return null; // El usuario canceló

        if (idTexto.isEmpty()) {
            view.mostrarError("Debes escribir un ID.");
            return null;
        }

        try {
            int id = Integer.parseInt(idTexto);
            if (id <= 0) {
                view.mostrarError("El ID debe ser mayor que cero.");
                return null;
            }
            return id;
        } catch (NumberFormatException e) {
            view.mostrarError("El ID debe ser un número entero válido.");
            return null;
        }
    }
}