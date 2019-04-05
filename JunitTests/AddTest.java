import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

public class AddTest {

	@Test
	public void test() {
		VectorHeap heap = new VectorHeap();
		Paciente pacient= new Paciente();
        pacient.setNombre("Diego");
        pacient.setSintoma("Dolor");
        pacient.setPrioridad("A");
        heap.add(pacient);
 
	}

}
