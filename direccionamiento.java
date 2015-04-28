import java.util.*;
public class direccionamiento //Clase para gestion del direccionamiento
{
	private int directo=0;
	private static ArrayList<String> procesos = new ArrayList<String>();

	public void sendDirecto()//String origen,String destino,String mensaje)
	{
		for(int x=0;x<al.size();x++)
		{
			System.out.println(al.get(x));
		}

	}

	public void imprimir_procesos()
	{

	}

	public static void main(String args[])
	{

		//System.out.println("Hola mundo");
		proceso p1 = new proceso("proceso1");
		procesos.add(p1.retorna_nombre());
		proceso p2 = new proceso("proceso2");
		procesos.add(p2.retorna_nombre());
		proceso p3 = new proceso("proceso3");
		procesos.add(p3.retorna_nombre());
		proceso p4 = new proceso("proceso4");
		procesos.add(p4.retorna_nombre());
		//System.out.println(obj.retorna_nombre());

		{
			sendDirecto();
		}
	}
}