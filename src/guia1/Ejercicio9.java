package guia1;

import javax.swing.JOptionPane;

public class Ejercicio9 {
    public void Login() {
     
        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";

        
        String usuarioIngresado = JOptionPane.showInputDialog("Ingrese su usuario:");
        if (usuarioIngresado == null) return;

        String passwordIngresado = JOptionPane.showInputDialog("Ingrese su contrase├▒a:");
        if (passwordIngresado == null) return; 

       
        if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {
            JOptionPane.showMessageDialog(null, "┬íBienvenido!");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
}
