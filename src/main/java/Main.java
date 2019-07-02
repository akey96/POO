import listas.simple.SinglyLinkedList;
import listas.simple.Node;

public class Main {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();

        lista.addLast(3);
        lista.addLast(5);
        lista.addLast(1);
        lista.addLast(3);
        lista.addLast(4);


        for (Integer u: lista) {
          System.out.println(u);
        }


    }
}