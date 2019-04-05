
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
        
        String nombre=" ";
        String sintoma=" ";
        String prioridad=" ";
        String pos2=" ";
        int pos1=0;
        String p="";
        String s="";
        String op=" ";
        
        String pacientes= null;
      FileReader fileReader = new FileReader("C:\\Users\\bff_n_000\\Desktop\\pacientes.txt");
      BufferedReader doc = new BufferedReader(fileReader);  
      while((pacientes = doc.readLine()) != null) {
      
      
      nombre= pacientes.substring(0, pos1=pacientes.indexOf(","));
      p=pacientes.replaceFirst(nombre, " ");
      s=p.replaceFirst(",", " ");
      sintoma=p.substring(p.indexOf(" ")+3, s.indexOf(",") );
      pos2=pacientes.replaceFirst(",", "");
      prioridad=pacientes.substring(pos2.indexOf(",")+2,pacientes.length());
      //System.out.println (sintoma);
       System.out.println ("-----------------------------------------------------------------");
       System.out.println ("Bienvenido al sistema de emergencias del Hospital");
       System.out.println ("Ingrese de que manera desea ordenar la prioridad de emergencia");
       System.out.println ("1. Utilizando la interfaz Priority Queue");
       System.out.println ("2. Utilizando la interfaz Priority Queue implementada por JFC");
       op=scan.nextLine();
       if (op.equals ("1")){
           
       }
       else if (op.equals("2")){
       }
     
      }
    }
    
}
