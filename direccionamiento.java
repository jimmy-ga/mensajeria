import java.util.*;
public class direccionamiento //Clase para gestion del direccionamiento
{
	private int directo=0;
	private static ArrayList<proceso> procesos = new ArrayList<proceso>();
	private static ArrayList<String> mailbox = new ArrayList<String>();

	public static void sendDirecto()//String origen,String destino,String mensaje)
	{

	}

	public void imprimir_procesos()
	{
		for(int x=0;x<procesos.size();x++)
			{
				System.out.println("Objeto "+ procesos.get(x).retorna_nombre()+ "21 estado "+ procesos.get(x).retorna_estado());
			}
	}

	public static void main(String args[])
	{

		//System.out.println("Hola mundo");
		proceso p1 = new proceso("proceso1");
		procesos.add(p1);
		proceso p2 = new proceso("proceso2");
		procesos.add(p2);
		proceso p3 = new proceso("proceso3");
		procesos.add(p3);
		proceso p4 = new proceso("proceso4");
		procesos.add(p4);
		//System.out.println(obj.retorna_nombre());

		{
			sendDirecto();
		}
	}
}