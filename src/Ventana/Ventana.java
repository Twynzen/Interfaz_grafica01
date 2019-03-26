
package Ventana;

import javax.swing.JFrame; //Para diseñar cuadros de dialogo, creo


public class Ventana extends JFrame{
    public Ventana(){ //Constructor //Se revisa la api para ver bien como funcionan los metodos
       setBounds(700,300,500,500);//Establece la posicion de apareicion y el tamaño de la ventana 
       
        //this.setSize(500, 500);//Esto establece el tamaño de la ventana
         setTitle("Titulo de ventana"); // Establrece e titulo de la ventana
         setDefaultCloseOperation(EXIT_ON_CLOSE); //Metodo para cerrar la ventana y que se termine el programa
       
        //setLocation(700,300);//por medio de plano cartesiano ubica la aparición de la ventana
        
       
        
        

        
    }
    
}
