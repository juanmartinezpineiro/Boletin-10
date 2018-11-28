package boletin10_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jmartinezpineiro
 */
public class Juego {
    private int num;
    private int intentos;
    private int respuesta;
    
    //Metodo para establecer que se introduzca un número entre 1 y 5 y solicita los numeros de intentos
    public void normasJuegos(){
        boolean correcto = false;
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 1 y 50:"));
            if(num > 0 && num <= 50){
                correcto = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Número inválido. Inténtelo de nuevo");
            }
        }while(correcto == false);
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número de intentos del juego:"));
    }
    
    //Metodo de introduccion del numero para que lo acierte, esto se hace a través del if
    public void arrancarJuego(){
        this.normasJuegos();
        for(int i = 0; i < intentos; i++){
            respuesta = Integer.parseInt(JOptionPane.showInputDialog("Adivine un número entre 1 y 50:"));
            if(respuesta > num){
                JOptionPane.showMessageDialog(null, "El número es menor");
            }
            else if(respuesta < num){
                JOptionPane.showMessageDialog(null, "El número es mayor");
            }
            else{
                JOptionPane.showMessageDialog(null, "Respuesta correcta");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Se han terminado los intentos");
    }
}