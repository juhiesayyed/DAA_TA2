import java.util.Collection;

public interface TreeSetOperation<E extends Comparable<E>> {

    //Adds the specified element to this set if it is not already present.
    TreeSetOperation<E> add(E data);

    //Adds all of the elements in the specified collection to this set.
    TreeSetOperation<E> addAll(Collection<? extends E> c);

    public void rootValue();


    //Returns true if this set contains the specified element.
    boolean contains(E data);

    //Returns true if this set contains no elements.
	boolean isEmpty();

    
    //Returns an iterator over the elements in this set in ascending order.
    void iterator();


    //Removes the specified element from this set if it is present.
    void remove(E data);
    
    E getMax();

    E getMin();

} 
