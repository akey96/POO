package listas.simple;
import java.util.Iterator;

public class ListIterator<E> implements Iterator<E> {

  Node<E> current;

  // initialize pointer to head of the list for iteration
  public ListIterator(SinglyLinkedList<E> list)
  {
    current = list.getHead();
  }

  // returns false if next element does not exist
  public boolean hasNext()
  {
    return current != null;
  }

  // return current data and update pointer
  public E next()
  {
    E data = current.value();
    current = current.next();
    return data;
  }

  // implement if needed
  public void remove()
  {
    throw new UnsupportedOperationException();
  }

}
