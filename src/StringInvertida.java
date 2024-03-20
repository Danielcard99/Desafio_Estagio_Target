public class StringInvertida {

  public static void main(String[] args) {
    String nome = "TargetSistemas";

    String nomeInvertido = "";
    for (int i = nome.length() - 1; i >= 0; i--) {
      nomeInvertido = nomeInvertido + nome.charAt(i);
    }
    System.out.println(nomeInvertido);
  }
}
