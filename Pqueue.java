/**
 * @author Jennifer Sandoval,Esteban del Valle
 * @Carne 18962,18221
 * @date 02/04/19
 * @name PriorityQueue.java
 * <p>Interfaz que permite realizar la prioridad de elementos </p>
 * */
public interface Pqueue<E extends Comparable<E>>
{

    /**
     *
     * @return retorna un valor de tipo generico el cual es el primero 
     */
    public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
    /**
     *
     * @return retorna un valor de tipo generico el cual fue el eliminado
     */
    public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
    /**
     *
     * @param value, de tipo generico. Se ingresa el valor que desea agregarse
     */
    public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
    /**
     *
     * @return devuelve un valor booleano para verificar si se encuentra vacio o no
     */
    public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
    /**
     *
     * @return devuelve un valor de tipo int el cual es el tamaño 
     */
    public int size();
	// post: returns number of elements within queue
	
    /**
     *
     */
    public void clear();
	// post: removes all elements from queue
}
