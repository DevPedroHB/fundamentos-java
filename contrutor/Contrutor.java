package contrutor;

public class Contrutor {
  private int numero;

  public Contrutor(int numero) {
    this.numero = numero;
  }

  public Contrutor(int numero, String texto) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }
}
