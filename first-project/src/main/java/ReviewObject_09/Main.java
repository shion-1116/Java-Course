package ReviewObject_09;

public class Main {

  public static void main(String[] args) {
    /* 自分で考えたストーリー
    ＜導入＞　ある村にとても美しい女の子が居ました。
    ある日、その女の子はお父さんから、「そろそろ結婚をしないか？」と聞かれました。
    ①　その女の子はなかなか相手を見つけられなかったので、「私とお付き合いしてくれる人は、この項目を書いてください」とルールブック（インターフェース）を作成しました。
    ②　実際に作成して提出してくれたのは、A君・B君・C君（実装クラス（各クラス））の３人である。
    　　※　今回の課題では、実装クラスは２つでよかったのだが、AIがコンストラクタも理解していた方が良い！と言っていたので、
    　　　　継承している（A）クラス・継承していない（B)クラスとは別に、コンストラクタ（C)を作成している。
    ③-1　A君はルールブックとは別に、実際にあった時に困らないようにするために、みんなからなんと呼ばれているか（継承）も教えてくれた。
    ③-2　C君は女の子が先に知っておきたいであろう情報をインターフェースとは別（コンストラクタ）に教えてくれた。
    ④　②と③を踏まえてそれぞれの人と会ってみる（インスタンス）ことにした。
     */
    System.out.println("A君の情報");
    AkunNewInformation a = new AkunNewInformation();
    a.name();
    a.values();
    a.income();
    a.height();
    a.nickName();

    System.out.println();
    System.out.println("B君の情報");
    Bkun b = new Bkun();
    b.name();
    b.values();
    b.income();
    b.height();

    System.out.println();
    System.out.println("C君の情報");
    // ↓　C君がインターフェースとは別で教えてくれた情報
    Ckun c = new Ckun(28, 30);
    c.name();
    c.values();
    c.income();
    c.height();
    c.ckunAge();
    c.ckunAgeLimit();
  }

}

    /* もう一つ作ってみた！
    ①　テストの情報を書いていく（必ず書いてほしいもの　→　１，前回のテストの点数　２，次のテスト日　３，次の目標点）
    　　　「共通の契約」= interface
    ②　各教科を作る　= 実装クラス
    ③　数学のテスト日の訂正が入った。　= コンストラクタ
    ④　後日、先生が「今回、必ず漢字20点分出すよ！」と教えてくれた。　= 継承
    ⑤　出力できるようにする　= インスタンス
     */