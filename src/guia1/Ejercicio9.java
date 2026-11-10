package guia1;



public class Ejercicio9 {
     public static void main(String[] args){
         String usuario = "admin";
         String contraseña = "1234";

         if(usuario.equals("admin") && contraseña.equals("1234")){
            System.out.print("Bienvenido");
         }
         else{
            System.out.print("Credenciales incorrectas");
         }
     }
    
}
