package guia2.JavAirlines.Controller;

import guia2.JavAirlines.Model.Usuario;
import guia2.JavAirlines.Model.UsuarioDAO;
import guia2.JavAirlines.View.LoginView;

public class LoginController {

    private final LoginView loginView = new LoginView();
    private final UsuarioDAO usuarioDAO = new UsuarioDAO();
    private final VueloController vueloController = new VueloController(); // <-- 1. Instancias la vista (o tu VueloController)
    private Usuario usuarioActivo = null;

    public Usuario iniciarSesion() {
        int intentos = 0;

        while (intentos < 3) {
            String user = loginView.pedirUsuario();
            if (user == null)
                System.exit(0);

            String pass = loginView.pedirPassword();
            if (pass == null)
                System.exit(0);

            try {
                Usuario encontrado = usuarioDAO.autenticar(user, pass);

                if (encontrado != null) {
                    this.usuarioActivo = encontrado;
                    loginView.mostrarMensaje("¡Bienvenido a JavAirlines, " + encontrado.getUsername() + "!");

                    

                    return encontrado;
                } else {
                    intentos++;
                    loginView.mostrarMensaje("Usuario o contraseña incorrectos. Intento " + intentos + " de 3.");
                }
            } catch (Exception e) {
                loginView.mostrarMensaje("Error al conectar con la base de datos: " + e.getMessage());
            }
        }

        loginView.mostrarMensaje("Has superado los 3 intentos permitidos. El programa se cerrará.");
        System.exit(0);
        return null;
    }

    // ... resto de tus métodos
    public void cerrarSesion() {
        this.usuarioActivo = null;
        loginView.mostrarMensaje("Sesión cerrada correctamente.");
    }

    public Usuario getUsuarioActivo() {
        return usuarioActivo;
    }
}