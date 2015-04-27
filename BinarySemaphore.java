public class BinarySemaphore
{
    int value;
    public BinarySemaphore(int initial)
    {
        value = (initial>0) ? 1 : 0;
    }

    public synchronized void P() throws InterruptedException // operacion de espera
    { 
        while (value==0)
        {
            wait();
        }
        value = 0;
        notify();
    }

    public synchronized void V()// operacion de senal de control de concurrencia
    { 
        value = 1;
        notify();
    }
}
