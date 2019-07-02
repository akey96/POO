package figuras.classes;
import figuras.abstracts.Figura;
import figuras.interfaces.*;

public class Cuadrado extends Figura implements Dibujable, Rotable {

  private  double lado;

  public Cuadrado (double x, double y, double lado) {
    super(x,y);
    this.lado = lado;
  }

  public double area() {
    return lado*lado;
  }

  public void rotar(double grados) {
    System.out.println("Estoy rotando "+grados+" grados");
  }

  public void dibujar() {
    System.out.println("Estoy rotando siendo dibujado");
  }

}
