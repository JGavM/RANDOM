package Clases;

/*
 * Clase que administra las ventanas del juego
 */

/**
 *
 * @author Vania Herrera Mejía <vhm_1017@hotmail.com>
 */
public class Ventanas {
    
    //Se crea una única instancia de todas las ventanas del juego
    //Se crean desde el inicio para optimizar uso de recursos en tiempo de ejecución
    public static Juego juego;
    public static GameOver gameOver = new GameOver();
    public static NewGame inicio = new NewGame();
    public static Ganaste ganaste = new Ganaste();
    
    //Reproductor de sonido
    private static Audios play = new Audios();
    
    public static void mostrarJuego()
    {
        play.Parar();
        juego = new Juego();
        juego.setEnabled(true);
        juego.setVisible(true);
        play.Game();
    }
    
    public static void mostrarNewGame()
    {
        if(play.audio!=null)
            play.Parar();
        inicio.setEnabled(true);
        inicio.setVisible(true);
        play.NewGame();
        
    }
    
    /**
     * Método que muestra la ventana de Winner y reproduce el audio correspondiente
     */
    public static void mostrarWinner()
    {
        play.Parar();
        ganaste.setEnabled(true);
        ganaste.setVisible(true);
    }
    
    public static void mostrarGameOver()
    {
        play.Parar();
        gameOver.setEnabled(true);
        gameOver.setVisible(true);
    }
    
}