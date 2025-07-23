package SyokyuReview;

public class Student {
/*
  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return name + ":　" + score + "点";
  }
}
 */

  // ↓　フィールドと呼ぶ　（「クラスの中でメソッドの外」で宣言された変数のこと）
  private String name;
  private int score;
  // privateを書いたのは、外部からの必要な操作が出来て、情報も守られるようにする。
  // このようにprivateにしてもgetter/setterを使用することで、必要な操作をすることができる

  /* ↓　コンストラクタと呼ぶ
   　コンストラクタというのは「最初に一度だけ呼ばれる特別なメソッド」という性質がある。
   と、最初検索したときに出てきて難しく考えてしまったが、落ち着けば大丈夫！
   　１，コンストラクタは「新しいオブジェクトを作るための”最初の作業”」である。
   　２，一度カードが出来上がったら、そのカードは「もう完成」なので、再y祖の作業（コンストラクタ）
   　　はもう必要なくなる
   　３，もし新しいカードを作るなら、また最初の作業（コンストラクタ）が発生する
   ※「newでオブジェクトを作るときに、コンストラクタが呼ばれて初期化される」ことを覚えておくこと */
  public Student(String name, int score) {
    this.name = name;
    this.score = score;
    /*
    this.name　は「書き込むための場所（欄）」が確保されている
    name　は「今もらった情報」
    this.name = name;　は「その場所に情報を書き込む」
    ↓　　↓
    学生カードを作るイメージ
    this.name は「カードの”名前”欄」という場所が用意されている状態
        →　Studentクラスしか書いていない時は、空っぽの状態である
    name は「今渡された情報」
    　つまり、
    「このカードの”名前”欄に、今もらった”名前”を書きます」
    「このカードの”点数”欄に、今もらった”点数”を書きます」　という感じ。  */
  }

  // getterメソッドと呼ぶ
  // getter = getScore() 値を取得するためのメソッド
  // これがないと、クラスを書いてオブジェクトを作っても、中身を外から直接見ることができない
  // フィールドをprivateにしていることが多いから、getterをpublicで用意しないといけない
  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  // setterメソッドと呼ぶ
  // setter = setScore(int score) 値を設定・変更するためのメソッド
  // 「値を変更する」必要があるもののみ設定しておく
  // 「外部から受け取った値を、オブジェクトのフィールドに書き込む（セットする）」ためのもの
  public void setScore(int score) {
    this.score = score;
  }

  // オーバーライド（Override）と呼ぶ
  // 「親クラス（今回はObjectクラス）のメソッドを上書きしてますよ」という宣言
  @Override
  // toString()メソッドというもの
  // 「そのオブジェクトを文字列に変換して返す」ためのもの
  public String toString() {
    return name + "： " + score + "点";
  }
  /*
   ・@Overrideを宣言することで、書きかえることができる。
   ・Overrideしないと、クラス名@ハッシュ値というのが出力されてしまう
   */

}
