import java.util.Scanner;

public class StringInvertida {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite uma Palavra:");
    String nome = scanner.nextLine();

    String nomeInvertido = "";
    for (int i = nome.length() - 1; i >= 0; i--) {
      nomeInvertido = nomeInvertido + nome.charAt(i);
    }
    System.out.println(nomeInvertido);
    scanner.close();
  }
}
