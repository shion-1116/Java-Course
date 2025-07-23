package org.example;
  // 実装クラス１:Meat
class Meat implements Eating {
  protected String name;
  protected String origin;

  public Meat(String name, String origin) {
    this.name = name;
    this.origin = origin;
  }

  @Override
  public void eat() {
    System.out.println(origin + "産の" + name + "を焼いて食べます。");
  }
  @Override
  public void displayFood() {
    System.out.println("肉の種類：　" + name + "（" + origin + "産）");
  }
}
  /*
  class Meat implements Eating {
    意味：Meat（肉）というクラスを作成し、Eatingインターフェースを実装している
    ポイント：MeatクラスはEatingで定められたeat()とdisplayFood()の2つのメソッドを必ず持つことになる

  protected String name;    ← これがフィールド（メンバ変数）
    意味：protected修飾子を使い、Meatクラスとそのサブクラス、および同じパッケージ内の他のクラスからアクセスできる「肉の名前」を表すフィールドを宣言している
         例　→　牛肉、豚肉、鶏肉など。

  protected String origin;  ← これもフィールド
    意味：こっちもprotected修飾子で、「肉の産地」を表すフィールド
         例　→　北海道、鹿児島など。

  public Meat(String name, String origin) {
    意味：publicなコンストラクタ
         このクラスのインスタンス（オブジェクト）を作るときに、必ず「肉の名前」と「産地」を指定して初期化できるようになっている
         例　→　new Meat("牛肉", "北海道")のように使う

  this.name = name;
  this.origin = origin;
    意味：特に「this」について
         「今まさに使われているオブジェクト自身」を指し示す特別なキーワード
         this.nameは「このオブジェクトが持っているフィールド（メンバ変数）のname」を意味している
         name（右側）は「コンストラクタの引数として受け取ったname」
    ポイント：フィールド名（name）と引数名（name）が同じなので、区別するためにthisを使う
            もしthisを付けずにname = name;と書くと、どちらも引数のnameを指してしまい、フィールドの値は変わらない
            ↓　フィールド（= メンバ変数）のフィールドって何？
             意味：　「フィールド（メンバ変数）」とは、クラスの中で定義される変数のこと
             詳しい説明：フィールド（メンバ変数）は、クラスの直下（メソッドの外側）で宣言される変数
                       そのクラスで作られたオブジェクトごとに値を持つ
                       例えば、Meatクラスのnameやoriginがフィールド
                       コンストラクタやメソッドの中ではなく、クラスの直下に書かれている
    ※　ここで分からない単語はスプレットシートにまとめてあるはずなのでまずはそこを見てみること
  }

  @Override
  public void eat() {
    意味：Eatingインターフェースで約束されたeat()メソッドの実装

    System.out.println(origin + "産の" + name + "を焼いて食べます。");
  }   意味：「産地」と「肉の名前」を使って、「○○産の○○を焼いて食べます。」と表示
      例　→　北海道産の牛肉を焼いて食べます。

  @Override
  public void displayFood() {
    意味：Eatingインターフェースで約束されたdisplayFood()メソッドの実装

    System.out.println("肉の種類：　" + name + "（" + origin + "産）");
  }   意味：肉の種類と産地を分かりやすく表示する
      例　→　肉の種類：　牛肉（北海道産）
   */


  // 下記は動画と同じようにやろうとしてやってみたけど、訳が分からず途中であきらめたやつ
  /*
  public class meat {
  public String eat(String eat) {
    return eat + "です。";
  }
  */
