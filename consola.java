public class consola //Clase para simular la consola de la aplicación
{
	public static void main(String args[])
	{
		System.out.println("Ingrese comando");
		Boolean salida=false; //Variable para mantener el ciclo de ejecucion
		while (!salida) //Inicio del ciclo de ejecución
			{
				String input = System.console().readLine(); //Lee el "comando" de la consola
				salida=input.equals("salir"); //Compara con la palabra salir, se repite para otros comandos
				System.out.println(salida); //Impresión para verificación
			} //Si salida se vuelve true por ingresar ese comando el programa se cierra
			System.out.println("Programa terminado");
	}
}
