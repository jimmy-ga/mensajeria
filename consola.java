import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.util.*;

public class consola //Clase para simular la consola de la aplicación
{
	    public String getFecha()//Funcion para obtener la fecha formateada
	    {
	        //Instanciamos el objeto Calendar
	        //en fecha obtenemos la fecha y hora del sistema
	        Calendar fecha = new GregorianCalendar();
	        //Obtenemos el valor del año, mes, día,
	        //hora, minuto y segundo del sistema
	        //usando el método get y el parámetro correspondiente
	        int anio = fecha.get(Calendar.YEAR);
	        int mes = fecha.get(Calendar.MONTH);
	        int dia = fecha.get(Calendar.DAY_OF_MONTH);
	        int hora = fecha.get(Calendar.HOUR_OF_DAY);
	        int minuto = fecha.get(Calendar.MINUTE);
	        int segundo = fecha.get(Calendar.SECOND);
	        return("["+dia + "/" + (mes+1) + "/" + anio+" - "+hora+":"+minuto+":"+segundo+"] ");
    }

	public void crear(ArrayList<String> val) throws IOException
	{
		//Variables para crear y escribir en archivo
		FileWriter f = new FileWriter("Estado del sistema.txt");
		PrintWriter pw = new PrintWriter(f);
		//String fecha = new Date();
		pw.println(getFecha().toString()+"Inicio del sistema con los siguientes parametros:");
		pw.println(val);




		System.out.println(val);
		//String valores=val.toArray()[0];
		int directo =0; // 0 directo, 1 indirecto
		int explicito =0;// 0 explicito, 1 implicito
		int estatico =0; // 0 estatico, 1 dinamico
		int largo =0;
		int cola =0; // 0 fifo, 1 prioridad

		if(val.get(0).equals("Indirecto")) directo=1;


		proceso p1=new proceso("Word");
		pw.println(getFecha()+"Creado proceso "+p1.retorna_nombre());
		proceso p2=new proceso("Comunicador");
		pw.println(getFecha()+"Creado proceso "+p2.retorna_nombre());
		proceso p3=new proceso("Lector de archivos");
		pw.println(getFecha()+"Creado proceso "+p3.retorna_nombre());
		proceso p4=new proceso("Wxcel");
		pw.println(getFecha()+"Creado proceso "+p4.retorna_nombre());
		proceso p5=new proceso("TextPad");
		pw.println(getFecha()+"Creado proceso "+p5.retorna_nombre());
		f.close();


		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bienvenido a la aplicacion");
		System.out.println("Ingrese comando");
		System.out.println("Comandos posibles:\n ver \n salir \n enviar_msg");
		Boolean salida=false; //Variable para mantener el ciclo de ejecucion
		Ventana V;
		while (!salida) //Inicio del ciclo de ejecución
			{
				String input = br.readLine(); //Lee el "comando" de la consola
				if (input.equals("salir")) salida=true;
				if (input.equals("ver"))
				{
					V= new Ventana();//Compara con la palabra salir, se repite para otros comandos
					V.setVisible(true);
				}
				System.out.println(salida); //Impresión para verificación
			} //Si salida se vuelve true por ingresar ese comando el programa se cierra
			System.out.println("Programa terminado");
			System.exit(0);
	}
}
