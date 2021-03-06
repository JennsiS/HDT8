
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;
/**
 * @author Jennifer Sandoval,Esteban del Valle
 * @Carne 18962,18
 * @date 02/04/19
 * @name Main.java
 * <p>Clase principal del programa la cual permite observar la lista de los pacientes en orden de prioridad </p>
 * */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        PriorityQueue<Paciente> queue = new PriorityQueue<Paciente> ();
        Scanner scan = new Scanner(System.in);
        VectorHeap<Paciente> heap= new VectorHeap<Paciente>();
        
        String nombre=" ";
        String sintoma=" ";
        String prioridad=" ";
        String pos2=" ";
        int pos1=0;
        String p="";
        String s="";
        int op=0;
        
      String pacientes= null;
      FileReader fileReader = new FileReader("pacientes.txt");
      BufferedReader doc = new BufferedReader(fileReader);  
      while((pacientes = doc.readLine()) != null) {
      
      
        nombre= pacientes.substring(0, pos1=pacientes.indexOf(","));
        p=pacientes.replaceFirst(nombre, " ");
        s=p.replaceFirst(",", " ");
        sintoma=p.substring(p.indexOf(" ")+3, s.indexOf(",") );
        pos2=pacientes.replaceFirst(",", "");
        prioridad=pacientes.substring(pos2.indexOf(",")+2,pacientes.length());
        Paciente pacient= new Paciente();
        pacient.setNombre(nombre);
        pacient.setSintoma(sintoma);
        pacient.setPrioridad(prioridad);
        heap.add(pacient);
        queue.add(pacient);
        
      }
     
       System.out.println ("-----------------------------------------------------------------");
       System.out.println ("Bienvenido al sistema de emergencias del Hospital");
       System.out.println ("Ingrese la opcion que desea realizar");
       System.out.println ("1. Ordenar pacientes utilizando la interfaz Priority Queue");
       System.out.println ("2. Ordenar pacientes utilizando la interfaz Priority Queue implementada por JFC");
       System.out.println ("3. Indicar que el paciente con mayor prioridad ha sido atendido");
       System.out.println ("4. Salir");
       op=scan.nextInt();
       scan.nextLine();
       while(op!=4){
       if (op==1){
           System.out.println (heap.toString());
       }
       else if (op==2){
           System.out.println (queue.toString());
       }
       else if(op==3){
           heap.remove();
           System.out.println (heap.toString());
       }
       System.out.println ("Ingrese de que manera desea ordenar la prioridad de emergencia");
       System.out.println ("1. Utilizando la interfaz Priority Queue");
       System.out.println ("2. Utilizando la interfaz Priority Queue implementada por JFC");
       System.out.println ("3. Indicar que el paciente con mayor prioridad ha sido atendido");
       System.out.println ("4. Salir");
       op=scan.nextInt();
       scan.nextLine();
       }
      
    
      
    }
    
}
