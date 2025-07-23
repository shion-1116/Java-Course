package SyokyuReview;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    /*  各問題は下記の条件を満たすこと
    ・コードフォーマット（環境設定で行ったもの）
    ・命名規則に従った名前付け（安直な名前付けや間違った名前を付けない
    ・コード前文と動作結果の共有
    ・値の入力を受け付けるには「Scannerクラス」を使うこと
    ・例外処理は可能な範囲で実装（空文字や想定していない値の入力時など）    */

/*  問題１
Javaの基本構文を使用して、簡単な計算機プログラムを作成してください。
加減乗除の四則演算ができ、ユーザーから入力を受け取り、結果を表示するものとします。 */
    Scanner scanner = new Scanner(System.in);
//    double firstNumber = 0;
//    double secondNumber = 0;
//    String operator = "";
//    boolean validInput = false;
//    double result = 0;
//
//    while (!validInput) {
//      System.out.println("1番目の数字を入力してください：");
//      try {
//        firstNumber = scanner.nextDouble();
//        validInput = true;
//      } catch (InputMismatchException e) {
//        System.out.println("エラー：入力が間違っています");
//        scanner.next();
//      }
//    }
//
//    validInput = false;
//    while (!validInput) {
//      System.out.println("演算子を入力してください（+, -, *, /）：");
//      operator = scanner.next();
//      if (operator.matches("[+\\-*/]")) {
//        validInput = true;
//      } else {
//        System.out.println("エラー；入力が間違っています");
//      }
//    }
//
//    validInput = false;
//    while (!validInput) {
//      System.out.println("2番目の数字を入力してください");
//      try {
//        secondNumber = scanner.nextDouble();
//        if (operator.equals("/") && secondNumber == 0) {
//          System.out.println("0で割りことができません");
//        } else {
//          validInput = true;
//        }
//      } catch (InputMismatchException e) {
//        System.out.println("エラー：入力が間違っています");
//        scanner.next();
//      }
//    }
//
//    switch (operator) {
//      case "+":
//        result = firstNumber + secondNumber;
//        break;
//      case "-":
//        result = firstNumber - secondNumber;
//        break;
//      case "*":
//        result = firstNumber * secondNumber;
//        break;
//      case "/":
//        result = firstNumber / secondNumber;
//        break;
//    }
//
//    System.out.println(
//        "計算結果：" + firstNumber + " " + operator + " " + secondNumber + " = " + result);


/*  問題２
配列とリストまたはStreamAPIを使用して、学生の名前と点数を管理するプログラムを作成してください。
名前の追加、削除、点数の更新、平均点の計算ができるようにしてください。
処理をループさせるにはWhile文を使って実行してください。  */
//    StudentManager manager = new StudentManager();
//
//    while (true) {
//      System.out.println("\n1. 学生を追加");
//      System.out.println("2. 学生を削除");
//      System.out.println("3. 点数を更新");
//      System.out.println("4. 平均点を計算");
//      System.out.println("5. 全生徒の情報を表示");
//      System.out.println("6. 終了");
//      System.out.print("選択してください：　");
//      String input = scanner.nextLine().trim();
//
//      switch (input) {
//        case "1" -> manager.addStudent(scanner);
//        case "2" -> manager.deleteStudent(scanner);
//        case "3" -> manager.updateScore(scanner);
//        case "4" -> manager.printAverage();
//        case "5" -> manager.printAllStudents();
//        case "6" -> {
//          System.out.println("プログラムを終了します");
//          scanner.close();
//          return;
//        }
//        default -> System.out.println("１～６の数字を入力してください");
//      }
//
//    }

    /*  問題３
    正規表現を使用して、ハイフン付きの国内携帯電話番号の有効性チェックするプログラムを作成してください。
    有効な携帯電話番号の条件を自分で定義し、その条件に合致するかどうかを判定してください。  */
    System.out.println("携帯電話番号を入力してください。\n「 - (ハイフン)」を一緒に入力してください。");
    String phone = scanner.nextLine().trim();

    if (phone.isEmpty()) {
      System.out.println("電話番号を入力してください。");
      scanner.close();
      return;
    }

    String phoneNumber = "^(070|080|090)-\\d{4}-\\d{4}$";
    if (phone.matches(phoneNumber)) {
      System.out.println(phoneNumber + "　は有効な電話番号です。");
    } else {
      System.out.println(phoneNumber + "　は無効な電話番号です。");
    }
    scanner.close();
  }
}
