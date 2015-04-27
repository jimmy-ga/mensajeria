public class proceso //prototipo clase proceso
{
	//Atributos
	private String nombre;
	private String mensaje;

	//Funciones

	public proceso(String Nombre) //Constructor
	{
		this.nombre=Nombre;
	}
	public String retorna_nombre() //Devuelve el nombre del objeto
	{
		return this.nombre;
	}
}