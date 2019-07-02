package figuras.classes;

import figuras.abstracts.Figura;
import figuras.interfaces.Dibujable;

public class Circulo extends Figura implements Dibujable {
  private  double radio;
  public Circulo (double x, double y, double radio) {
    super(x,y);
    this.radio = radio;
  }

  public double area() {
    return Math.PI*radio*radio;
  }


  public void dibujar() {
    System.out.println("Estoy rotando siendo dibujado");
  }

}
