package SyokyuReview;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StudentManager {
  /*
  // 学生リスト（全学生を管理）
  private final List<Student> students = new ArrayList<>();

  // 学生の追加
  public void addStudent(Scanner scanner) {
    System.out.println("学生の名前を入力してください：　");
    String name = scanner.nextLine().trim();
    if (name.isEmpty()) {
      System.out.print("名前を入力してください：　");
      return;
    }
    System.out.print(name + "の点数を入力してください：　");
    int score;
    try {
      score = scanner.nextInt();
      scanner.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("点数は整数で入力してください");
      scanner.nextLine();
      return;
    }
    students.add(new Student(name, score));
    System.out.println(name + "を追加しました");
  }

  // 学生の削除
  public void deleteStudent(Scanner scanner) {
    if (students.isEmpty()) {
      System.out.println("学生が追加されていません");
      return;
    }
    System.out.println("削除する学生の名前を入力してください");
    String name = scanner.nextLine().trim();
    if (name.isEmpty()) {
      System.out.println("名前を入力してください");
      return;
    }
    // 名前が一致する学生をリストから削除
    boolean removed = students.removeIf(s -> s.getName().equals(name));
    System.out.println(removed ? name + "を削除しました" : "該当する学生が見つかりません");
  }

  // 学生の点数を更新
  public void updateScore(Scanner scanner) {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません");
      return;
    }
    System.out.println("点数を更新する学生の名前を入力してください");
    String name = scanner.nextLine().trim();
    if (name.isEmpty()) {
      System.out.println("点数を更新する学生の名前を入力してください");
      return;
    }
    // 名前が一致する学生を検索
    Optional<Student> studentOpt = students.stream()
        .filter(s -> s.getName().equals(name))
        .findFirst();
    if (studentOpt.isEmpty()) {
      System.out.println("該当する学生が見つかりません");
      return;
    }
    System.out.println(name + "の新しい点数を入力してください：　");
    int newScore;
    try {
      newScore = scanner.nextInt();
      scanner.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("点数は整数で入力してください");
      scanner.nextLine();
      return;
    }
    // 点数の更新
    studentOpt.get().setScore(newScore);
    System.out.println(name + "の点数を更新しました");
  }

  // 全学生の平均点を表示
  public void printAverage() {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません");
      return;
    }
    // 平均点を計算
    double avg = students.stream()
        .mapToInt(Student::getScore)
        .average()
        .orElse(0.0);
    System.out.printf("平均点：　%.1f点%n", avg);
  }

  // 全学生の情報を表示
  public void printAllStudents() {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません");
      return;
    }
    System.out.println("学生一覧：　");
    // 全ての学生情報を表示
    for (Student s : students) {
      System.out.println(s);
    }
  }
   */


  // final　一度だけ中身を入れられるリスト（再代入は出来ない）
  // うっかり間違えて変えてしまうのを防ぐためにある　（中身の追加・削除はOK）
  private final List<Student> students = new ArrayList<>();

  public void addStudent(Scanner scanner) {
    System.out.print("学生の名前を入力してください：　");
    String name = scanner.nextLine().trim();
    /* .nextLine()、.next()、.trim()　とは？
    .nextLine()、.next()、.trim()全て空白の全角半角関係なく実行される
    .nextLine()は、Enterキーまでのすべての文字列を1つの文字列として読み取る
    　→　「　山田　太郎　」と入力した場合、「　山田　太郎　」と全体を一つの文字列として取得する
    .trim()は、取得した文字列の先頭と末尾の空白や改行、タブなどを削除する
    　→　「　山田　太郎　」と入力した場合、「山田　太郎」という文字列が所得される
    　→　文字列の間「山田　太郎」の空白はそのまま残る
    .next()は、空白（スペースやタブ）で区切られた一単語分だけを読み取る
    　→　「山田　太郎　」と入力した場合、「山田」だけを習得し、次で「太郎」を取得する　　*/
    if (name.isEmpty()) {
      // .isEmpty()とは、その文字列が「空文字列」かどうかを調べるためのもの
      // 空文字列（""）ならtrue、1文字でも中身があればfalse（半角スペースや全角スペースだけでも「空文字列」ではない）
      // nameが空かどうかを見ている
      System.out.println("名前を入力してください。");
      return;
      // このreturnは、「これ以上このメソッドの中の処理を進めません」という合図。
    }
    System.out.print(name + "の点数を入力してください。");
    int score;  // ただの宣言
    try {
      score = scanner.nextInt();    // 初期化の式
      scanner.nextLine();
      /*　↑　↑
      score = scanner.nextInt(); これでユーザーが整数を入力　→Enterを押す。
      Enterを押さないと入力終了しないのに、Enterを押したことにより無駄な改行が出来てしまった。
      その無駄な改行を消すためにscanner.nextLine();をしないといけない。 */
    } catch (InputMismatchException e) {
      System.out.println("点数は整数で入力してください。");
      scanner.nextLine();
      return;
      /*　↑　↑
      「Enterを押したことで残る改行」や「間違った入力」を、scanner.nextLine();でしっかり消化して、
      次の入力時に影響が出ないようにし、return;でメソッドを終了し、それ以上の処理を行わないようにしている。
       */
    }
    students.add(new Student(name, score));
    // 新しくStudentオブジェクト（名前と点数が入っている）を作成して、それをstudentsという変数名のListに追加している。
    System.out.println(name + "を追加しました。");
  }

  public void deleteStudent(Scanner scanner) {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません。");
      return;
    }
    System.out.print("削除るする学生の名前を入力してください：　");
    String name = scanner.nextLine().trim();
    if (name.isEmpty()) {
      System.out.println("名前を入力してください。");
      return;
    }
    boolean removed = students.removeIf(s -> s.getName().equals(name));
    /*  ポイントをまとめてみた
    ・students = Student型のリスト　　沢山のStudentオブジェクトが入っている
    ・removeIf = リストの中から「条件に合うもの」をまとめて削除するメソッド
        条件があったものが一つでも削除されたらtrue、何も削除されなかったらfalseを返す
    ・s -> s.getName().equals(name) = ラムダ式
        s はstudentsリストから一人ずつ取り出されるStudentオブジェクト
    ↓　　↓
    １，studentsリストの中身（Studentオブジェクト）を一人ずつ s として取り出す
    ２，その、s.getName()　（その生徒の名前）が入力されたnameと一致するかを調べる
    ３，一致したら、そのStudentオブジェクトをリストから削除
    ４，ひとりでも削除できたらremoved は true、誰も削除できなければ false
    ↑　↑　※　ちょっと書く量増えるけどfor文でも行ける  */
    System.out.println(removed ? name + "を削除しました。" : "該当する学生が見つかりません。");
  }

  public void updateScore(Scanner scanner) {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません。");
      return;
    }
    System.out.print("点数を更新する学生の名前を入力してください：　");
    String name = scanner.nextLine().trim();
    if (name.isEmpty()) {
      System.out.println("名前を入力してください。");
      return;
    }
    Optional<Student> studentOpt = students.stream()
        .filter(s -> s.getName().equals(name))
        .findFirst();
    // Optionalは「値があるかもしれないし、無いかもしれない」という特別な入れ物
    // .filter(s -> s.getName().equals(name))　名前が一致するStudentだけを絞り込むという意味
    //    →　s（1人のStudent）の名前が、入力されたnameと同じか　という条件
    // .findFirst()　絞り込んだ中で最初の一つだけを取り出す
    if (studentOpt.isEmpty()) {
      System.out.println("該当する学生が見つかりません。");
      return;
    }
    System.out.print(name + "の新しい点数を入力してください：　");
    int newScore;
    try {
      newScore = scanner.nextInt();
      scanner.nextLine();
    } catch (InputMismatchException e) {
      System.out.println("点数は整数で入力してください");
      scanner.nextLine();
      return;
    }
    studentOpt.get().setScore(newScore);
    System.out.println(name + "の点数を更新しました。");
  }

  public void printAverage() {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません。");
      return;
    }
    // ↓　studentsリストの全員の点数の平均を計算して、もし学生が一人もいなければ平均点を0.0にする。をやる
    double avg = students.stream()
        .mapToInt(Student::getScore)
        // ↑ 各StudentからgetScore()で点数だけを取り出し、「点数だけの流れ（int型のストリーム）」にする
        .average()
        // ↑ その点数たちの平均値を計算
        .orElse(0.0);
    // ↑ 学生が一人もいなかった場合（リストが空）、平均値派計算できません。
    // そんな時は0.0を返す
    System.out.printf("平均点：　%.2f", avg);
  }

  public void printAllStudents() {
    if (students.isEmpty()) {
      System.out.println("学生が登録されていません。");
      return;
    }
    System.out.println("学生一覧：");
    for (Student studentList : students) {
      System.out.println(studentList);
    }
  }

}
