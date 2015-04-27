import java.util.logging.Level;
import java.util.logging.Logger;

public class Sincronizacion extends Canal 
{
    private Object mensaje = null;
    private final Object enviar = new Object();
    private final Object recibir = new Object();
    private final BinarySemaphore enviado = new BinarySemaphore(0);
    private final BinarySemaphore recibido = new BinarySemaphore(0);
    
    public final void send(Object msjEnviado) 
    {
            if (msjEnviado == null) {throw new
            NullPointerException("Mensaje nulo");
        }
        synchronized (enviar) 
        {
            mensaje = msjEnviado;
            enviado.V(); // senal que el msj esta disponible
 
        }
    }

    public final void send()
    {
        synchronized (enviar) 
        {
            mensaje = new Object();// envia un msj nulo
            enviado.V(); // msj esta disponible
        }
    }
    public final Object receive() 
    {
        Object msjRecibido = null;
        synchronized (recibir) 
        {
            msjRecibido = mensaje;
            recibido.V(); // senal al emisor que el msj se recibio
        } 
        return msjRecibido;
    }
}
