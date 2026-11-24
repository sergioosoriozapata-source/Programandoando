package guia2;

import javax.swing.JOptionPane;

import guia2.JavAirlines.Controller.LoginController;
import guia2.JavAirlines.Controller.VueloController;
import guia2.JavAirlines.Model.ConexionDB;
import guia2.JavAirlines.Model.Usuario;
import guia2.JavAirlines.Model.UsuarioDAO;
import guia2.JavAirlines.Model.VueloDAO;

public class MainPersistenciaData {
    public void MenuBaseDeDatos() {
        String entrada = JOptionPane.showInputDialog(null, "Ingresando A Ejercicios Base De Datos \n" +
                "1.Actividad 3.3 Guia 2 Crear Base de Ejemplo \n" +
                "2.Actividad 3.4 Creando Sistema Con Login");

        if (entrada == null) return;

        int opcion;
        try {
            opcion = Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número del 1 al 2.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (opcion == 1) {
            ConexionDB crearTabDb = new ConexionDB();
            crearTabDb.createTables();
            JOptionPane.showMessageDialog(null, "Base de datos de ejemplo creada exitosamente (javairlines.db)");
        } else if (opcion == 2) {
            ConexionDB.createTables();
            VueloDAO.insertarDatosIniciales();
            new UsuarioDAO().insertarUsuarioSiNoExiste();

            LoginController loginController = new LoginController();
            while (true) {
                Usuario usuarioActivo = loginController.iniciarSesion();
                if (usuarioActivo == null) {
                    break;
                }

                VueloController vueloController = new VueloController(usuarioActivo);
                vueloController.iniciar();
                loginController.cerrarSesion();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opción inválida. Debe ingresar 1 o 2.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
