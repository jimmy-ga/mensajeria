
//package ColaPrioridad;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import java.util.Iterator;

public class Priority_Queue {

    public static ArrayList<String> nombreArrayList = new ArrayList<String>();
    public static void main(String[] args) {


        //PriorityQueue example with Comparator

        Queue<CustomerPriority> customerPriorityQueue = new PriorityQueue<>(7, idComparator);


        Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner
        int opcion=0;
        do{
            try{
            System.out.println ("\nIntroduzca la opcion deseada: \n1.Enviar mensaje \n2.Recibir mensajes \n3.Estado Cola \n4.Salir  ");
            opcion = sc.nextInt(); //Invocamos un método sobre un objeto Scanner

            switch(opcion){
                case 1: opcion=1;
                    addDataToQueue(customerPriorityQueue);
                    break;
                case 2: opcion=2;
                    pollDataFromQueue(customerPriorityQueue);
                    break;
                case 3:
                    Iterator<String> nombreIterator = nombreArrayList.iterator();
                    while(nombreIterator.hasNext()){
                        String elemento = nombreIterator.next();
                        System.out.print(elemento+" \n");
                    }
                    break;
                case 4:
                    System.exit(0);
                        }
            }
            catch(InputMismatchException e)
                {
                System.out.println("Error: Sólo se pueden ingresar números.\n");
                sc.next();
                }
            }while(opcion<4);


        }

    //public ArrayList Fechas = new ArrayList();


    //Comparator anonymous class implementation
    public static Comparator<CustomerPriority> idComparator = new Comparator<CustomerPriority>(){

        @Override
        public int compare(CustomerPriority c1, CustomerPriority c2) {
            return (int) (c2.getId() - c1.getId());
        }
    };

    //Metodo que ingresa en la cola
    private static void addDataToQueue(Queue<CustomerPriority> customerPriorityQueue) {
        for(int i=0; i<1; i++){
        Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner

        //mensaje
        String mensaje;
        System.out.println ("Por favor introduzca el mensaje: ");
        mensaje = sc.nextLine(); //Invocamos un método sobre un objeto Scanner
        //id
        int id=0;
        try{
        System.out.println("Ingrese el numero de prioridad");
        id = sc.nextInt();
        }
        catch(InputMismatchException e)
        {
        System.out.println("Error: Sólo se pueden ingresar números.\n");
        sc.next();
        }
        //lo ingresa a la cola de prioridad
        customerPriorityQueue.add(new CustomerPriority(id, mensaje));
            System.out.println("El mensaje "+ mensaje+ " a sido enviado satisfactoriamente.");
        Date fecha = new Date();
        nombreArrayList.add("Mensaje "+mensaje+" enviado, datos: " + fecha);




        }
    }

    //utility method to poll data from queue
    private static void pollDataFromQueue(Queue<CustomerPriority> customerPriorityQueue) {
        while(true){
            //saca los mensajes de la cola de prioridad
            CustomerPriority cust = customerPriorityQueue.poll();
            if(cust == null) break;
            System.out.println("Mensaje recibido: "+cust.getName());
            Date fecha = new Date();
            nombreArrayList.add("Mensaje consumido, datos: " +fecha);


        }
    }

}