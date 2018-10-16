package Clases;

/*
 * Clase que administra los audios del juego
 */

import java.applet.AudioClip;
/**
 *
 * @author Vania Herrera Mejía <vhm_1017@hotmail.com>
 */
public class Audios {
    AudioClip audio,independientes;
    
    /**
     * Ventana principal
     */
    public void NewGame(){
    audio=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/NewGame.wav"));
    audio.loop();
    }
    
    /**
     * Ventana de juego
     */
    public void Game(){
    audio=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Game.wav"));
    audio.loop();
    }
    
    /**
     * Sonido para empezar el juego
     */
    public void Start(){
    independientes=java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/Start.wav"));
    independientes.play();
    }
    
    /**
     * Detiene el AudioClip sonido de la instancia
     */
    public void Parar(){
    audio.stop();
    }
}
