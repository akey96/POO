package listas.interfaces;

import java.util.Iterator;



public interface IList<E>
{

  /**
   * @return returns el numero de elementos en la lista
   */
  public int size();

  /**
   * @return true si la lista no tiene elementos
   */
  public boolean isEmpty();


  /**
   * vacia la lista
   */
  public void clear();


  /**
   * value se añade al inicio de la lista
   * @param value
   */
  public void addFirst(E value);


  /**
   * value se añade al final de la lista
   * @param value
   */
  public void addLast(E value);


  /**
   * @return el primer valor de la lista
   */
  public E getFirst();

  /**
   * @return el ultimo valor de la lista
   */
  public E getLast();


  /**
   * borra el primer valor de la lista
   * @return el elemento eliminado
   */
  public E removeFirst();


  /**
   *  elimina el ultimo valor de la lista
   * @return el ultimo valor
   */
  public E removeLast();

  /**
   * elimina el elemento que coincide con value y lo devuelve
   * @param value: el elemento a eliminar
   * @return el elemento eliminado
   */
  public E remove(E value);

  /**
   * se añade value a la cola de la lista
   * @param value
   */
  public void add(E value);

  /**
   * Elimina el ultimo elemento de la lista
   * @return el elemento eliminado
   */
  public E remove();

  /**
   * @return el ultimo elemento de la lista
   */
  public E get();

  /**
   * busca el elemento proporcionado en la lista
   * @param value: el elemento a buscar
   * @return true si lo encuentra, false en caso contrario
   */
  public boolean contains(E value);


  /**
   * @param value el valor a buscar en la lista
   * @return int La posicion del valor que se buscaba
   */
  public int indexOf(E value);

  /**
   * Devuelve la ultima posicion del elemento buscado
   * @param value el elemento a buscar la posicion
   * @return la posicion del elemento encontrado o -1 si no se encontro
   */
  public int lastIndexOf(E value);


  /**
   * Obtiene el elemento que est� en la posici�n i
   * @param i: La posici�n del elemento
   * @return el elemento encontrado en la posici�n i
   */
  public E get(int i);
  // pre: 0 <= i < size()
  // post: returns object found at that location

  /**
   * Modifica el valor del elemento que esta en la posicion i con el valor o
   * @param i: posicion del elemento
   * @param o: nuevo valor del elemento
   * @return el elemento en posicion i antes de modificarlo.
   */
  public E set(int i, E o);


  /**
   * Adiciona un elemento en la posicion i
   * @param i posicion donde estara el elemento
   * @param o valor del elemento
   */
  public void add(int i, E o);


  /**
   * Elimina el elemento en la posici�n i
   * @param i: posici�n del elemento
   * @return el elemento eliminado
   */
  public E remove(int i);


  /**
   * @return un iterador
   */
  public Iterator<E> iterator();


}
