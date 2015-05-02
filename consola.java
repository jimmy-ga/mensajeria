import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class consola //Clase para simular la consola de la aplicación
{
	public void crear(ArrayList<String> val) throws IOException
	{
				System.out.println(val);
                int directo =0; // 0 directo, 1 indirecto
                int explicito =0;// 0 explicito, 1 implicito
                int estatico =0; // 0 estatico, 1 dinamico
                int largo =0;
                int cola =0; // 0 fifo, 1 prioridad
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
