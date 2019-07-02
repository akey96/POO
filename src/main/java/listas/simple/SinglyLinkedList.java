package listas.simple;
import java.util.Iterator;
import listas.interfaces.IList;
import listas.simple.ListIterator;

public class SinglyLinkedList<E> implements IList<E>, Iterable<E>
{
  protected int count;
  protected Node<E> head;



  public SinglyLinkedList() {
    this.head = null;
    this.count = 0;
  }

  public Node<E> getHead() {
    return head;
  }

  @Override
  public int size() {
    return count;
  }

  @Override
  public boolean isEmpty() {
    return count==0;
  }

  @Override
  public void clear() {
    this.count = 0;
    this.head = null;
  }

  @Override
  public void addFirst(E data){
    this.head = new Node<E>(data, this.head);
    this.count++;

  }

  @Override
  public void addLast(E value) {

    Node<E> newNode = new Node<E>(value, null); //creates the new node
    if (this.head != null){
      Node<E> finger = this.head;
      while (finger.next() != null){
        finger = finger.next();
      }
      finger.setNext(newNode);
    }
    else {
      this.head = newNode;
    }
    this.count++;

  }

  @Override
  public E getFirst() {
    return head.value();
  }

  @Override
  public E getLast() {
    if (this.head != null){
      Node<E> finger = this.head;
      while (finger.next() != null){
        finger = finger.next();
      }
      return (E) finger.value();
    }else{
      return null;
    }

  }

  @Override
  public E removeFirst() {

    Node<E> temp = this.head;
    this.head = this.head.next();
    count--;
    return temp.value();
  }

  @Override
  public E removeLast() {
    Node<E> finger = this.head;
    Node<E> previous = null;

    while (finger.next() != null){
      previous = finger;
      finger = finger.next();
    }

    previous.setNext(null);
    this.count--;
    return finger.value();
  }

  @Override
  public E remove(E value) {

    Node<E> finger = head;
    Node<E> previous = null;

    while (finger.next() != null && !finger.value().equals(value)){
      previous = finger;
      finger = finger.next();
    }

    System.out.println("valor "+finger);
    if (finger != null){
      if (previous == null){
        head = finger.next();
      }
      else{
        previous.setNext(finger.next());
      }
      count--;
      return finger.value();
    } else {
      return null; //didn't find it
    }

  }

  @Override
  public void add(E value) {
    Node<E> newNode = new Node<E>(value, null); //creates the new node
    if (this.head != null){
      Node<E> finger = this.head;
      while (finger.next() != null){
        finger = finger.next();
      }
      finger.setNext(newNode);
    }
    else {
      this.head = newNode;
    }
    this.count++;
  }

  @Override
  public E remove() {

    Node<E> finger = this.head;
    Node<E> previous = null;

    while (finger.next() != null){
      previous = finger;
      finger = finger.next();
    }

    previous.setNext(null);
    this.count--;
    return finger.value();
  }

  @Override
  public E get() {
    if (this.head != null){

      Node<E> finger = this.head;
      while (finger.next() != null){
        finger = finger.next();
      }
      return (E) finger.value();

    }else{
      return null;
    }
  }

  @Override
  public boolean contains(E value) {

    Node<E> finger = head;
    while (finger != null && !finger.value().equals(value))
      finger = finger.next();
    return finger != null;
  }


  @Override
  public int indexOf(E value) {
    int indexOF = 0;
    Node<E> finger = head;

    while (finger !=null)
    {
      if (finger.value().equals(value))
      {
        return indexOF;
      }

      indexOF++;
      finger = finger.next();
    }
    return -1;
  }


  @Override
  public int lastIndexOf(E value) {
    int indexOf = -1;
    int cont = 0;
    Node<E> finger = head;

    while (finger !=null)
    {
      if (finger.value().equals(value))
      {
        indexOf = cont;
      }

      cont++;
      finger = finger.next();
    }
    return indexOf;
  }

  @Override
  public E get(int i) {

    if(i<0 || i>=this.count){
      throw new NullPointerException();
    }

    if (this.head != null ){
      int cont=0;

      Node<E> finger = this.head;
      while (finger.next() != null && cont!=i){

        finger = finger.next();
        cont++;
      }
      return (E) finger.value();

    }else{
      return null;
    }
  }

  @Override
  public E set(int i, E o) {

    if(i<0 || i>=this.count){
      throw new NullPointerException();
    }

    if (this.head != null ){
      int cont=0;

      Node<E> finger = this.head;
      while (finger.next() != null && cont!=i){

        finger = finger.next();
        cont++;
      }
      finger.setValue(o);
      return (E) finger.value();

    }else{
      return null;
    }
  }

  @Override
  public void add(int i, E data) {

    if(i<0 || i>=this.count){
      throw new NullPointerException();
    }

    Node<E> finger = this.head;
    Node<E> previous = null;
    int cont=0;

    while (cont!=i){
      previous = finger;
      finger = finger.next();
      cont++;
    }

    previous.setNext(new Node<E>(data, finger));
    this.count++;


  }

  @Override
  public E remove(int i) {
    if(i<0 || i>=this.count){
      throw new NullPointerException();
    }

    Node<E> finger = this.head;
    Node<E> previous = null;
    int cont=0;

    while (cont!=i){
      previous = finger;
      finger = finger.next();
      cont++;
    }

    previous.setNext(finger.next());
    this.count--;
    return finger.value();
  }

  @Override
  public Iterator<E> iterator() {

    return new ListIterator<E>(this);
  }

  @Override
  public String toString() {
    Node<E> finger = head;
    String cadena = "";
    if(finger != null) {
      while (finger.next() != null){
        cadena += finger.value()+" ";
        finger = finger.next();
      }
      cadena += finger.value()+" ";
    }

    return cadena;
  }



}
