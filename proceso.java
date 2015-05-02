public class proceso //prototipo clase proceso
{
	//Atributos
	private String nombre;
	private int estado=0;
	//Funciones
	public proceso(String Nombre) //Constructor
	{
		this.nombre=Nombre;
	}
	public String retorna_nombre() //Devuelve el nombre del objeto
	{
		return this.nombre;
	}
	public int cambiaEstado()
	{
		int est=this.estado;
		if (est==0) this.estado=1;
		else this.estado=0;
		return this.estado;
	}
	/*public int recibeMensaje(String Mensaje)
	{
		//this.mensaje=Mensaje;
		return 0;
	}*/
	public int retorna_estado()
	{
		return this.estado;
	}
}