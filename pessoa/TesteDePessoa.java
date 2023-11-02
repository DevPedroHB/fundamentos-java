package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    // Pessoa
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Jhon Doe");
    pessoa.setIdade(21);;
    pessoa.setCpf("000.000.000-00");

    System.out.println(pessoa.imprimirDadosDaPessoa());

    // Professor
    Professor professor = new Professor();

    professor.setNome("Jhon Doe");
    professor.setIdade(21);;
    professor.setCpf("000.000.000-00");
    professor.setSalario(50000);

    System.out.println(professor.imprimirDadosDaPessoa());

    // Aluno
    Aluno aluno = new Aluno();

    aluno.setNome("Jhon Doe");
    aluno.setIdade(21);;
    aluno.setCpf("000.000.000-00");
    aluno.setMatricula("30022");

    System.out.println(aluno.imprimirDadosDaPessoa());
  }
}
