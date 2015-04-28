
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

public class FIFO_Queue {

    public static ArrayList<String> nombreArrayList = new ArrayList<String>();
    public static void main(String[] args) {

        //natural ordering example of priority queue
        Queue<String> integerPriorityQueue = new PriorityQueue<>(7);
        //Random rand = new Random();
        /*for(int i=0;i<7;i++){
            integerPriorityQueue.add(new Integer(rand.nextInt(100)));
        }
        for(int i=0;i<7;i++){
            Integer in = integerPriorityQueue.poll();
            System.out.println("Processing Integer:"+in);
        }*/

        //PriorityQueue example with Comparator

        //Queue<CustomerQueue> customerQueue = new PriorityQueue<>();


        Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner
        int opcion=0;
        do{
            try{
            System.out.println ("\nIntroduzca la opcion deseada: \n1.Enviar mensaje \n2.Recibir mensajes \n3.Estado Cola \n4.Salir  ");
            opcion = sc.nextInt(); //Invocamos un método sobre un objeto Scanner

            switch(opcion){
                case 1: opcion=1;
                    addDataToQueue(integerPriorityQueue);
                    break;

                case 2: opcion=2;
                    pollDataFromQueue(integerPriorityQueue);
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

    //Metodo que ingresa a la cola FIFO
    private static void addDataToQueue(Queue<String> CustomerPriority) {
        for(int i=0; i<1; i++){
        Scanner sc = new Scanner (System.in); //Creación de un objeto Scanner

        //mensaje
        String mensaje;
        System.out.println ("Por favor introduzca el mensaje: ");
        mensaje = sc.nextLine(); //Invocamos un método sobre un objeto Scanner

        //lo ingresa a la cola de prioridad
        CustomerPriority.add(new String(mensaje));
        System.out.println("El mensaje "+ mensaje+ " a sido enviado satisfactoriamente.");
        Date fecha = new Date();
        nombreArrayList.add("Mensaje "+mensaje+" enviado, datos: " + fecha);


        }
    }


    //utility method to poll data from queue
    private static void pollDataFromQueue(Queue<String> CustomerPriority) {
        while(true){
            //saca los mensajes de la cola de prioridad
            String in = CustomerPriority.poll();
            if(in == null) break;
            System.out.println("Mensaje recibido: "+in.toString());
            Date fecha = new Date();
            nombreArrayList.add("Mensaje consumido, datos: " +fecha);


        }
    }

}