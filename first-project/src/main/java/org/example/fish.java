package org.example;
  // 子クラス
class Fish implements Eating {
    protected String name;
    protected String sea;

    public Fish(String name, String sea) {
      this.name = name;
      this.sea = sea;
    }

    @Override
    public void eat() {
      System.out.println(sea + "の" + name + "を刺身で食べます。");
    }

    @Override
    public void displayFood() {
      System.out.println("魚の種類：　" + name + "（" + sea + "）");
    }
}
  /*    meatの時とやっているのは変わらない。簡単に説明を書いておく。
  class Fish implements Eating {
    説明：Fish（魚）というクラスを作成し、Eatingインターフェースを実装している。
         これにより、FishクラスはEatingで定められたeat()とdisplayFood()の2つのメソッドを必ず持つことになる。

  protected String name;
    説明：protected修飾子を使い、Fishクラスとそのサブクラス、同じパッケージ内の他のクラスからアクセスできる「魚の名前」を表すフィールド
    例：サーモン、マグロ、アジなど。

  protected String sea;
    説明：こちらもprotected修飾子で、「魚が獲れた海や場所」を表すフィールド
    例：オホーツク海、瀬戸内海、日本海など。

  public Fish(String name, String sea) {
    説明：publicなコンストラクタ
         Fishオブジェクトを作るときに、「魚の名前」と「獲れた海」を必ず指定して初期化できるようになっている
    例：new Fish("サーモン", "オホーツク海")のように使う

  this.name = name;
  this.sea = sea;
  説明：thisキーワードを使って、引数で受け取った値をフィールドにセットしている
  }

  @Override
  public void eat() {
    説明：Eatingインターフェースで約束されたeat()メソッドの実装

  System.out.println(sea + "の" + name + "を刺身で食べます。");
    説明：「○○の○○を刺身で食べます。」と表示する
    例：オホーツク海のサーモンを刺身で食べます。
  }

  @Override
  public void displayFood() {
    説明：Eatingインターフェースで約束されたdisplayFood()メソッドの実装

  System.out.println("魚の種類：　" + name + "（" + sea + "）");
    説明：魚の種類と獲れた海を分かりやすく表示するためにある
    例：魚の種類：　サーモン（オホーツク海）
  }
  */

