import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.util.*;

public class consola //Clase para simular la consola de la aplicación
{

	public static ArrayList<String> FIFO = new ArrayList<String>();
	Queue<String> CustomerPriority=new LinkedList();
	Queue<String> integerPriorityQueue = new PriorityQueue<>(7);
	public static ArrayList<String> mailbox = new ArrayList<String>();
	public int expl=0;
	/*public static ArrayList<String> FIFO = new ArrayList<String>();
	public static ArrayList<String> FIFO = new ArrayList<String>();
	public static ArrayList<String> FIFO = new ArrayList<String>();*/

	public static proceso[] Procesos = new proceso[10];
	public BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
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

	public Boolean verifica_proceso(String nombre)
	{
		Boolean salida=false;
		for(int i=0;i<5;i++)
			{
				if(Procesos[i].retorna_nombre().equals(nombre))
			{
				salida=true;
				break;
			}
		}
		return salida;
	}

	public int envio_directoPrioridad()
		{

			String emisor="",receptor="";
			try
			{
				FileWriter f = new FileWriter("Estado del sistema.txt",true);
				PrintWriter pw = new PrintWriter(f);
				System.out.println("Digite el nombre de proceso emisor: ");
				emisor=br.readLine();
				if(verifica_proceso(emisor))
				{
					System.out.println("Digite el nombre de proceso receptor: ");
					receptor=br.readLine();
					if(verifica_proceso(receptor))
					{
						System.out.println("Digite la prioridad: ");
						int prior=Integer.parseInt(br.readLine());
						System.out.println("Digite el mensaje: ");
						String mensaje=br.readLine();
						pw.write(getFecha()+"Proceso "+emisor+" envia mensaje {"+mensaje+"} a "+receptor+"\n");
						pw.close();
						if (expl==0)
							integerPriorityQueue.add(receptor+" ha recibido mensaje {"+mensaje+"}");
						else
							CustomerPriority.add(receptor+" ha recibido mensaje {"+mensaje+"} de "+emisor);
							System.out.println("Mensaje enviado");
					}
					else {
							System.out.println("Proceso no existe");
							envio_directoFIFO();}
				}
				else {
					System.out.println("Proceso no existe");
					envio_directoFIFO();}
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return 0;
	}

	public int envio_directoFIFO()
	{

		String emisor="",receptor="";
		try
		{
			FileWriter f = new FileWriter("Estado del sistema.txt",true);
			PrintWriter pw = new PrintWriter(f);
			System.out.println("Digite el nombre de proceso emisor: ");
			emisor=br.readLine();
			if(verifica_proceso(emisor))
			{
				System.out.println("Digite el nombre de proceso receptor: ");
				receptor=br.readLine();
				if(verifica_proceso(receptor))
				{
					System.out.println("Digite el mensaje: ");
					String mensaje=br.readLine();
					pw.write(getFecha()+"Proceso "+emisor+" envia mensaje {"+mensaje+"} a "+receptor+"\n");
					pw.close();
					if (expl==0)
						CustomerPriority.add(receptor+" ha recibido mensaje {"+mensaje+"}");
					else
						CustomerPriority.add(receptor+" ha recibido mensaje {"+mensaje+"} de "+emisor);
					System.out.println("Mensaje enviado");
				}
				else {
						System.out.println("Proceso no existe");
						envio_directoFIFO();}
			}
			else {
				System.out.println("Proceso no existe");
				envio_directoFIFO();}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}

	public void conect_mailbox()
	{
		try{
				FileWriter f = new FileWriter("Estado del sistema.txt",true);
				PrintWriter pw = new PrintWriter(f);
				pw.write(getFecha()+"Conexion a mailbox exitosa"+"\n");
				pw.close();
				System.out.println("Conexion a mailbox exitosa");
				}catch(Exception e)
	{System.out.println(e);}
	}
	public void crear_mailbox()
	{
		try{
				FileWriter f = new FileWriter("Estado del sistema.txt",true);
		PrintWriter pw = new PrintWriter(f);
		pw.write(getFecha()+"Mailbox creado exitosamente"+"\n");
		pw.close();
		System.out.println("Mailbox creado exitosamente");
		}catch(Exception e)
	{System.out.println(e);}
	}
	public void recibir_directoFIFO()
	{
		try{
		FileWriter f = new FileWriter("Estado del sistema.txt",true);
		PrintWriter pw = new PrintWriter(f);
		if(CustomerPriority.peek() == null)
        	System.out.println("Cola vacia");
        else
        {
			String in = CustomerPriority.poll();
			System.out.println(in.toString());
        	pw.write(getFecha()+in.toString()+"\n");
			pw.close();
		}
	}catch(Exception e)
	{System.out.println(e);}
	}

	public void menu(int directo,int cola,int estatico,int explicito)
	{

		System.out.println("Bienvenido a la aplicacion");
		Boolean salida=false; //Variable para mantener el ciclo de ejecucion
		Ventana V;
		int vista=0;
		expl=explicito;
		try{
		while (!salida) //Inicio del ciclo de ejecución
		{
			interfaz inter=new interfaz();
			V= new Ventana();//Compara con la palabra salir, se repite para otros comandos
			System.out.println("Ingrese comando");
			System.out.println("Comandos posibles:\n ver \n salir \n enviar_msg \n recibir_msg \n cerrar_vista \n crear_mb \n conect_mb \n desconect_mb \n reset");
				String input = br.readLine(); //Lee el "comando" de la consola
				if (input.equals("salir")) salida=true;
				else if (input.equals("ver"))
				{
					V.setVisible(true);
					vista=1;
				}
				else if (input.equals("enviar_msg") && directo==0 && cola==0)
					envio_directoFIFO();
				else if (input.equals("enviar_msg") && directo==0 && cola==1)
					envio_directoPrioridad();
				else if (input.equals("crear_mb")){
					if(directo==1 && estatico==0)
						crear_mailbox();
						else System.out.println("Comando valido solo en ambiente indirecto estatico");
					}
				else if (input.equals("conect_mb")){
					if(directo==1 && estatico==1)
						conect_mailbox();
						else System.out.println("Comando valido solo en ambiente indirecto dinamico");
					}
				else if (input.equals("recibir_msg") && cola==0)
					recibir_directoFIFO();
				else if (input.equals("cerrar_vista")){
					if (vista==1) V.setVisible(false);
					else System.out.println("Ventana de vista no abierta aun");
				}
				else if (input.equals("reset"))
					{
						//inter=new interfaz();
						inter.setVisible(true);
						//this.dispose();//oculta el jFrame que estes usando

					}
				else
					System.out.println("Comando invalido");
			}
				System.out.println(salida); //Impresión para verificación
			 //Si salida se vuelve true por ingresar ese comando el programa se cierra
			System.out.println("Programa terminado");
			System.exit(0);
		}catch(IOException e) {System.out.println(e);}

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

		if(val.get(0).equals("indirecto")) directo=1;
		if(val.get(1).equals("implicito")) explicito=1;
		if(val.get(1).equals("dinamico")) estatico=1;

		proceso p1=new proceso("Word");
		Procesos[0]=p1;
		pw.println(getFecha()+"Creado proceso "+p1.retorna_nombre());
		proceso p2=new proceso("Comunicador");
		Procesos[1]=p2;
		pw.println(getFecha()+"Creado proceso "+p2.retorna_nombre());
		proceso p3=new proceso("Lector de archivos");
		Procesos[2]=p3;
		pw.println(getFecha()+"Creado proceso "+p3.retorna_nombre());
		proceso p4=new proceso("Wxcel");
		Procesos[3]=p4;
		pw.println(getFecha()+"Creado proceso "+p4.retorna_nombre());
		proceso p5=new proceso("TextPad");
		Procesos[4]=p5;
		pw.println(getFecha()+"Creado proceso "+p5.retorna_nombre());
		f.close();
		menu(directo,cola,estatico,explicito);


	}
}
