package ReviewMeimei_12;

public class User {

  /* 最終的にコードはこのような形になる
  private String userName;
  private int userAge;
  private String userHobby;
  private String userGender;

  public User(String userName, int userAge, String userHobby, String userGender) {
    this.userName = userName;
    this.userAge = userAge;
    this.userHobby = userHobby;
    this.userGender = userGender;
  }

  public String getUserName() {
    return userName;
  }

  public int getUserAge() {
    return userAge;
  }

  public String getUserHobby() {
    return userHobby;
  }

  public String getUserGender() {
    return userGender;
  }

  @Override
  public String toString() {
    return "名前: " + userName + ", 年齢: " + userAge + ", 趣味: " + userHobby + ", 性別: " + userGender;
  }

 */

  private String userName;
  private int userAge;
  private String userHobby;
  private String userGender;
  /*  ※問題文的なお話で言うと、
public class User {
  String userName;
  int userAge;
  String userHobby;
  String userGender;
  // ↑　これは、各人の情報を保存するためのフィールド（変数）が用意されている。
}
このコードだけでも最低限の要件は満たせている。
　↓満たせているけど、コードの続きがあるのは、
この後に、コンストラクタとgetterをしているのはコードを読みやすくし、ミスが減らせるから。（単純にコードが短くなるから読みやすくなるし、値のセットし忘れを防ぐことができる）
   */

  public User(String userName, int userAge, String userHobby, String userGender) {
    /*  コンストラクタをしている。
public User(String userName, int userAge, String userHobby, String UserGender)
これはコンストラクタをしている。これをすることにより、
User user1 = new User();
user1.name = "山田太郎";
user1.age = 25;
user1.hobby = "読書";
user1.gender = "男性";
User user2 = new User();
user2.name = "花山花子";
user2.age = 25;
user2.hobby = "料理";
user2.gender = "女性";
このように定義する必要がなくなり、
　↓　
User user1 = new User("山田太郎", 25, "読書", "男性");
User user2 = new User("花山花子", 25, "料理", "女性");
と、最終的に各コードの量をするなくすることができる。　*/
    this.userName = userName;
    this.userAge = userAge;
    this.userHobby = userHobby;
    this.userGender = userGender;
    /*
    this.userName = userName;
    this.userAge = userAge;
    this.userHobby = userHobby;
    this.userGender = userGender;
    　↑　ここで何をやっているか
    「this.userName」はUserクラスのフィールド（情報）= 「userName」はコンストラクタの引数（外から渡された値）
    同じ「userName」を使っているから、どっちがどっちか分からなくなってしまうのを防ぐためにthisを使っている。
    thisがついている方が、「今いるクラスから作られた“自分自身のオブジェクト（インスタンス）」を指すキーワードである。
     */
  }

  public String getUserName() {
    return userName;
  }

  public int getUserAge() {
    return userAge;
  }

  public String getUserHobby() {
    return userHobby;
  }

  public String getUserGender() {
    return userGender;
  }
  /*  なぜgetterメソッドを使っているか
  フィールドをprivateにしている場合、直接アクセスができないため、値を取り出すための「窓口」としてgetterメソッドを用意している。
  　→　外部から取得するためにはgetterメソッドが必要である。
  ＜getterメソッドの基本の形＞
  public 型 getフィールド名() {
    return フィールド名;
  }
   */

  @Override
  public String toString() {
    return "名前: " + userName + ", 年齢: " + userAge + ", 趣味: " + userHobby + ", 性別: "
        + userGender;
  }
  /*　きれいに出力したいのであれば、toString
  オブジェクトをきれいに出力させたい場合、toStringメソッドをOverrideしておけばきれいに出力される
  ここでtoStringしていないと
  【名前で検索：山田太郎】
  ReviewMeimei_12.User@2f92e0f4
  このように出力されてしまう。
   */

}

