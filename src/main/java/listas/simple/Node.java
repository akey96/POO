package listas.simple;


public class Node<E> {

  protected E data;
  protected Node<E> nextElement;

  public Node(E data, Node<E> nextElement) {
    this.data = data;
    this.nextElement = nextElement;
  }

  public Node(E data) {
    this(data,null);
  }

  public Node<E> next() {
    return this.nextElement;
  }

  public void setNext(Node<E> nextElement) {
    this.nextElement = nextElement;
  }

  public E value() {
    return this.data;
  }

  public void setValue(E data) {
    this.data = data;
  }
}