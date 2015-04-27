public abstract class Canal
{
    public abstract void send(Object m); // envia un msj objeto
    public abstract void send(); // senal para el receptor
    public abstract Object receive(); // recibe un objeto
}
