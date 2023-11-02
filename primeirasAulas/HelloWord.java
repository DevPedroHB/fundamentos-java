package primeirasAulas;
/**
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 * HelloWord = Nome da minha classe
 */
public class HelloWord {
  // Todo conteúdo deverá ser colocado aqui dentro
  public static void main(String[] args){
    /**
     * Numeros (int, double, float, long)
     * Textos (String)
     * Booleanos (boolean)
     */
    int dadoDoTipoInt = 10;
    double dadoDoTipoDouble = 3.14;
    float dadoDoTipoFloat = 3.14f;
    long dadoDoTipoLong = 98765432123456789l;
    String dadoDoTipoString = "Colocar o meu texto.";
    boolean dadoDoTipoBoolean = true;

    System.out.println(dadoDoTipoInt + dadoDoTipoDouble + dadoDoTipoFloat + dadoDoTipoLong + dadoDoTipoString + dadoDoTipoBoolean);

    // if - else
    System.out.println("<== IF, ELSE ==>");
    if (dadoDoTipoInt == 10){
      // sysout
      System.out.println("Entrou no if do 10.");
    } else if (dadoDoTipoInt == 12) {
      System.out.println("Entrou no if do 12.");
    } else {
      System.out.println("Entrou no else.");
    }

    // While (Enquanto algo for verdadeiro, faça alguma coisa)
    System.out.println("<== WHILE ==>");
    int valorInicial = 0;

    while (valorInicial < 3) {
      System.out.println(valorInicial + " é menor que 3.");

      valorInicial++;
    }

    // For
    System.out.println("<== FOR ==>");
    for (int i = 0; i < 4; i++) {
      System.out.println("O valor do i é: " + i);
    }
  }
}
// Fora do escopo da classe
