package ReviewMeimei_12;

import java.util.ArrayList;
import java.util.List;

public class MatchingApp {

  /*  最終的にこのようになる
  private List<User> users;

  public MatchingApp() {
    this.users = new ArrayList<>();
  }

  public void addUser(User user) {
    users.add(user);
  }

  // 名前で検索
  public List<User> searchByName(String name) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserName().equals(name)) {
        result.add(user);
      }
    }
    return result;
  }

  // 年齢で検索
  public List<User> searchByAge(int age) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserAge() == age) {
        result.add(user);
      }
    }
    return result;
  }

  // 趣味で検索
  public List<User> searchByHobby(String hobby) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserHobby().equals(hobby)) {
        result.add(user);
      }
    }
    return result;
  }

  // 性別で検索
  public List<User> searchByGender(String gender) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserGender().equals(gender)) {
        result.add(user);
      }
    }
    return result;
  }
  */

  private List<User> users;
  // ユーザーのリストを作成
  // <User>は、自分で作成したUserクラスのことを指している。
  // 複数のユーザー情報をまとめて管理するためにListにしている。

  public MatchingApp() {
    this.users = new ArrayList<>();
    // これが、「コンストラクタ」
    // MatchingAppのインスタンスを作るときに、usersリストをからのリストとして初期化していく。
    // インスタンスごとに独立したユーザーリストを持つため、コンストラクタで初期化が必要となる。
    // これがないとusersリストがnullのままになり、エラーの原因になる。
    // MatchingApp()と書いてあるのを見て、何かにマッチしたら代入するのかと思っていたが、自分が最初に書いたコードだった
  }

  public void addUser(User user) {
    users.add(user);
    // ユーザー(Userオブジェクト)をアプリのユーザーリストに追加している
    // addUseはただのメソッド名なので、難しく考えない
    // 追加したいユーザー情報を受け取る。（引数（パラメータ）としてUser型のuserを1つ受け取っている）ということ
  }

  // 名前で検索
  public List<User> searchByName(String name) {
    // 難しく考えないで！searchByNameもnameもただの名前。searchByName=メソッド名、name=引数名
    List<User> result = new ArrayList<>();
    // resultという名前のUser型のListを作成して、どれに新しく情報を入れていって！と言っている
    for (User user : users) {
      // usersリストの中に入っているUser型のオブジェクトを、1つずつ順番に取り出して、userという変数に入れる
      if (user.getUserName().equals(name)) {
        result.add(user);
      }
    }
    return result;
  }

  // 年齢で検索
  public List<User> searchByAge(int age) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserAge() == age) {
        result.add(user);
      }
    }
    return result;
  }

  // 趣味で検索
  public List<User> searchByHobby(String hobby) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserHobby().equals(hobby)) {
        result.add(user);
      }
    }
    return result;
  }

  // 性別で検索
  public List<User> searchByGender(String gender) {
    List<User> result = new ArrayList<>();
    for (User user : users) {
      if (user.getUserGender().equals(gender)) {
        result.add(user);
      }
    }
    return result;
  }
}

