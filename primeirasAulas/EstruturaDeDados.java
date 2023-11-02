package primeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
  public static void main(String[] args) {
    // Lista
    List<String> nomes = new ArrayList<>();

    nomes.add("Pedro");
    nomes.add("Isabella");
    nomes.add("Piter");

    System.out.println("<== GET ==>");
    System.out.println(nomes.get(1));

    System.out.println("<== FOR ==>");
    for (String nome : nomes) {
      System.out.println("O nome é: " + nome);
    }

    System.out.println("<== FOREACH ==>");
    nomes.forEach(nome -> System.out.println("O nome é: " + nome));
    System.out.println("<== FOREACH RESUMIDO ==>");
    nomes.forEach(System.out::println);
  }
}
