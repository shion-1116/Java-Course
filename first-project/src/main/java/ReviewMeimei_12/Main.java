package ReviewMeimei_12;

import java.util.List;

/*  問題文
  ・「マッチングアプリ管理システム」を作成する。
  ・ユーザー（User）クラスを管理する情報（名前、年齢、趣味、性別）を持つオブジェクト（クラス）
  を作って、そこに情報を格納する。
  ・マッチングアプリ（MatchingApp）クラスを作り、UserをListで持つようにする。
  ・mainメソッドからこのMatchingAppクラスに対して検索ができるようにする。
  MatchingAppクラスはユーザー検索の機能を持つ。
  ・名前検索、年齢検索、趣味検索、性別検査のメソッドをMatchingAppに持たせる。
  ・それをmainメソッドから実行して、実行結果をコンソールに出力する。
 */
public class Main {

  public static void main(String[] args) {
    // マッチングアプリのインスタンスを作成
    MatchingApp app = new MatchingApp();

    // ユーザーを追加
    app.addUser(new User("山田太郎", 25, "読書", "男性"));
    app.addUser(new User("佐藤花子", 22, "映画", "女性"));
    app.addUser(new User("田中一郎", 25, "スポーツ", "男性"));
    app.addUser(new User("鈴木さくら", 30, "読書", "女性"));

    // 名前で検索
    System.out.println("【名前で検索：山田太郎】");
    printUsers(app.searchByName("山田太郎"));

    // 年齢で検索
    System.out.println("【年齢で検索：25歳】");
    printUsers(app.searchByAge(25));

    // 趣味で検索
    System.out.println("【趣味で検索：読書】");
    printUsers(app.searchByHobby("読書"));

    // 性別で検索
    System.out.println("【性別で検索：女性】");
    printUsers(app.searchByGender("女性"));
  }

  // ユーザーリストを出力する補助メソッド
  private static void printUsers(List<User> users) {
    if (users.isEmpty()) {
      System.out.println("該当するユーザーはいません。");
    } else {
      for (User user : users) {
        System.out.println(user);
      }
    }
    System.out.println("--------------------");
  }
}
