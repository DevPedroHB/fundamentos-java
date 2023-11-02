package primeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
  public static void main(String[] args) {
    Map<String, Integer> notas = new HashMap<>();

    notas.put("Pedro", 9);
    notas.put("Isabella", 6);
    notas.put("Piter", 3);

    System.out.println("<== GET ==>");
    var nota = notas.get("Isabella");
    System.out.println(nota);

    System.out.println("<== FOR ==>");
    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é " + key + " e o valor é " + value);
    }
  }
}
