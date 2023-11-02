package wrapper;

public class Wrapper {
  public static void main(String[] args) {
    int tipoInt = 1;
    float tipoFloat = 1.0f;
    boolean tipoBoolean = false;

    // int - char
    Float tipoFloat2 = 2.0f;
    Boolean tipoBoolean2 = false;
    Integer tipoInteger = 2;


    System.out.println(tipoFloat2.equals(tipoFloat));
    System.out.println(tipoBoolean2.equals(tipoBoolean));
    System.out.println(tipoInteger.equals(tipoInt));
  }
}
