
package Clases;

/**
 *
 * @author Estudiante
 */
public class Ventanas {
    
        public static Juego vJuego;
        public static Principal vPrincipal;
        
        public static void AbrirJuego(){
            vJuego = new Juego();
            vJuego.setVisible(true);
        }
        
        public static void AbrirPrincipal(){
            vPrincipal = new Principal();
            vPrincipal.setVisible(true);
        }
        
        public static void AbrirGameOver(){
            
        }
        
        public static void AbrirWinner(){
            
        }
}
