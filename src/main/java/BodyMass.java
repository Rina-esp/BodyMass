import java.util.Scanner;

public class BodyMass {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите Ваше имя: ");
    String a = scan.next();

    System.out.print("Введите Ваш вес в кг: ");
    double b = scan.nextDouble();

    System.out.print("Введите Ваш рост в метрах:");
    double c = scan.nextDouble();

    double res = b / (c * 2);

    System.out.println(a + " Ваш ИМТ: " + Math.floor(res));
  }

}
