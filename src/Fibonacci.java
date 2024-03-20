import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
      "Digite um número para verificarmos se ele faz parte da sequência de Fibonacci:"
    );
    int num = scanner.nextInt();

    int fibo1 = 0;
    int fibo2 = 1;

    while (fibo1 < num) {
      fibo2 = fibo2 + fibo1;
      fibo1 = fibo2 - fibo1;
    }

    if (num == 00 || num == 1) {
      System.out.println("O número faz parte da sequência de Fibonacci!");
    } else if (num == fibo1) {
      System.out.println("O número faz parte da sequência de Fibonacci!");
    } else {
      System.out.println("O número não faz parte da sequência de Fibonacci!");
    }

    scanner.close();
  }
}
