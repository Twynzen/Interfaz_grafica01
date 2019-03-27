
package Ventana;

//import java.awt.Color;
import java.awt.Color;
import javax.swing.JFrame; //Para diseñar cuadros de dialogo, creo
import javax.swing.JPanel; //libreria para crear paneles


public class Ventana extends JFrame{
    public Ventana(){ //Constructor //Se revisa la api para ver bien como funcionan los metodos
        this.setSize(500, 500);//Esto establece el tamaño de la ventana
         setTitle("Titulo de ventana"); // Establrece e titulo de la ventana
        //Metodo para cerrar la ventana y que se termine el programa
         
         
         setLocationRelativeTo(null);//Al usar este por defecto ejecuta la ventana en el centro
         
        //setLocation(700,300);//por medio de plano cartesiano ubica la aparición de la ventana
        
        //setBounds(700,300,500,500);//Establece la posicion de apareicion y el tamaño de la ventana
       
        iniciarComponentes();
        
        //this.getContentPane().setBackground(Color.blue); // color de ventana    

       setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
    
    
    private void iniciarComponentes(){
        JPanel panel = new JPanel();  
        panel.setBackground(Color.BLUE);
        this.getContentPane().add(panel);
    }
    
}
