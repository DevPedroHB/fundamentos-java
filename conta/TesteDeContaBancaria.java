package conta;

public class TesteDeContaBancaria {
  public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria();

    conta.setNumero("1234");
    conta.setTitular("Jhon Doe");

    conta.depositar(50);
    conta.sacar(25);
  }
}
