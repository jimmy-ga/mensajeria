import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

public class consola //Clase para simular la consola de la aplicación
{
	public void crear(ArrayList<String> val) throws IOException
	{
		//Variables para crear y escribir en archivo
		FileWriter f = new FileWriter("Estado del sistema.txt");
		PrintWriter pw = new PrintWriter(f);
		Date fecha = new Date();
		pw.println("["+fecha.toString()+"]"+" Inicio del sistema con los siguientes parametros:");
		pw.println(val);
		f.close();



		System.out.println(val);
		//String valores=val.toArray()[0];
		int directo =0; // 0 directo, 1 indirecto
		int explicito =0;// 0 explicito, 1 implicito
		int estatico =0; // 0 estatico, 1 dinamico
		int largo =0;
		int cola =0; // 0 fifo, 1 prioridad

		if(val.get(0).equals("Indirecto")) directo=1;



		proceso p1=new proceso("Word");
		proceso p2=new proceso("Comunicador");
		proceso p3=new proceso("Lector de archivos");
		proceso p4=new proceso("Wxcel");
		proceso p5=new proceso("TextPad");



		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese comando");
		Boolean salida=false; //Variable para mantener el ciclo de ejecucion
		while (!salida) //Inicio del ciclo de ejecución
			{
				String input = br.readLine(); //Lee el "comando" de la consola
				salida=input.equals("salir"); //Compara con la palabra salir, se repite para otros comandos
				System.out.println(salida); //Impresión para verificación
			} //Si salida se vuelve true por ingresar ese comando el programa se cierra
			System.out.println("Programa terminado");
			System.exit(0);
	}
}
