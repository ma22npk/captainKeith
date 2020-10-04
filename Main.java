import java.util.Scanner;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("おい、貴様。貴様は何者だ!!");
    String name = scanner.next();
    System.out.println("そうか!　バカみてぇな名前だな！希望年収はいくらだ!?");
    int hopePrice = scanner.nextInt();
    if (hopePrice > 4000000) {
      System.out.println("貴様の心臓は右にあるのか?" + name + "? 業界の相場をちゃんと調査してきたのか?");
      System.out.println("不採用");
    } else {
      System.out.println(name + "!なぜ未経験からエンジニアを目指そうと思った!?");
      String reason = scanner.next();
      String taboo = "マナブ";
      if (taboo.contains("マナブ")) {
        System.out.println("そいつは素晴らしいな！貴様はインフルエンサーのエサにでもなってもらおう！");
        System.out.println("不採用");
      } else {
        System.out.println("あなたの体重");
        double weight = scanner.nextDouble();
        System.out.println(name + "!貴様を採用するメリットはなんだ！？");
        // System.out.println("あなたの年齢は" + age + "歳です");
        System.out.println("あなたの体重は" + weight + "kgです");

      }

    }

  }
}
