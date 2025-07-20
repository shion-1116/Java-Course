package org.example;
  // 子クラス（継承クラス）（Meatを継承） SpecialMeatと書いてあった
public class Cooking extends Meat {
  public String cookingStyle;

  public Cooking(String name, String origin, String cookingStyle) {
    super(name, origin);
    this.cookingStyle = cookingStyle;
  }

  @Override
  public void eat() {
    System.out.println(origin + "産の" + name + "を" + cookingStyle + "でいただきます。");
  }

  public void specialInfo() {
    System.out.println("特別な調理法" + cookingStyle);
  }
}
  /*
  public class Cooking extends Meat {
    ポイント：extendsは「このクラスは○○の特徴を受け継ぎます」という宣言
            => Cooking（調理）」というクラスを作成し、Meat（肉）クラスを継承（extends）している
            これにより、CookingクラスはMeatクラスが持つフィールド（name、origin）やメソッドをそのまま引き継ぎつつ、独自の機能や情報（cookingStyleやspecialInfo）を追加出来る

  public String cookingStyle;
    注意：publicを使うこと自体はJavaの文法として「問題ない」。が、設計上の観点から考えると、アクセス修飾子の選択には注意が必要
         →　将来的に「cookingStyleを変更するときに何か特別な処理をしたい」と思っても、直接書き換えられてしまうと制御できない
         →　学習段階はここまで考えなくてもいいが、privateやprotectedにして、必要ならgetter/setterメソッドを使うのがオブジェクト指向設計の基本
    ポイント：「調理方法」を表すフィールド
    例：焼く、煮る、蒸す、揚げる、ローストなど。

  public Cooking(String name, String origin, String cookingStyle) {
    ポイント：publicなコンストラクタ
            Cookingオブジェクトを作るときに、「肉の名前」「産地」「調理法」を指定して初期化できる

  super(name, origin);
    ポイント：親クラス（Meat）のコンストラクタを呼び出し、nameとoriginを初期化している
            これにより、Meatクラスで定義された初期化処理を再利用できる。

  this.cookingStyle = cookingStyle;
    ポイント：Cookingクラス独自のフィールドcookingStyleに、引数で受け取った値をセットする
  }

  @Override
  public void eat() {
    ポイント：Meatクラスで定義されているeat()メソッドをオーバーライド（上書き）している

  System.out.println(origin + "産の" + name + "を" + cookingStyle + "でいただきます。");
  } ポイント：「○○産の○○を○○でいただきます。」という、調理法まで含めたより具体的な食べ方を表示する。
    例：北海道産の牛肉をローストでいただきます。

  public void specialInfo() {
    ポイント：Cookingクラス独自のメソッド

  System.out.println("特別な調理法" + cookingStyle);
  } ポイント：「特別な調理法○○」という情報を表示します。
    例：特別な調理法ロースト
   */


  // 下記動画と同じようにやろうと思ったやつ
  // いつかこのやり方でもできるようになりたいと思って取っておいてみる
  /*
  public class cooking {
    public String eat(String eat) {
      return "今日は「" + eat + "」が食べたいです。";
    }
  }
   */
