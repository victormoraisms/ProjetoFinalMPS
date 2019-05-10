
package main;


public class App {

  
  public static void main(String[] args) {

    TorreDosMagosProxy proxy = new TorreDosMagosProxy(new TorreNegra());
    proxy.entra(new Mago("Mago vermelho"));
    proxy.entra(new Mago("Mago branco"));
    proxy.entra(new Mago("Mago negro"));
    proxy.entra(new Mago("Mago verde"));
    proxy.entra(new Mago("Mago azul"));

  }
}
