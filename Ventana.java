import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.io.*;
/**
 * Clase Ventana
 * Muestra la estructuta que deberia tener una Ventana en Java con la libreria
 * Swing, contiene una etiqueta, un caja de texto y un boton, que tiene la
 * accion de mostrar el texto en la caja por una ventana de mensaje.
 * @author Daniel Alvarez (a3dany)
 */
public class Ventana extends JFrame implements ActionListener {

    private JLabel texto;           // etiqueta o texto no editable
    //private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion

    public Ventana() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Estado del sistema");                   // colocamos titulo a la ventana
        this.setSize(600, 500);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        TextArea caja = new TextArea("",5,100,TextArea.SCROLLBARS_VERTICAL_ONLY );
        String contenido="",linea="";
        File archivo = new File ("Estado del sistema.txt");
        try {
			FileReader fr = new FileReader (archivo);
			BufferedReader br = new BufferedReader(fr);
			while((linea=br.readLine())!=null)
				contenido+=linea+"\n";
			}
		catch(Exception e)
			{
        	 	e.printStackTrace();
			}
		caja.append(contenido);
        /*for( int i=0; i < 500; i++ )
            caja.append( "linea "+i+"\n" );*/
        caja.setBounds(0, 0, 590, 470);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        this.add(caja);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
        //JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
    }

    /*public static void main(String args[])
    {
		Ventana V= new Ventana();//Compara con la palabra salir, se repite para otros comandos
					V.setVisible(true);
	}*/
}