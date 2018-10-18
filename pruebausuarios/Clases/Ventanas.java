
package pruebausuarios.Clases;

import Clases.Audios;
import Clases.GameOver;
import Clases.Ganaste;
import Clases.NewGame;


/**
 *
 * @author Estudiante
 */
public class Ventanas {
    
    public static Juego vJuego;     
    public static GameOver gameOver = new GameOver();
    public static NewGame inicio = new NewGame();
    public static Ganaste ganaste = new Ganaste();
        
      public static void mostrarJuego()
    {
        
        
    }
    
    public static void mostrarNewGame()
    {
       
    }
    
    /**
     * Método que muestra la ventana de Winner y reproduce el audio correspondiente
     */
    public static void mostrarWinner()
    {

        ganaste.setEnabled(true);
        ganaste.setVisible(true);
    }
    
    public static void mostrarGameOver()
    {
        
        gameOver.setEnabled(true);
        gameOver.setVisible(true);
    }
    
     
}
