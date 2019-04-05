
import java.util.Vector;

/**
 * @author Jennifer Sandoval,Esteban del Valle
 * @Carne 18962,18221
 * @date 02/04/19
 * @name VectorHeap.java
 * <p>Clase que permite manejar una cola por medio de un heap, implementando la interfaz de priority queue </p>
 * */
public class VectorHeap<E extends Comparable<E>> implements Pqueue<E>
{

    /**
     * Atributo de tipo vector, el cual contiene los pacientes ingresados
     */
    private Vector<E> data; // the data, kept in heap order

    @Override
    public String toString() {
        return "VectorHeap{" + "data=" + data + '}';
    }

    public Vector<E> getData() {
        return data;
    }

    public void setData(Vector<E> data) {
        this.data = data;
    }

    /**
     * Constructor de la clase
     */
    public VectorHeap()
	// post: constructs a new priority queue
	{
		data = new Vector<E>();
	}

    /**
     *
     * @param v, de tipo Vector. En este vector se encuentran todos los pacientes
     */
    public VectorHeap(Vector<E> v)
	// post: constructs a new priority queue from an unordered vector
	{
		int i;
		data = new Vector<E>(v.size()); // we know ultimate size
		for (i = 0; i < v.size(); i++)
		{ // add elements to heap
			add(v.get(i));
		}
	}

    /**
     *
     * @param i, valor de tipo int que indica la posicion
     * @return devuelve un valor de tipo numerico que indica la posicion
     */
    protected static int parent(int i)
	// pre: 0 <= i < size
	// post: returns parent of node at location i
	{
		return (i-1)/2;
	}

    /**
     *
     * @param i, valor de tipo int de la posicion actual
     * @return devuelve un valor de tipo int que se refiere a la posicion del hijo izquierdo desde la posicion ingresada
     */
    protected static int left(int i)
	// pre: 0 <= i < size
	// post: returns index of left child of node at location i
	{
		return 2*i+1;
	}

    /**
     *
     * @param i, valor de tipo int de la posicion actual
     * @return devuelve un valor de tipo int que se refiere a la posicion del hijo derecho desde la posicion ingresada 
     */
    protected static int right(int i)
	// pre: 0 <= i < size
	// post: returns index of right child of node at location i
	{
		return (2*i+1) + 1;
	}

    /**
     *
     * @param leaf, de tipo int, hace referencia a la posicion de la hoja
     */
    protected void percolateUp(int leaf)
	// pre: 0 <= leaf < size
	// post: moves node at index leaf up to appropriate position
	{
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 &&
		(value.compareTo(data.get(parent)) < 0))
		{
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf,value);
	}

    /**
     *
     * @param value, de tipo generico y hace referencia al valor que es ingresado para agregar en el heap
     */
    public void add(E value)
	// pre: value is non-null comparable
	// post: value is added to priority queue
	{
		data.add(value);
		percolateUp(data.size()-1);
	}

    /**
     *
     * @param root, de tipo int, hace referencia a la posicion de la raiz
     */
    protected void pushDownRoot(int root)
	// pre: 0 <= root < size
	// post: moves node at index root down
	// to appropriate position in subtree
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			// Assert: childpos indexes smaller of two children
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; // keep moving down
			} else { // found right location
				data.set(root,value);
				return;
			}
			} else { // at a leaf! insert and halt
				data.set(root,value);
				return;
			}
		}
	}

    /**
     *
     * @return devuelve el valor obtenido el cual fue removido del heap
     */
    public E remove()
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	{
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
	}

    /**
     *
     * @return
     */
    @Override
    public E getFirst() {
       return data.get(0);
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     *
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}