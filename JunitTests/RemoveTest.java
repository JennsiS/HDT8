import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveTest {

	@Test
	public void test() {
		VectorHeap heap = new VectorHeap();
		VectorHeap test = new VectorHeap();
		Paciente pacient= new Paciente();
        pacient.setNombre("Diego");
        pacient.setSintoma("Dolor");
        pacient.setPrioridad("A");
        heap.add(pacient);
        Comparable output = heap.remove();
        assertEquals(output, pacient);
	}

}
