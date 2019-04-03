
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nombre=" ";
        String sintoma=" ";
        String prioridad=" ";
        int pos2=0;
        int pos1=0;
        String pacientes= null;
      FileReader fileReader = new FileReader("pacientes.txt");
      BufferedReader doc = new BufferedReader(fileReader);  
      while((pacientes = doc.readLine()) != null) {
      
      
      nombre= pacientes.substring(0, pos1=pacientes.indexOf(","));
      sintoma=pacientes.substring(pos1+1,pos2=pacientes.indexOf(",") );
      prioridad=pacientes.substring(pos2,pacientes.indexOf(" "));
      }
    }
    
}
