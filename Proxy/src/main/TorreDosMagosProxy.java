
package main;


public class TorreDosMagosProxy implements TorreDosMagos {


  private static final int NUMERO_DE_MAGOS_PERMITIDOS = 3;

  private int numMagos;

  private final TorreDosMagos torre;

  public TorreDosMagosProxy(TorreDosMagos torre) {
    this.torre = torre;
  }

  @Override
  public void entra(Mago mago) {
    if (numMagos < NUMERO_DE_MAGOS_PERMITIDOS) {
      torre.entra(mago);
      numMagos++;
    } else {
      System.out.println(mago + " nao pode entrar!");
    }
  }
}
