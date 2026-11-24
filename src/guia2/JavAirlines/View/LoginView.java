package guia2.JavAirlines.View;

import javax.swing.JOptionPane;

public class LoginView {

    public String pedirUsuario() {
        return JOptionPane.showInputDialog(null, "=== JAVAIRLINES ===\nUsuario:");
    }

    public String pedirPassword() {
        return JOptionPane.showInputDialog(null, "Contraseña:");
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
}