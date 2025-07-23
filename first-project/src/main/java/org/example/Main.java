package org.example;

import java.util.List;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  private static List<String> studentList;

  public static void main(String[] args) {
        /*　＜これから先コードを書いていくのに必要になるであろうショートカットキー・情報＞
        ・履歴を戻すことができる
            → Windowsは「Ctrl　＋　Z」を同時押しで戻すことができる
        ・コードは同じ名前を着けてしまうとコンパイルエラーというものが出てきてしまう
        ・プログラムのコードの中身を見ることができる
            → Windowsは「Ctrl　＋　B」を同時押して中身を見ることができる
        ・「.length()」　文字列の長さを教えて
        ・ループ処理して！と言われたら　→　for文、拡張for文のことを言っている
         */

//        // 課題　04_変数と値の取り扱い
//        // 文字列結合と数値計算結果の統合をして
//        // 自分の名前　＋　自分の年齢　＋　歳です。が出力されるようにする。
//        String name = "星川詩音";
//        int age = 10 + 11;
//        System.out.println(name + "は、" + age + "歳です。");
    /*　詳しい解説
    String name = "星川詩音";
    　→　「String型でnameという変数名を付けて、文字列を入力している」
    　→  宣言と代入（初期化）を一行で書いたもの
          String name;  // 変数の宣言
          name = "星川詩音";  // 変数への値の代入（初期化）

    int age = 10 + 11;
    　→　「int型でageという変数名を付けて、整数を入力している」
    　→　これも、一行で書いたもの（分解すると↓のようになる）
          int age;
          age = 10 + 11;
    　→　ここで 10 + 11 の計算結果（21）がageに代入される
    System.out.println(name + "は、" + age + "歳です。");
    　→　変数nameとageの値を使って「ホシカワシオンは、21歳です。」と出力される。
     */

        /*
        変数とは何か？　→　中身が変わるものという認識
        ・String greeting; →　greetingでなくてもOK！
        ・String name = "江並公史";  09:30～
        文字列に対して定義することができる　1:45～
        （任意で着けることができるが、（学習中はそこまで気にしなくてもいいけど）名前を付けるのはデリケートな作業だと思ってほしい　→　メンテナンスのしやすさがだいぶ違う）
        ・int型　整数　09:50～
        ・String型　文字列
        ・double型　小数点まで出せる

        11:00～　プログラムは読むことのほうが書くことより圧倒的に多い
            →　他の人に読んでもらうときに分かりやすく書けるようになる！というのが目標
            →　12:55～　何が起こるかを想像しながらプログラミングを書くと成長が早くなる（出来なかったらなぜかを考えたら成長が早くなる）（ちょっとしたコツ）

        12:30～
        int型で　+　をすると足し算をしてくれる   ※整数値型のため小数は出来ない
        int number1 = 5;
        int number2 = 10;
        System.out.println(number1 + number2);  これを表示させると15となる

        ・String型で　+　をすると文字列結合をする
        String number3 = "5";
        String number4 = "10";
        System.out.println(number3 + number4);  これを表示させると510となる

        ・double型を使って（小数点第一位を）四捨五入したい！となったら　19:10～
        double num5 = 5;
        double num6 = 10;
        System.out.println(Math.round(num5 / num6));
        これを表示させると1となる
        　※　他にも色々な計算の仕方があるよ（中央値とか平均とかを計算したい！とか、調べてみたらなんでも出てくる）

        ちなみに、
        System.out.println(num5 + num6);  //足し算
        System.out.println(num5 - num6);  //引き算
        System.out.println(num5 * num6);  //掛け算
        System.out.println(num5 / num6);  //割り算（あまりを出さない　整数部分のみ）
        System.out.println(num5 % num6);  //割り算（あまりのみ）

        変数の値の中身は途中で変えることができる　22:30～
        double number7 = 5;
        double number8 = 10;
        System.out.println(number7 +number8 + (number8 * number7));

        number7 = 10;       このように中身を変えることができる
        number8 = 100;
        System.out.println(number7 - number8);
        System.out.println(number7 * number8);
        System.out.println(number7 / number8);
        System.out.println(number7 % number8);

        number9 + number10 をしたのを number9 に代入することができる　24:10～
        double number9 = 5;
        double number10 = 10;
        System.out.println(number9 + number10);
        // ↑　↓　これらを出力すると同じ数字が出てくる
        double sum = number9 + number10;    // 「一次変数で受けとる」と言ったりする。今回の一次変数は「sum」
        System.out.println(sum);

        number9 = sum;  // さっき習った中身を変えて、
        System.out.println(sum + number10);  //その後足すことも出来る
         */

//         //課題　05_基本型_標準API_分岐処理
//         //課題①　条件式を使った課題
//         //文字列型を使って、変数を２つ用意する。その変数には苗字と名前を入れてください。
//         //条件は苗字の文字数が２文字以上の場合　かつ　名前の文字数が２文字以上の場合はtrue。
//         //条件がtrueの場合はその名前を表示する。
//         //条件がfalseの場合は条件に一致しませんでした。という文言を表示する。
//        String name1 = "星川";  // 文字列型を使って苗字を用意
//        String name2 = "詩音";  // 文字列型を使って名前を用意
//        if (name1.length() >= 2 && name2.length() >= 2) {   // name1が何文字か調べて、２文字以上だった場合　かつ　name2が何文字か調べて、２文字以上だった場合
//            System.out.println(name1 + name2);   // 上記の条件に当てはまっていたら、その名前を表示する
//        } else {   // それ以外の場合は
//            System.out.println("条件に一致しませんでした。");   // こっちを表示させる
//        }
//
//        // 課題②　日付を使って、本日の日付が２５日だった場合、本日は締め日です。と表示させる
//        LocalDateTime today = LocalDateTime.now();
//        if (today.getDayOfMonth() == 25){
//            System.out.println("本日は締め日です");
//        } else {
//            System.out.println("今日は普通に働く日です");
//        }
          /*　このコードを詳しく説明
          // ①今の日付・時間を取得する
          LocalDateTime today = LocalDateTime.now();
          　→　 LocalDateTime型で、todayという名前の変数（箱）を作り、その中にLocalDateTime.now()で取得した、
          　→ 「現在の日付と時刻」を代入している。※「シンボルが解決できません」とエラーが出て来たら「import文」がない時だと思われる

          // ②で、今日が〇日だったら...と続ける。
          if (today.getDayOfMonth() == 25) {
          　→　今日の日付を取得（確認）してみて、もし今日の日付が25日だった場合、
          　→　（.getDayOfMonth()は、日にちだけを取り出すメソッドということを頭の中に入れておかないと訳が分からなくなる）

            System.out.println("本日は給料日です。");
            　→　「本日は給料日です。」と表示させて

          } else {
          　→　上の条件（今日が25日）に当てはまらなかった場合

            System.out.println("本日は給料日ではありません。");
            　→　本日は給料日ではありません。と表示させる
          }
           */
//        // ↑　↓　どちらでも大丈夫！
//        LocalDate today = LocalDate.now() ;
//        if (today.getDayOfMonth() == 25) {    // ちなみにtoday.getDayOfMonth()は、「today」という日時情報から“日にちの部分だけ”を取り出すメソッド
//            System.out.println("本日は給料日です。");
//        } else {
//            System.out.println("本日は給料日ではありません。");
//        }
    // 課題②と課題③は問題ももちろん違うが、「初期化するかしないか」も肝だと思っている。

//        // 課題③　日付を使って、朝７時になったら起きる時間です。夜２３時過ぎたら睡眠中です。と表示させる
    // ※今回は7時台のように7:00～7:59まではひとくくりになっている。7:00のみ起きる時間です。としたいのならちょっとコードを付け足さないといけない
//        LocalDateTime time = LocalDateTime.now();
//        int hour = time.getHour();
//        if (hour == 7) {
//            System.out.println("起きる時間です。");
//        } else if (hour >= 23){
//          System.out.println("睡眠中です");
//        } else {
//            System.out.println("活動時間です");
//        }
    /*　詳しく説明
    LocalDateTime time = LocalDateTime.now();
    　→　LocalDateTime型の変数（time）を作り、LocalDateTime.now()メソッドで現在の「日付と時刻」を取得し、その値をtimeに代入して

    int hour = time.getHour();
    　→　今回は、時間によって出力してほしい条件が違うため、int型の変数を先に作っている。

    if (hour == 7) {
      System.out.println("起きる時間です");
      　→　もし現在の時間が「7時台（7:00～7:59）」だったら、「起きる時間です」と出力

    } else if (hour >= 23 || hour <= 6) {
      System.out.println("睡眠中です。");
      　→　もし7時台以外で、23時台または0時～6時台の間だった場合、「睡眠中です」と出力

    } else {
      System.out.println("活動時間です");
      　→　今までの条件に当てはまらなければ「活動時間です」と出力させる
    }
     */   // ↑　↓　どちらでも大丈夫！
//        LocalTime time = LocalTime.now();
//        int hour = time.getHour();
//        if (hour == 7) {
//            System.out.println("起きる時間です");
//        } else if (hour >= 23){
//            System.out.println("寝る時間です。");
//        } else {
//            System.out.println("今は" + hour + "時です。");
//        }

        /*　
        ※　if文の連続とは？   健康診断（健康診断の検査項目）みたいな感じ　→　「受付→身体測定→体重→視力→血液...」のように全ての検査を行い、ある検査で異常があっても他の検査を全てやる
        if(){       int a = 12;
        }           if (a > 0) {
        if(){         System.out.println("aは正しいです");
        }           }
        if(){       if (a % 2 == 0) {
        }             System.out.println("aは偶数です");
                    }
                    if (a > 10) {
                      System.out.println("aは10より大きいです");
                    }     これは全て実行される

        ※　上から順に判定されて最初に当てはまったもののみが実行されるようにするには？　→　気温が20度超えたら半袖、20～10度なら長袖、10～0度ならコート、それより寒ければカイロを持ってブーツを履くみたいな感じ
        if() {              int b = 5;
        } else if() {       if (b > 10) {
        } else if() {         System.out.println("bは10より大きい");
        } else {            } else if(b > 5) {
        }                     System.out.println("bは5より大きいが、10以下");
                            } else if(b > 0) {
                              System.out.println("bは0より大きいが、5以下");
                            } else {
                              System.out.println("bは0以下");
                            }     これは、「bは0より大きいが、5以下」と実行（出力）される

        2:30～
        エラーが出てしまうのは自然なこと　エラーの解決数こそ、その人の技術者としての能力となる
        　人間関係で面と向かって「お主のこういうところは正直直した方がいいと思う...やっぱり印象悪いし良くないと思う。ここが治ったらもっと君の良さが伝わると思う！」っていうような人はなかなかいない
        　　→　けど、エラーメッセージはその言いづらいことを教えてくれている。
        エラーメッセージを見るとしんどくなってしまう場合がこれから先あると思うが、理由まで書いて○○が出来ていない。と教えてくれるからそこまで落ち込まないように。
        何だったら↓
        「こいつ言ってくるな！やるな！ここまで自分に言ってくる奴はなかなか居ないわ！」っていうぐらいのスタンスでいると良き

        基本（データ）型　05:45～
        ・String name = "ホシカワシオン";  // 文字列型
        Stringよりも小さい単位がある↓
        ・char a = "あ";  // 文字型　　というのがある。　がプロのエンジニアでもなかなか使わないので記憶から消しても良い！
        ・int number = 12345;　「-」も使えるよ（-12345になる）。これは整数なので小数は使えない。intにも使える範囲がある
            ・byte　　intよりもはるかに小さい。　　-128～127まで
            ・short　　byteより大きくてintより小さい。 -1万～１万ちょいぐらい
                →　byteとshort　はあんまりコードに使っていない　→　今はそんなにデータの大きさを考えなくても良くなったので使わない。昔書いたコードには使われていたりする
        ・long　　銀行とか大きな数字を扱うときに使用する
        ・double num = 100.23;　小数を使いたいときに書く。　「double」は小数を使える範囲の中で一番大きい　イメージとしてはlongと同じぐらい使える
            ・float　　doubleよりも小さい　イメージとしてはintと同じぐらい使える
                →　普段使うのだってfloatでいいんじゃないか？と思うが、そんなに小数を扱うことがない。扱ったとしても結構大きな数字だったりする　→　現場の肌間的にdoubleの方が使ってる

        ※　11:00～　 →　Java固有の物である　〇百兆ではなくて〇京や、計算する値を正確にする（小数点第〇十位～〇百位の１）時のような精密な計算をするときに使う
        BigDecimal number1 = BigDecimal.valueOf(10);
        BigDecimal number2 = BigDecimal.valueOf(100);
        System.out.println(number1 + number2);　はエラーが出てきてしまう（対応していないため）。
        System.out.println(number1.add(number2));　これじゃないといけない。
           →　（設計の話とかになってくる）一番しっかりと計算ができるのになぜ普段使いしないのかというと、なんで「BigDecimal」をわざわざ使ったんだろう？大きい数字を使うのかな？と考える羽目になるから
           ↓　年齢の話をコードに書くときに
           int age = 100;  // と書く。でも年齢って最長であっても120歳とか多くても3桁の数字までしか使わないのにshortじゃなくてintを使う理由は？
           　→　昔のパソコンほど使えるデータ量を制限しなくても良くなったのと、何でここをshortにしたんだろう？というのを考える人的リソースの方が高くついてしまうからintを使うようにしている）

        16:50～　論理型（真偽値）
        ・boolean　これでtrueとfalse（yes、no）をすることができる
        boolean bool;　これだけだと「false」が入っている（デフォルト）
        boolean bool = true;
        boolean bool = false;　

        19:15～　プリミティブ型
        int、double、boolean　とかのこと

        19:40～　ラッパー型（参照型） // 型が持っている機能、nullが使える
        ・integer number1 = 10;
        　→　number1.toString()  これが型が持っている機能
        ・Double number2 = 100.2;
        ・Boolean bool3 = true;

        20:20～　nullのお話
        Javaとか関係なくプログラミングの世界で出てくるが出来れば扱いたくない奴
        String fullName = "";  // 空っぽ
        String fullName1 = null;  // イメージとしては存在していない

        26:50～
        昔のJavaが使っていたが、これから先は使わないで！（下位互換性のために残されているだけ）
            ・Date
            ・Calender
        27:50～　日付を扱うのは、
        ・LocalDate　年・月・日といったカレンダーの日付情報
        ・LocalTime　時間を取得できる
        ・LocalDateTime　自分のPCやサーバー上の日付や時間を使う
        ・zonedDateTime　指定したゾーンの日付や時間を使うことができる（グローバルに使うことができる）
        などがある。じゃあどんな時に使うのかというと、
        ・LocalDateTime date1 = LocalDateTime.naw();  // 自分のPCの日付や時間が表示される
        ・ZonedDateTime date2 = ZonedDateTime.now();  // これだとローカルと同じように表示されてしまうので（例えば）カナダとかアメリカとか自分が表示させたい地域を指定して使用する

        30:50～　条件式
        ①　ifだったらこれを表示して
        if (100 > 10) {
            System.out.println("10は100より大きい")
        }
        ②　&&（かつ） や ||（または）と言ったものがある
        if (100 < 10 || 20 == 20) {
            System.out.println("10は100より大きい")
        }
        ③　ifじゃなかったらelse
        int a = 10;
        int b = 100;
        if (a > b) {
            System.out.println("aはbより大きい");
        } else {
            System.out.println("aはbより小さい");
        }
        ④　ifじゃなかったらelse ifになるけど、else ifでもなかったらelseになるというのもある
        int c = 20;
        if (a > b) {
            System.out.println("aはbより大きい");
        } else if(a > c) {
            System.out.println("aはbより小さくてcより大きい");
        } else {
            System.out.println("aはbより小さくてcよりも小さい");
        }
        ⑤　34:45～　ネストというのがある
        　　→　ネストしないといけない時ももちろんあるが、訳わからなくなるから出来ればやりたくない
        */

//        // 課題 06_繰り返し処理_配列_ListとMap_switch式
//        // 生徒名みたいな文字列のリストを作ってください。
//        // リストの数は10個以上
//        // リストに入っている文字が3文字以上のものを表示する。 → if文は条件分岐だけを行う構文のため「複数の要素を順番に取り出して処理する」ことができないからループ処理が必要になる
//        // このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。
//        List<String> studentList = List.of("佐久間", "佐々木", "山田", "松島", "加藤", "鈴木", "田中", "渡辺", "山本", "中村", "星川");
//        for (String studentName : studentList) {
//            if (studentName.length() >= 3) {
//                System.out.println(StudentName);
//            }
//        }
    /* 詳しい説明
    System.out.println("06_課題①　下に表示されているはず！　");
    List<String> studentList = List.of("佐久間", "佐々木", "山田", "松島", "加藤", "鈴木", "田中",
        "渡辺", "山本", "中村");
    　→　生徒の名前（文字列）が10個入ったリスト（studentList）を作成している

    for (String studentName : studentList) {
      　→　先ほど作成したstudentListの各要素（生徒名）を1つずつ取り出して、studentNameという変数に代入し、ループ処理を行う拡張for文
          　→　今回のように「リストの全要素を1つずつ処理する」場合は拡張for文のほうがオススメ！

      if (studentName.length() >= 3) {
        　→　リストから取り出した生徒名（studentName）の文字数が3文字以上の場合

        System.out.println(studentName);
        　→　その名前を出力
      }
    }
    　→　ふと疑問に思ったSystem.out.println(studentName);はここじゃないといけないのか問題について。
        ↑  ・if文の中に書くと、条件に合ったときだけ出力される。　←　今回はこれをしたかった
           ・if文の外に書くと、すべての名前が出力される。
           ・for文の外に書くと、変数が使えずエラーになる。
     */
//
//        // 課題②
//        // Mapを作ってください。生徒名と番号の組み合わせ（1,"江並"）みたいな。
//        // Mapの要素は10個以上。
//        // Mapの中の番号が偶数のものをMapから削除する。
//        // 上記の処理を行う繰り返し処理を実装してください。
//        // 削除した状態のものを出力してください。
//         ヒント　↓
//            ①「番号」と「名前」をセットで管理する箱を作成
//            ② そのぞれの番号に対応する名前を登録
//            ③ これから消したい番号（偶数の番号）を一時的に入れておくための空の箱（リスト）を作る
//            ④ ループ処理で②に入っているすべての番号（key）を順番に取り出す（Mapに登録されている全てのキーの集合を取得するメソッドを使用する）
//                ⑤ ネストして④が偶数なら③の箱に入れる
//            ⑥ ループ処理で③の中身を使ってMapから該当キーを削除する
//            ⑦ 結果の表示
//        Map<Integer, String> studentNameMap = new HashMap<>();
//        studentNameMap.put(1, "佐久間");
//        studentNameMap.put(2, "佐々木");
//        studentNameMap.put(3, "山田");
//        studentNameMap.put(4, "松島");
//        studentNameMap.put(5, "加藤");
//        studentNameMap.put(6, "鈴木");
//        studentNameMap.put(7, "田中");
//        studentNameMap.put(8, "渡辺");
//        studentNameMap.put(9, "山本");
//        studentNameMap.put(10, "中村");
//
//        List<Integer> removeKeys = new ArrayList<>();
//        for (Integer key : studentNameMap.keySet()) {
//            if (key % 2 == 0){
//                removeKeys.add(key);
//            }
//        }
//        for (Integer key : removeKeys) {
//            studentNameMap.remove(key);
//        }
//        System.out.println(studentNameMap);

    /*    詳しく解説
    Map<Integer, String> studentMap = new HashMap<>();
    　→　「整数（Integer型）」と「文字列（String型）」のペアを格納できるMap（連想配列）を新しく作成し、studentMapという名前で使えるようにしている
          ↑「番号が偶数のもの」と例題に書かれているから「LinkedHashMap」を使うのかと思ったがそういうわけではない。
          ↑ 今回の要件には「順序を保つ」という指定がないから、HashMapで問題ない。（単に「偶数番号の要素を削除」したいだけなら、HashMapでもLinkedHashMapでもどちらでも実装可能）
          ↑ 「スポーツ大会の順位表」や「手順書（マニュアル）」作成、ユーザーの操作履歴の記録など、順位を決めたいときや、手順書を作成する時にLinkedHashMapを使用する

    studentMap.put(1, "佐久間");
    studentMap.put(2, "佐々木");
    studentMap.put(3, "山田");
    studentMap.put(4, "松島");
    studentMap.put(5, "加藤");
    studentMap.put(6, "鈴木");
    studentMap.put(7, "田中");
    studentMap.put(8, "渡辺");
    studentMap.put(9, "山本");
    studentMap.put(10, "中村");
    　→　先ほど作成したstudentMapに対して、1～10の番号とそれぞれの生徒名を追加している。
    　→　また、Map型では要素の追加に.addではなく.put(キー, 値)を使う。

    List<Integer> removeKeys = new ArrayList<>();
    　→　偶数の番号（削除したいキー）を一時的に保存しておくための空のリストを作成している。
    　→　また、new ArrayList<>()で作成することで、後から要素を自由に追加できるようになっている。
        ↑　削除したいキー（ここでは偶数番号）を一時的にリストに集めておき、ループが終わった後でまとめて削除する、JavaのMapを扱う際の一般的な安全策として用いられる

    for (Integer key : studentMap.keySet()) {
      　→　studentMapに登録されているすべてのkey（番号）を順番に取り出すfor文。
      　→　拡張for文でループできるのが1つの型だけ。なのにstudentMapには「番号（キー）」と「名前（値）」のペアが入っている。今回は番号だけを順番に取り出したいので、keySet()でキーだけを取得している。
          ↑ .keySet()は「Mapに登録されている全てのキーの集合を取得するメソッド」

      if (key % 2 == 0) {
        removeKeys.add(key);
        　→　その中で、keyを2で割ったときに余りが0（偶数）の場合は、removeKeysリストに追加していようにしている。
      }
    }

    for (Integer key : removeKeys) {
      　→　removeKeysリストに入っている削除したい番号（偶数）を順番に取り出し、

      studentMap.remove(key);
      　→　その番号をキーとしてstudentMapから該当する生徒を削除
    }

    System.out.println(studentMap);
    　→　偶数の番号が削除された状態のstudentMapの内容（奇数番号の生徒だけが残った状態）を出力
     */

    /* 課題③  AI生成で作った課題
         [65,175,男,田中]、[45,160,女,佐藤]、[80,185,男,鈴木]が格納された文字列型の多次元配列を用意し、
         while文とfor文の両方を同時に使用して次のように全て出力してください。
         「田中君は男性で身長175センチ、体重65キロです！」
         「佐藤さんは女性で身長160センチ、体重は秘密です！」
         「鈴木君は男性で身長185センチ、体重80キロです！」
    System.out.println("06_課題③　")
    String[][] people = {{"65", "175", "男", "田中"}, {"45", "160", "女", "佐藤"},
        {"80", "185", "男", "鈴木"}};
    　→　多次元配列を作成し、その値に入っているのは「体重、身長、性別、名前」である。

    int i = 0;
    　→　iという名前の「整数型変数」を用意。一番最初に初期化したのは、while文で使用したいため

    while (i < people.length) {
      →　while文なので、「ある条件が満たされている間、何度でも同じ処理を繰り返す」
      →　最初のiに入っているのは、0と先ほど宣言している。peopleは、多次元配列に入っている人数。今回のwhileの条件は、配列の最後の人まで繰り返し処理する

      String str = "です！」";
      　→　strは各人物ごとに紹介文を作るための変数。while文の中に書くことで、人が変わるたびに初期化できる。これを外にしてしまうと前回のループで作った文章がさらに足されてしまう。

      for (int j = 0; j < 4; j++) {
        →　jを宣言と共に初期化し、0を代入。最初のjは0で4未満の間は、jを1ずつ足していく。
        →　people[i]の各要素（体重・身長・性別・名前）に順番にアクセスするために使っている。各jの値に応じて、if文で異なる処理を行い、紹介文を組み立てている。

        if (j == 0) {
          →　「jが0のとき」

          if (people[i][2].equals("女")) {
            →　.equals()で文字列の「女」（内容が同じか）を比較

            continue;
            →　for文やwhile文の中で使うと、「その回の残りの処理を飛ばして、次のループに進む」命令。
          }

          str = "キロ" + str;
          　→　男は体重も書かないといけないので、別で書いている。この順番なのは、先に特別条件の女のことをやっておかないと、全員の体重が表示されてしまうため
        }

        --------------------
        if (j == 0) {
          if (people[i][2].equals("女")) {
            continue;
          }
          str = "キロ" + str;
        }　ここのコードを、
        if (j == 0) {
          people[i][2].equals("女");
          continue;
        } else {
          str = "キロ" + str;
        }　このように書き替えることはできるのか？　A,出来ない
        比較しているだけになる。また、continue;をしているのでelse { str = "キロ" + str; }は絶対に実行されなくなってしまう
        --------------------

        if (j == 1) {
          str = (people[i][2].equals("女")) ? "センチ、体重は秘密" + str : "センチ、体重" + str;
        　→　jが1の時だけ実行する。今回は選考演算子の?が使われている。「条件式？真の場合の値：偽の場合の値」が使い方なので、[i][2]が女?（だったら）センチ、体重な秘密+str:（ではなければ）センチ、体重+str書いている
        }

        if (j == 2) {
          str = "性で身長" + str;
        　→　jが2だったら実行し、この行で、「性で身長」という文字列がstrの先頭に追加され、これにより、文章の流れが「○性で身長○センチ…」となるように組み立てられる。
        }

        if (j == 3) {
          str = (people[i][2].equals("女")) ? "さんは" + str : "君は" + str;
        　→　jが3の場合のみ。[i][2]が女?（だったら）さんは、:（ちがったら）君はと書いてある
        }

        str = people[i][j] + str;
        　→　どのif文の条件に当てはまっても当てはまらなくても、毎回この行は実行される。ループが進むごとに、紹介文が後ろから順番に組み立てられていく。
        　→　people[i][j]の値（体重、身長、性別、名前）が順番に紹介文の先頭に追加されていく。名前 → 性別 → 身長 → 体重（または体重は秘密）という順で文章ができあがる。
      }

      str = "「" + str;
      　→　出来上がった今までの文の前に「を付ける

      System.out.println(str);
      　→　今strの中に入っている分を全て出力させていく

      i++;
      　→　１回のwhile文で１人分しかできないから、i++がなければ、ずっと同じ人の情報を処理し続けて無限ループになってしまう。
    }
     */

        /*　プログラミングとは　→　計算や繰り返し処理、条件分岐という機能的なものを組み合わせることによって「人間」がやったら時間がかかってしまうものを自動化することができる
        「1+2+3+4+5+6+7+8+9+10」をやりたいです！となった時にこれを毎回書くのは汎用性がないし、めんどくさい
        　↑　System.out.println(1+2+3+4+5+6+7+8+9+10); ← じゃあこれが10ではなくて、100までだったら？
        繰り返したかったらこれ！
      <for文> 03:00～
        int sum = 0;   // ↓　下で使っているint i = 0はカウンターというらしい　　// i++や、i--、++i,--i　など色々ある
        for(int i = 0; i <= 10; i++) {　　　今は自分で値を入力しているが、外部から入力されたものを代入しようとする場合は「upperNumber」を i <= 10　この10の部分に代入すればOK！（この話は、7:00～）
        (繰り返す元になる値(変数) ; どこまでくるくる回すのか ; 繰り返すたびにiに+1する）
          sum += i;　（これは　sum = sum +i　が省略された形）（0から始まって1+2+3...となっていき10まで回して、出力すると書いてある）
        }           つまり ↓ 「sum + 0 + i」 → 「sum + 1 + i」 → 「sum + 2 + i」...となっている。
        System.out.println(sum);  // 出力すると55になる

             ・while{  // while文
             　}　　という文法があるが、実際の現場では基本使わないためあまり気にしないように

        様々なシステムを作っていくときによく使うのは文字列の連続した要素 07:55～

        配列（その型の連続した物）の基本の形　String型もint型もできる
        ・String[] students = new String[]{};　　これで空っぽの配列になる
        ・int[] students = {1,2,3,4,5,6};

        String[] studentsNames = new String[] {"江並","井上","佐藤","加藤","田中"};　　詳しくは、08:45～
        　→　配列を作った時点でこの配列に追加が出来なくなる（それを固定長という）から、この文字列の追加はとてもめんどくさい。
        　→　だけど、追加したいときは必ず来る。そんな時は、上の変数よりも大きな配列を作らないといけない　09:45～
        String[] studentsNames = new String[] {studentsNames[0], studentsNames[1], studentsNames[2], studentsNames[3], studentsNames[4], "岡田"};
                ※　プログラミングは基本的に0スタート（たまに例外あり）
         → 配列に要素を追加したい場合は、List<>（インターフェース）というのを使っていく

        List<String> studentNameList = new ArrayList<>();　11:10～
        上記のコードを詳しく説明すると、↓　　動画で言うと12:00～
        →Listの中には機能がない。例えば「studentNameList」の中に何か追加しても具体的にどういった処理をするのかが定義されていない。それを定義したのが、「ArrayList<>()」である
        →「動物という定義があります。動物という定義で全部表現できますか？」答えは無理！なぜなら「犬」「猫」「それ以外」とあり、さらに犬の中にも柴犬、ブルドック、ラブラドールと様々な種類がいて、
        その抽象的（総括的）なのを表すのに動物や、犬という表現を使う。それが今回で言う List の役割（あくまで連続する要素であることを表している）
        さらに要素の追加や削除を簡単にできるようにするために ArrayList<> これがある
        ・AIに教えてもらったListの基本的な使い方　↓
        →　new ArrayList<>()の概念は、「Javaで“なんでも入れられる箱”を自分で作る魔法の呪文」というイメージ
        →　<>で型を設定しているから、間違ったものは入らない安心設計！

        // 配列Listを一緒に説明している 15:00～
      ＜配列＞    // 15:30～
        String[] studentNames = new String[] {"江並","井上","佐藤","加藤","田中"};
        System.out.println(studentNames);  // 配列要素をそのまま表示すると配列要素しか出てこない（@15db9742　のような文字列が出力されてしまう）
        → System.out.println(Arrays.toString(studentNames));  // これでやっと配列の中身を表示してくれる
      ＜List＞    // 16:10～
        List<String> studentNameList = Arrays.asList(studentNames);  // 配列の内容をそのままリストに変換、元の配列とリストは連動しており、どちらかを変更するともう一方にも影響が出る
        → List<String> studentNameList = List.of("江並","井上","佐藤","加藤","田中");  // 直接、指定した値からリストを作成する方法
        System.out.println(studentNameList);  // ListはListの中身を出してくれる
      ＜Map＞     //17:05～
      　実際に名前とかを連続させるときに名前だけを連続させることはないと思う。（1番江並、2番井上...みたいな感じだと思う）←　2つどころか３つの要素を組み合わせることも出来る
        Map<key, value>
        Map<Integer, String> studentNameMap = new HashMap<>();  // Listと同じで一番最初のMapはインターフェース　そのため = の後にnew HashMap<>()ト記述
        Map<Integer, String> studentNameMap = Map.of()  // keyと値の組み合わせを連続で実装していくことが可能
        →　Map<Integer, String> studentNameMap = Map.of(1, "江並", 2, "井上", 3,"佐藤", 4 , "加藤", 5, "田中");
        　※　↓　Mapを使う上で知っておいた方がいいこと
        ・HashMap　→　要素の追加・削除・変更が可能、初期化後も自由に操作できる、要素数が多くてもOK、キーの順序は保証されない
        ・Map.of　→　作成後の追加・削除・変更は不可、少数の要素を簡単に書ける、要素数は最大10個まで（それ以上はMap.ofEntriesを使う）
        ・LinkedHashMap　→　挿入順序を保持したい場合に使うMap、順序付きでデータを管理・出力したい時（例：履歴、順序付き表示）、HashMap同様の操作感で順序も必要な場合
        ・TreeMap　→　キーで自動的にソートされた順序を保つMap、キーの昇順やカスタム順で管理したい時、範囲検索や最小・最大キー取得が必要な場合
      ＜拡張for文＞21:25～
        リストの要素の数だけ、配列の数だけループを回したい！というときに拡張for文を使用する
        ↓　詳しく説明　　拡張for文(ループ内で取り出される要素の型 ループごとに取り出される要素を受け取る変数名 : 繰り返し処理の対象となる配列やリスト)
        ↓　更に詳しく　　繰り返し処理の対象となる配列やリストに沢山の要素があった時「1つ1つに個別の変数名を付けるのは面倒」なので、
                      対象となる配列やリストの中身を1つずつ「ループごとに受け取る変数」に代入し、その変数を使って{}内で処理をしていく。
        →　簡潔に説明　　for (要素の型 変数名 : 配列やリスト)
        for(String name : studentNameList) {
        System.out.println(name);
        }  これは例だがこんな感じで使っていく　
        　　※　23:40～　動画で説明しているが、拡張for文の中にif文を入れて細かく条件を書くこと（ネスト）も出来るがとてもコードが読みづらくなってしまう
      ＜switch文の使い方＞　条件式に近い　28:50～
        int number = 10;
        if(number == 1){
          System.out.println(1);
        } else if(number == 2) {
          System.out.println(2);
        } else if(number == 3) {
          System.out.println(3);
        } else {
          System.out.println(10);
        }　　みたいなコードがあったとしたら
        ↓＜switchケース文＞というのがある↓　29:40～
        int number = 10;
        switch (number) {  // switchという文法の中に(switchの判定する値が何なのか)というのを入れる
          case 1 -> System.out,println(1);
          case 2 -> System.out,println(2);
          case 3 -> System.out,println(3);
          default -> System.out.println(10);  // case以外（該当しない）の場合の話
        }   このように書ける
        */

    // 課題 07_StreamAPIとラムダ式
    // 今日紹介したものは一通り実装してください。

    // 課題②　文字列のリストを作って下さい。要素数は10個。
    // その文字列に対して、文字数が2以上のものを抽出して、文字列に変換をしてください。区切り文字はカンマ（,）で行ってください。
    // その文字列を出力してください。
//        List<String> animal = List.of("inu", "neko", "p", "koara", "u", "h", "inko", "pengin", "risu", "kapibara");
//        String kekka = animal.stream()
//            .filter(animalName -> animalName.length() >= 2 )
//            .collect(Collectors.joining(","));
//        System.out.println(kekka);
        /*
    List<String> animal = List.of("inu", "neko", "p", "koara", "u", "h", "inko", "pengin", "risu",
        "kapibara");
     →　animalという変数名のString型リストを作り、変更不可（イミュータブル）な10個の文字列を要素として持つように作成している。

    String kekka = animal.stream()
        →　kekkaという名前のString型変数を宣言し、同時に値を代入（初期化）し、animalリストの要素をストリームとして処理できるようにしている。

        .filter(animalName -> animalName.length() >= 2)
        　→　先ほど作ったListの要素が２文字以上か真偽を見ている。
        　→　.filterで真偽を見る（trueを返した要素だけを次の処理に渡す）ように指示している。
        　→　(animalName -> animalName.length() >= 2)は、ラムダ式を使用し、animalという変数名のリストの要素が順番に入り->リストをどうしたいかの処理を入れている

        .collect(Collectors.joining(","));
        　→　抽出した後文字列に変換するために、collectメソッドを使用している。Collecors.joining()は1つの文字列に結合するためのもの。
        　→　()の中に何も入れないと「inunekokoarainkopenginrisukapibara」のようになる。
        　→　文字列に変更したかったからcollectを使えばよい。が一行ずつ出力する場合は.forEach(System.out::println);と記述すればよい。

    System.out.println(kekka);
         */

    // 課題③　数値のリストを作ってください。要素数は10個。
    // その数値の中の奇数のものだけを抽出して、平均値を出してください。
    // その平均値を出力してください。
//        List<Integer> randomNum = List.of(23, 87, 45, 12, 9, 56, 78, 34, 65, 2);
//        double randoms = randomNum.stream()
//            .filter(n -> n % 2 == 1)
//            .mapToInt(Integer::intValue)
//            .average()
//            .orElse(0);
//        System.out.println(randoms);
        /*
    List<Integer> randomNum = List.of(23, 87, 45, 12, 9, 56, 78, 34, 65, 2);
    　→　randomNUｍという変数名のInteger型を作り変更不可な10個の整数を要素として持つように作成している

    double randoms = randomNum.stream()
    　→　平均値を出したいので整数（int）型ではなくて小数（double）型を使用している。変数名をrandomsにしてrandomNumの要素をstreamとして処理でいるようにしている

        .filter(number -> number % 2 == 1)
        　→　ラムダ式を使用し、randomNumの中にある10個の要素が奇数となるもののみ抽出する。

        .mapToInt(Integer::intValue)   （.mapToInt(x -> x.intValue())と同じ意味）
        　→　数字の箱であるIntegerから、ただの数字であるintにするために行っている
        （intStreamはint型専用のstream　リストの中の数字を「計算しやすい形（int型）」に変えている
          Streamの要素がInteger型（オブジェクト）である場合、mapToIntは「int型のストリーム（IntStream）」に変換する必要がある
          (Integer::intValue) これは、「箱から中身（数字）を取り出す魔法の鍵」と思ってOK！
          Javaでは、数字を「int」という素のデータ（プリミティブ型）と、「Integer」という箱（オブジェクト型）の2種類で扱う　→　たとえば、Integer num = 10; というとき、10という数字が「箱」に入っている状態
          つまり、「箱入りの数字」を「素の数字」として使いたいときに、この鍵（intValue）で開けて取り出せる。

        .average()
        　→　ストリーム内の数値要素の平均値を計算するためのメソッド

        .orElse(0);
        　→　.average()で平均値を出そうと思ったのに、.filterをしたが故答えがなくなる可能性がある。
        　→　答えがないことでNoSuchElementExceptionとエラーが出てくるのは嫌なので答えがなかったら0と出力してもらうために書いている。
        　→　言わば、.average()と.orElse(0);はセットである。

    System.out.println(randoms);
         */

    // 課題④　ChatGPTなどの生成AIを使って、Stream APIの基礎的な課題を一つ作ってもらってください。
    // それを実際に実践してみてください。
    // 10個の文字列からなるlistを作成してください。
    // そのリストの各要素を大文字に変換し、新しいlistとして出力してください。
//        List<String> myojiList = List.of("fuziwara", "minamoto", "taira", "tachibana", "konoe", "itizyou", "kuzyou", "saionji", "nizyou", "sanzyou");
//        System.out.println ("課題④" + myojiList.stream()
//            .map(m -> m.toUpperCase())
//            .collect(Collectors.toList()));
        /*
        こんな感じ　↓　で最初書いていたが
    List<String> japanName = List.of("sato", "suzuki", "takahashi", "tanaka", "ito", "watanabe", "yamamoto", "nakamura", "kobayashi", "kato");
    　→　String型のリスト作成

    List<String> omoziName = japanName.stream()
    　→　新しいListとして出力させたいので、Listを作成する

        .map(names -> names.toUpperCase())
        　→　変更するためのmapを使用して、全て大文字に変更していく

        .toList();
        　→　新しくリストを作成している

    System.out.println(omoziName);
         */

        /*
        01:20～　streamAPIの基本の書き方
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);
        for(int number : numberList) {
            if(number <= 5) {
                System.out.println(number);
            }
        }
        //  ↑ １～５を表示して！と、一言で言えるのにプログラミングにすると５行も必要になってしまう...
        //  ↑ このようなネストされているコードをきれいに書き直したい！
        // そんな時にStreamAPIを使って記述するときれいに書ける
        // ↓　こんな感じになる　↓ 02:55～
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);
        numberList.stream()
            .filter(number -> number <= 5)
            .forEach(System.out::println);
        ↓　こんな感じになるの＜解説＞
        List<Integer> numberList = List.of(1,2,3,4,5,6,7,8,9,10);
        numberList.stream()  // 連続した要素を便利に取り扱うための様々な便利機能を持った奴　　※その中で使われている便利な記法をラムダ式と言っている
            // ↑　numberListというListに対してstreamというメソッドを実行している。
            // ↑　streamAPIを使用するための専用のstreamという形式がある。()を使ってstreamに変更している。※Mapをstreamにすることも可能
            // ↑　streamに変更するとstreamが持っている様々な機能を使用することができる
            .filter(number -> number <= 5)  // 一つ目のnumberはListの1,2,3…に名前を付けている（連続する要素の、一要素の値を指している）
            // ↑　（）の中に入っていることに対してfilterをかけて抽出している
            .forEach(System.out::println);  // 上で抽出したものに対してforEachで繰り返し処理として出力をしよう！と書いている　※出力するのに::を使用しているのは、簡略化された書き方
            // .forEach(number -> System.out.println(number));　と書くのが正式だが上の状態のほうがきれい
            // ↑　06:30～　ただし使う値が２つ以上（Map等）あると、値（引数）がどっちを使えばいいのか分からないので使えない。

        numberList.stream()  // 13:00～
            .limit(3)  // その要素の上限を決める　※今回は3と指定しているので3までしかループしない
            .forEach(System.out::println);

        10:00～ ＜一例＞
        List<String> studentList = List.of("inoue", "enami", "tanaka", "enami");
        studentList.stream()
            .map(v -> v.toUpperCase())  // mapはその中に入っている要素を特定のものに変換したいときに使用する
            ※型のMapとは別物
              // ↑　toUpperCase()　でListの中に入っている文字列を大文字にする
            .forEach(System.out::println);  // forEachで上で大文字にしたものを出力しようとしている

        studentList.stream()  // 上と同じListを使っている　12:10～
            .sorted()  // ソートという　sortedとはアルファベット順に並べ替えること
            .forEach(System.out::println);

        studentList.stream()　14:00～
            .distinct()  // 重複除外をすることができる
            .forEach(System.out::println);

        // 上記で書いていた中間操作を一つにまとめることも出来る　14:20～
        studentList.stream()
            .map(v -> v.toUpperCase())
            .sorted()
            .distinct()
            .forEach(System.out::println);

        // 終端操作（終了処理）12:00～、14:50～、15:55～
        System.out.println(studentList.stream()
            .map(v -> v.toUpperCase())
            .sorted()
            .distinct()
            .collect(Collectors.joining(",")));  // .collectというのは別の要素をcollection要素に変換するというもの　（何か別のものに変換をかける。と覚えておけばオケ）
            // ↑ これは、色々な処理をしたうえに要素としてjoinとしている。String型にし、カンマ区切りの文字列の連続にする
            // ↑ 今回で言うとListを一つの文字列に変更している

        // 他のstreamAPIの紹介
        11:57～　（途中で変換処理を加える　→　中間式や中間操作と言ったりする）
        // .toList()  05:35～、16:20～　別のListに変換してくれる　[]付きのlistになる？っぽい
        // .toArray()　配列に変換してくれる
        // .count()　要素数の数をカウントする　これはsortedを一緒に使うことはできない
        // .findFirst()　17:45～　最初に見つけた要素だけを出力させる
        // .anyMatch(v -> v.startsWith("e"))　18:03～　要素の中で見つけたものを表示する（様々な要素がいっぱいある中でその要素の中に特定の値が含まれていることを検索したい時に使用する）
        // 　↑　()の中に条件を書いていく　今回のv -> v.startsWith("e")これだと最初の頭文字がeで始まるか？という意味である
        // .allMatch(v -> v.startsWith("e"))　19:03～　記述した要素がeから始まっていないとfalseとなる
        // .collect(Collectors.toList())　streamを使用して簡潔に記述した後その結果をリストとして保持したい場合に使用する
         */

    // 08_入出力処理と例外処理
    // 課題①　入出力を実際に実装して、作ったファイルに文章を追加する。
    // その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う。
//    System.out.print("08_課題①　");
//    Path path = Path.of("Singing.txt");
//    try {
//      Files.writeString(path, "歌うの楽しい！", StandardOpenOption.APPEND);
//      System.out.println("Singing.txtに記述しました");
//    } catch (IOException e) {
//      e.printStackTrace();
//      System.out.println("例外が発生しました。");
//    }

    // 課題②　catchした中でさらにファイルに書き込もうとして例外になった場合、どうなるのかを確認してください。
//    System.out.print("08_課題②　");
//    Path xxx = Path.of("xxx.txt");
//    try {
//      Files.writeString(xxx, "catchに例外処理書いてみる", StandardOpenOption.APPEND);
//      System.out.println("xxx.txtに記述しました");
//    } catch (IOException e) {
////      Files.writeString(xxx, "どうなるかの確認");
//      e.printStackTrace();
//      System.out.println("例外が発生しました。");
//    }
        /*
        入出力処理を学びましょう！と言われたらファイル操作を学ぶことと思えばいい
        入出力とは　→　入力処理、出力処理のとこ
        00:30～ プログラミング言語（Javaやruby等）で「入出力」というのを使うのは「ファイル操作のことを指すことが多い」
        06:05～　csvファイル
        　→　(a, b, c, d)　や　(江並, 井上)　みたいな、カンマ区切り一行単位のデータのことをcsvという
        06:55～　データベース（DB）
        　→　データをため込む場所　様々なデータベースとは別で「単純にデータをため込む場所にファイルが使われることがあった（40年ぐらい前の話）」
        09:15～　ファイル操作のいいところは？
        　→　（現場の話関係なく）何かファイルを書き込む・作るときというのは「成果物」を作成したとき！クリエイティブなことがプログラムを通してすることができる。

        11:43～ 「Path.of」というのを使っていく。
        Path path = Path.of("JavaCourse.txt");
        Files.writeString(path,"Javaコース楽しい!")
        　↓　詳しく説明
        Path path = Path.of("JavaCourse.txt"); // この時点では何も出来ていない
        　→　path = ファイルの場所のこと（ファイル名ぐらいにおもっていればOK）
        　→　Path path = 型として書いておく（ファイルパスみたいに言われたりする）
        　→　Path path = Path.of("JavaCourse.txt");　これはファイの場所を指し示しているだけ
        Files.writeString(path,"Javaコース楽しい!");
        　→　Files.writeString　これを入力するとパスを教えて（場所どこやねん）と出てくるので、まず（）の中にpathを渡す。その次に文章を入力する
        　　　→　13:14～　JavaCourse.txtというファイルの場所に対して、JavaCourse楽しい！という文字列を書き込みます。という動きになる
        13:20～　writeStringが動いた瞬間に一緒にファイルも作られる
        　※　本来はファイルを作る動きとファイルに何かしら書き込む動きは別の動き。ただ、ファイルに何かしら（処理を行いたい）文字を書き込みたい！と思った時にわざわざファイルを生成して...みたいな順番をやりたくない
             ファイルがなかったら生成してほしいし、ファイルがあるんだったら追記してほしい　→　良しなにしてくれよ！と思う　→　良しなにやってくれるのができた（pathとFiles）。
        14:20～　ファイルの開き方をどうするか
        StandardOpenOption.○○　と記述していく
         「CREATE」だと作るだけ、「WRITE」書き込み、「CREATE_NEW」新規書き込み、「APPEND」追加（追記）する　→　こんな感じのを指定することができる
        　※　デフォルト（何も書かないと）ファイルがなければ、ファイル作成と共に上書き、ファイルがあるようなら上書きのみ。
          今回は、生成すると同時に文言も指定しているので一緒に書き込んでもくれる
          「APPEND」は追加するという意味なので、APPENDと書かれているのに（今回みたいな）"JavaCourse.txt"が書かれていなかったらエラーが出てきてしまう（あることが前提のため）
        16:13～　なんでwriteStringにエラーが出ているのか？
        　「メソッドシグネチャーに例外があります」トエラーメッセージが出てきてその隣にある追加を押すと↓
        public static void main(String[] args) throws IOException {　みたいな感じで「throws IOException」が追加される
        16:35～　「throws IOException」って何？
        throws = 投げるということ
        IOException = 検査例外　→　その例外が発生しますよというのをプログラム上に認識させないといけない　20:45～
        「throws」を使って「main」メソッドを実行したときに「IOException」が発生する可能性があります。と伝えないといけない

        // 厳密にいうとJavaの世界でエラーと例外（エクセプション）は別物　17:00～
      // エラー
        // どうしようもないもの。Javaのプログラミング言語の中で制御ができないようなエラー。システムを動かしてるのにパソコンが壊れちゃってエラーが出て動きません。
      // 例外　→　良く起きるけど、パソコンが壊れたわけではない　→　自分たちのコードを変えたら解決できる
        // 制御ができるもの。
        // 検査練外（制御できる）、非制御例外（制御できない、制御するべきでない）
        　→　「異常も正常」想定している例外（文字列間違えてる、想定していない値が入力されましたとか）
        　→　「バグ」なんでそれが出たのか分からない、出てはいけないものが出てしまった

        例外が発生したときに何をするのかを定義するのがある　22:53～
        try {
        Path path = Path.of("JavaCourse.txt");
        Files.writeString(path,"Javaコース楽しい!");
        } catch (IOException e) {
            e.printStackTrace();
            // ここの処理を実行する
            // すると例外はなかったことになる。（ファイルの入出力処理で例外が発生しましたという状態）29:00～
        }
        tryをやってみて、やってみた結果IOExceptionというエラーが出てきてしまったらcatchする。catchしたら// ここの処理を実行する　このように実装する
            これをやったら最初に定義しないといけない予定だったthrows IOExceptionはいらない

        // すると例外はなかったことになる。の解説
        例外が発生した後、何かしらの処理が行われましたということなので例外がなかったことになる。で、これが危ない
        →　動きがおかしいわけではない。例外が起きた後に例外処理を行ったから何事もなかったように見えるだけで「例外は起きた」。けど、その例外の情報がないと例外をなおせない（原因が特定できない）
            →　30:15～　e.printStackTrace();を記述する。
              StackTrace() = 例外の内容を表示してくれる（あくまで例外の内容をコンソール画面に表示するだけ）
              // 今回の例外の内容は、「NoSuchFileException」 = ファイルが見つかりませんでした。と書いて教えてくれている

        // 33:00～　あえて例外を発生させてみようかなー
        try {
        Path path = Path.of("JavaCourse.txt");
        Files.writeString(path,"Javaコース楽しい!");
        } catch (IOException e) {
            e.printStackTrace();
            System.pout.println("例外が発生した");
        }　←　今回catchの中の順番をe.printStackTrace();の後に、System.pout.println("例外が発生した");としたが、例外が発生したの下に、エラーが出力されている
        */

    // 09_オブジェクト指向について
    // 課題
    // 今回実践したものを一通り実装してみてください。
    // Greeting　と　Speakingは使わずに皆さんが考える抽象的なinterfaceとその実装を組み合わせて作ってみてください
    // interfaceの実装を2つ以上作ってください。　（今回エナミさんはGreetingを作っている）
    // 継承（extends）を使ってみてください。上記で作った２つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してみてください。
    // メソッド呼び出しは親子もどちらとも呼び出してみてください。
    // Greeting1は親、Greeting2は子、Greeting3は孫（子は親の機能を呼び出せるが、親は子の機能をよびだすことは出来ない）
    // （ifやListを使ったりしてもOK　）

    // 親クラス（インターフェース実装クラス）のメソッド呼び出し
//        Eating beef = new Meat("牛肉", "北海道");
//        beef.displayFood();
//        beef.eat();
//
//        Eating salmon = new Fish("サーモン", "オホーツク海");
//        salmon.displayFood();
//        salmon.eat();
//
//        // Meatを継承したCookingのメソッド呼び出し
//        Cooking wagyu = new Cooking("和牛", "神戸", "すき焼き");
//        wagyu.displayFood();
//        wagyu.eat();
//        wagyu.specialInfo();

        /*  解説
        // 親クラス（インターフェース実装クラス）のメソッド呼び出し
        Eating beef = new Meat("牛肉", "北海道");
            解説：Meatクラスのインスタンスを作成し、Eating型の変数beefに代入
                 これは「北海道産の牛肉」という情報を持ったMeatオブジェクト
                 ポイント：インターフェース型（Eating）で受けているので、Eatingで定義されたメソッドだけが使える

        beef.displayFood();  ここで出力される
            解説：「肉の種類：　牛肉（北海道）」と表示
               なぜここで出力されるのか？
               　→　beef.displayFood(); というメソッド呼び出しの中身で、実は System.out.println() が使われているから

        beef.eat();  ここでも出力される
            解説：「北海道の牛肉を焼いて食べます。」（※Meatクラスの実装内容による）

        Eating salmon = new Fish("サーモン", "オホーツク海");
            解説：Fishクラスのインスタンスを作成し、Eating型の変数salmonに代入
                 これは「オホーツク海のサーモン」という情報を持ったFishオブジェクト

        salmon.displayFood();
            解説：「魚の種類：　サーモン（オホーツク海）」と表示

        salmon.eat();
            解説：「オホーツク海のサーモンを刺身で食べます。」

        // Meatを継承したCookingのメソッド呼び出し
        Cooking wagyu = new Cooking("和牛", "神戸", "すき焼き");
            解説：Cookingクラスのインスタンスを作成し、Cooking型の変数wagyuに代入
                 これは「神戸産の和牛をすき焼きで調理する」という情報を持ったCookingオブジェクト

        wagyu.displayFood();
            解説：「肉の種類：　和牛（神戸）」と表示（MeatクラスのdisplayFoodを継承）

        wagyu.eat();
            解説：「神戸産の和牛をすき焼きでいただきます。」（Cookingクラスでオーバーライド）

        wagyu.specialInfo();
            解説：「特別な調理法すき焼き」
         */

        /*「食べること」でやった場合
        interface Eating {
            void eat();
            void displayFood();
        }

        class Meat implements Eating {
            protected String name;
            public Meat(String name) { this.name = name; }
            @Override
            public void eat() { System.out.println(name + "を焼いて食べます。"); }
            @Override
            public void displayFood() { System.out.println("肉の種類: " + name); }
        }

        class Fish implements Eating {
            protected String name;
            public Fish(String name) { this.name = name; }
            @Override
            public void eat() { System.out.println(name + "を刺身で食べます。"); }
            @Override
            public void displayFood() { System.out.println("魚の種類: " + name); }
        }

        class SpecialMeat extends Meat {
            private String style;
            public SpecialMeat(String name, String style) {
                super(name);
                this.style = style;
            }
            @Override
            public void eat() { System.out.println(name + "を" + style + "でいただきます。"); }
            public void specialInfo() { System.out.println("特別な調理法: " + style); }
        }

        public class Main {
            public static void main(String[] args) {
                Eating meat = new Meat("牛肉");
                meat.displayFood();
                meat.eat();

                Eating fish = new Fish("サーモン");
                fish.displayFood();
                fish.eat();

                SpecialMeat wagyu = new SpecialMeat("和牛", "すき焼き");
                wagyu.displayFood();    // 親クラスのメソッド
                wagyu.eat();            // 子クラスでオーバーライドしたメソッド
                wagyu.specialInfo();    // 子クラス独自のメソッド
            }
        }   */

        /*  Animalでやってみた場合
        // （インターフェース）動物ができることを決めるルールブック
        interface Animal {
            void makeSound();   鳴き声を出す
            void showType();    動物の種類を表示
        }
        // （実装クラス１）Animalルールを守る「犬」クラス
        class Dog implements Animal {
            protected String name;

            public Dog(String name) {
                this.name = name;
            }

            @Override
            public void makeSound() {
                System.out.println(name + "は「ワンワン！」と鳴きます。");
            }
            @Override
            public void showType() {
                System.out.println("動物の種類：　犬");
            }
        }
        // （実装クラス２）Animalルールを守る「猫」クラス
        class Cat implements Animal {
            protected String name;

            public Cat(String name) {
                this.name = name;
            }

            @Override
            public void makeSound() {
                System.out.println(name + "は「ニャー」と鳴きます。");
            }
            @Override
            public void showType() {
                System.out.println("動物の種類：　猫");
            }
        }
        // （継承クラス）Dogクラスをさらにパワーアップした「特別な犬」クラス
        class SpecialDog extends Dog {
            private String trick;

            public SpecialDog(String name, String trick) {
                super(name);
                this.trick = trick;
            }
            //makeSoundをさらに自分流にアレンジ
            @Override
            public void makeSound() {
                System.out.println(name + "は「ワンワン！」だけでなく、「" + trick + "」もできます！");
            }
            // 子クラス独自のメソッド
            public void showTrick() {
                System.out.println(name + "の特技：　" + trick);
            }
        }
        // メインクラス
        public class Main {
            public static void main(String[] args) {
            // インターフェース型で実装クラスを使う
            Animal dog = new Dog("ポチ");
            dog.showType();     親クラス（Dog）メソッド
            dog.makeSound();    親クラス（Dog）メソッド

            Animal cat = new Cat("タマ");
            cat.showType();     親クラス（Cat）のメソッド
            cat.makeSound();    親クラス（Cat）のメソッド

            // Dogを継承したSpecialDogのメソッド呼び出し
            SpecialDog specialDog = new SpecialDog("ジョン", "お手");
            specialDog.showType();      親クラス（Dog）のメソッド
            specialDog.makeSound();     子クラスでオーバーライドしたメソッド
            specialDog.showTrick();     子クラス独自のメソッド
        }
    }   */

        /*
        // 動画を見ながら課題をやってみようとしたやつ
        Cooking eating = new Cooking();
        String message = eating.eat("焼肉");

        Printer printer = new Printer();
        printer.printMessage(message);
         */
    // 下記動画のやつ
//        Greeting greeting = new Greeting();
//        String message = greeting.sayHello("Kouji Enammi");
//
//        Printer printer = new Printer();
//        printer.printMessage(message);
//
//        Speaking speaking = new Greeting();

        /*
        ～11:15　導入
        ～22:00　クラスの作り方（クラスを作ってどうやって動かすか）
        　抽象的なのを表現するときに使うインターフェース（interface）

        10:10～　マジで結論「良いものを作れれば良い！」 → 「最高のものを、最短・最安値」でやれて、変更がしやすいなおかつリスクもほとんどないようなものを、出来るようにしていこう！という考え方・思考方法ができていたらOK
        00:01～　導入の導入
        オブジェクト指向の扉をちょっと開くと言いながら「基礎であり奥義」
        オブジェクト指向の良さを知ってもらいたい

        01:45～　クラスというのがとても大切になってくる。
        Javaクラスとファイル名が一致していないといけない。クラスというのは、オブジェクト指向でもそうだが、プログラミングを書くうえでもとても大切なものとなる
        02:05～　（言い方について恐れずに言うと）
        　↓　クラス = 機能の最小単位（このように言い換えることができる）

        02:25～　急にGreeting（ = 挨拶）というクラス（ファイルも）が出てくる
        public class Greeting {
            public String createMessage(String name) {
                return "Hello, " + name + "!" ;
            }
        }　→　挨拶をするクラス、挨拶という機能を持っているクラスで、「挨拶」という機能を持っているので「createMessage」の部分が「greet」「hello」「say」などメソッド名は挨拶に関していればOK！
         　→　「挨拶をするクラスで、実際に何を言うか、引数に入ってきた文字列をHelloとともに言う」みたいな動きをする仕組みのものを上のクラスで作っている
         　→　Stringをreturnで返しているので、文字列が返ってくる
        ※　ここで注目してほしいのは「挨拶」をするクラスであるということなので、ここに「挨拶をする」以外の機能を入れると分かりにくくなってしまうし、
            それをここに書いて「誰が得をするの？」という話になってきてしまう

        03:23～　プログラムの世界の話になってしまうが、「名前付けが大切」と口酸っぱく言われ続けてこられた理由は、「設計」に関わってくる話で、「こうあるべき」とまではいかないが「こうやってあった方が楽だよ」「この方がいいもの作れるよ」
                  = 原理原則、設計法則　と言ったりする
        プログラムの世界自体は自由　＝　何をしても良い　→　例えば、Greeting（挨拶という）機能の中に、「電話をかける」「メールを送る」とかいう機能があっても問題ない
        　→　けど、こんな作り方をしたら分かりにくいし、徳をしないから辞めましょう。もっとみんなが作りやすくて、分かりやすくて、楽に出来るように、とみんな考えた結果として生まれたものの1つが「オブジェクト指向」というもの

        05:00～　（誤解を恐れずに分かりやすく説明すると）オブジェクト指向 = 「変化しやすくするための考え方」、　オブジェクト指向で大切にしている考え方は「変化に強くなろう」
        プログラミング = ものを作る仕事と一緒にされることが多い（家を建てることに似ているとよく言われる）
        お客さんが求めているものに対して、最も良い家を作る　→　「最も良い」ってお金が無限にかかってしまうことではなくて、その人の予算の中でできる「「最高のもの」を「最短」で「最安値」」というのがIT技術者と似ている
        　→　ここで厄介なのは、家とは違い作ったものが頻繁に変化する（変更できる）、メリットでもあり、デメリット（変更したことにより全てが壊れてしまう可能性があるため）でもある
        保守的な考え方だと、壊れて使えなくなると困るから「変化させるのをやめよう！」だって動かなくなったら困るし...。と思ってしまうがプログラムは変化があるのが当たり前の世界なので、変化がないというのはありえない
        　※　ITの世界では、変更がしやすいから変化ができる　→　変化ができるからより良いものができる　→　良いサービスが提供できる
        　　　　保守的になるということは、これを自ら捨てるということ　＝　自ら捨ててたらプログラムの利点を失っていない？だから、「変更や変化を０にする」ということはまず無い = 何かしらの変更が加わることが前提
        ＜様々な変化を許容して、変化してもいいように変化させやすいように作る、そのための考え方や思考方法、実装の仕方　このようなものにつながる思考のことを「オブジェクト指向」という＞

        11:00～　＜本編＞そのオブジェクト指向を実現させていくには？という具体的な話
        11:23～　クラスが最小単位であるべき => １クラス = 一機能　（単一責任の原則と言ったりする）
        　→　1つの機能で持たせるべき責任は1つである。という考え方
        　→　どういうことかというと、自分は喫茶店をやっています。なのにメニューが「お寿司」のみです。これは、喫茶店ではなくて寿司屋じゃん！ということ。

        public class Greeting {
            public String say(String name) {
                return "Hello, " + name + "!" ;
            }

            public String takeOut(String name) {    こうやって簡単に増やすことができてしまう
                // 寿司の出前ができるみたいな機能を書くことが出来てしまう。
                return "Hello, " + name + "!" ;
            }
        }
        ↑　この例は、Greetingというクラスに合っていないのでダメ
        　↓　こっちは、Greetingというクラスに合っているのでＯＫ！
        public class Greeting {
            public String sayHello(String name) {
                return "Hello, " + name + "!" ;
            }

            public String sayHelloJapanese(String name) {
                return "こんにちは、 " + name + "!" ;
            }
        }   // 最初はGreetingって書いてあったけど、コードを書いていくうちに違うな...となれは変えていくことも可能出し、それは積極的にしていった方がいい

        15:50～　今作ったGreetingクラスのsayHelloメソッドを使いたい場合はどうしたらいい？
        public class Main {
            public static void main(String[] args) {  // Greetingという設計図に基づいて、実際に動かせるものを呼び出した感じ
                Greeting greeting = new Greeting();  // こういうのをインスタンス整数という
                greeting.sayHello("Kouji Enami");
            }
        } // これだけだと出力されない。「出力してくれ」なんてどこにも書いてないため。出力されるために新しく作る
        17:45～　出力するためのクラス
        public class Printer {
            public void printMessage(String message) {  // ちなみに、このpublic～｝までがメソッド
                System.out.println(message);
            }
        }
        ↑　これをPrinterに記述したことによって
        public class Main {
            public static void main(String[] args) {  // Greetingという設計図に基づいて、実際に動かせるものを呼び出した感じ
                Greeting greeting = new Greeting();  // こういうのをインスタンス整数という
                String message = greeting.sayHello("Kouji Enami"); // 18:50～　sayHelloで作られたのが変数（message）に入る

                Printer printer = new Printer();
                printer.printMessage(message);  // で、その変数で持ってきたやつをここで出力する
            }
        }  // ここまでやってやっと出力される
        19:15～　今まではSystem.out.printlnで出力できていたんだから要らないじゃん！って思うのだがわざわざこれを使う理由がある
        　→１回しかやらないのならSystem.out.printlnで問題ない（しかも呼び出す文言が固定なら尚更シスアウトで良い）
            ただ、これを10万回呼び出してくれ！と言われたら同じ奴使いまわせばいいじゃん！となるので（何度も同じものを作ることを車輪の再発明）
        20:40～　コードをMainの中に全部書いていると複雑になってしまう（〇十万行になってしまうこともある）　＝　変更しにくい
        21:10～　便利な機能をたくさん作ってそれをみんなに共有して使うことができる
            その便利な機能がめちゃくちゃ集まったものを「フレームワーク」と言ったり、「ライブラリ」と言う

        抽象的なのを作りたいとなった時に「インターフェース」というのがある
        22:58～　インターフェースに（本体）処理の詳細を記述するとエラーが出てきてしまう
        public interface Speaking {
            public default String sayHello(String name) {  // このように定義してみるとエラーが出てくる
                return "Hello, " + name + "!";  // この処理の詳細がエラーを引き起こしている
            }
        }
        ↓　このようにする
        public interface Speaking {
            public String say(String name);
        }  // これの状態はSpeakingというインターフェースがあってその中にsayというメソッド定義がある
        　→　でも、これ中身ないじゃん？どうやって使うの？

        24:09～　「abstract class(：抽象クラス)」や「interface」　これらはインスタンス生成ができない　あくまで概念のため
        　→　この前の動物っていうものは存在する？っていう話と似ている

        ここから先は画面がころころ変わるので、どうやって書いていけばいいのか分からなくなり途中であきらめた

        継承（多態性）
        35:30～　継承より委譲　（権限を渡す）
        */

    // 10_正規表現
    // 課題①正規表現をたくさん使う
    // Listにランダムな文字列（色々自分で入れてもいいし、生成AIとかにお願いしてもいい）を30個ほど入れてみてください。
    // その文字列のリストに対して「数字だけを抜き出す正規表現」と「文字だけを抜き出す正規表現」を試してみてください
    // 実際にあっているか確認してみて
//        List<String> moziList = List.of(
//            "7山dカ3りKタn", "ク1b水さ9N京p", "8都アzL5t川ナ", "ひA6東oサ1b山イ", "2o大ヨk3さ都m", "ル7いsK山4ラn", "みT5田uカ9しC", "7京ナeむ3イl都", "さJ0川たN8クm", "しx1都カg5田ウ",
//            "8水サvるK大2", "らY田3カ7s山エ", "9クbさM0都イ", "み4タk山1しN", "2川アt京7まD", "ル5いo東3ラs", "えL7田uカ2しQ", "6京ナgむ1イb都", "さD8川たJ4クn", "しz2都カx6田ア", "7水サrるT大9",
//            "らW田1カ5s山オ", "8クcさS3都イ", "み9タy山0しB", "2川エt京8まF", "ル1いp東6ラw", "えN5田eカ4しV", "3京ナsむ7イd都", "さF6川たH2クo", "しm7都カz9田キ");
//        System.out.print("10_課題①「数字だけ」：　");
//        List<String> numberList = new ArrayList<>();
//        for (String suzi : moziList) {
//            String number = suzi.replaceAll("\\D+", "");
//            numberList.add(number);
//        }
//        System.out.println(numberList);

        /* 今回はほぼ同じような文法を使えばできるので①の「数字だけ」を説明する。
        List<String> numberList = new ArrayList<>();
        　→　numberListというString型のListを新しく作っている。新しく作っている理由は、出力するときにこれを使うから。

        for (String suzi : moziList) {
        　→　拡張for文で、moziListの中に入っている要素（文字列）を1つずつ取り出し、そのたびにString型の変数suziに代入して、ループ処理を繰り返している。

            String number = suzi.replaceAll("\\D+", "");
            　→　String型のnumberを新しく作っている。
                そして、suziの中にある文字列から「数字以外」の文字を全て削除し、数字のみを残した新しい文字列をnumberに代入している
                String 新しい文字列 = 元の文字列.replaceAll("正規表現", "置換文字列");

            numberList.add(number);
            　→　numberListの中にnumberを順番に追加していく
        }
        System.out.println(numberList);
        　→　現在、numberListの中に入っている文字列を全て表示させる
         */

//        System.out.print("10_課題①「文字だけ」：　");
//        List<String> letterList = new ArrayList<>();
//        for (String suzi : moziList) {
//            String letter = suzi.replaceAll("\\d", "");
//            letterList.add(letter);
//        }
//        System.out.println(letterList);

    // ここから下　↓　は時間が許す限りで問題ない
    // 課題②　更にそれが出来たら文字を抜き出すときに英数字の大文字だけ抜き出して
//        System.out.print("10_課題②　");
//        List<String> upperCaseList = new ArrayList<>();
//
//        for (String str : moziList) {
//            String upper = str.replaceAll("[^A-Z]", "");
//            upperCaseList.add(upper);
//        }
//        System.out.println(upperCaseList);

    // 課題③　更に更にそれができたら、漢字やひらがな、カタカナなどの日本語にマッチする正規表現を書いて抜き出して
//        System.out.print("10_課題③　");
//        List<String> japaneseOnlyList = new ArrayList<>();
//
//        for (String japanese : moziList) {
//            String japaOnly = japanese.replaceAll("[^\\p{IsHiragana}\\p{IsKatakana}\\p{IsHan}]", "");
//            japaneseOnlyList.add(japaOnly);
//        }
//        System.out.println(japaneseOnlyList);

    // 課題④　更に更に更にそれが出来たら、英数字以外の文字を抜き出すという正規表現をチャレンジしてみて
//        System.out.print("10_課題④　");
//        List<String> nonAlphaNumList = new ArrayList<>();
//
//        for (String AlphaNum : moziList) {
//            String nonAlphaNum = AlphaNum.replaceAll("[a-zA-Z0-9]", "");
//            nonAlphaNumList.add(nonAlphaNum);
//        }
//        System.out.println(nonAlphaNumList);

        /*
        Javaのスキルではないが、現場のいたるところで使われるような汎用的なスキルである
        使い方とか細かいことはAIに任せればいいが、どういったことができるか知っておくのが大切
        00:35～　hoge@gmail.com
                fuga@gmail.com
                aaabbbccc@yahoo.co.jp
                raise-tech.net
                ↑　文字の羅列があるときに、メールアドレスだけを取得したい時や、メールアドレスだけど表示させてい時など色々ある
                   けど、なんかメールアドレスじゃ無いのを書いたやつがいる！メールアドレスのみほしい！というときに使ったりする
        03:00～　Mapの時はループ処理のほうが分かりやすい！ということでMapを作ったらループ処理を作成している（時と場合によりけり）
                →　Mapでfor文を回すときはfor(addressMap)を回している　が、こいつ事態は回すことができないため、「entrySet()」を使わないといけない
                →　「entrySet()」とentrySet()を使うと中身が組み合わせとして一緒に出てくる。
                →　一緒に使うやつがいる。「Entry」である。　ー＞　for (Entry<String, String> address : addressMap.entrySet()) {　と書いてループ処理をすることが出来るようになる
        03:55～　address.getValue()　で、今回Mapに追加したそれぞれのValue（値）をとることができる　※　address.getKey()だったらKeyを取ることも可能
                →　で、抽出したValueがメールアドレスの形をしていたら○○（今回だと新しいListにする）するということも可能
                →　ここで、ifを使わずに出力しようとするとValueが全て表示されるようになる
        05:20～　ここから分岐処理（if文）
                →　if(address.getValue() で文字列を持ってきて「matches」を選択し、続きに正規表現を書く
                →　「matches」は正規表現の時よく使う。
        05:50～　分岐処理した内容にマッチするのがあった時だけaddress.getValue()を表示させる
        06:10～　正規表現は色々なパターンがあるためネットの情報を見た方が早い
                で、ネットで検索した情報があっているのかを調べるための機能がインテリJにはついている
                →　（メニュー）編集　->　検索　->　検索　->　そうしたら検索boxというのが出てくるので正規表現をONにして、正規表現を入力する
        09:50～　検索ボックスに^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$を入力したら合っているはずなのにエラーが出てきてしまう　→　なぜ？？？とてんぱらないように！
                ※　^は行頭、$は行末を表す。これらは行や文字列の先頭・末尾にマッチさせるための特殊記号
                    IntelliJ IDEAの「検索バー」は、デフォルトで「複数行モード」や「全文一致モード」にはなっていない。だから、^ や $ を使うと「不正な場所で使われている」と認識され、構文エラー（赤文字）になることがある
        12:55～　Mapをループ処理してみたがstreamを使用することも出来る
                List<String> addressList = new ArrayList<>();
                for (Entry<String, String> address : addressMap.entrySet()) {
                    if(address.getValue().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                        addressList.add(address.getValue());
                    }
                }
                System.out.println(addressList);
                ↑　これだったのを　↓ stream型に変更することが可能
                List<String> addressList = addressMap.values().stream()
                    .filter(s -> s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
                    .collect(Collectors.toList());
              System.out.println(addressList);　　このようになる

        最終的な全体像
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("井上", "hoge@gmail.com");
        addressMap.put("佐藤", "fuga@gmail.com");
        addressMap.put("田中", "aaabbbccc@yahoo.co.jp");
        addressMap.put("江並", "raise-tech.net");

        List<String> addressList = addressMap.values().stream()
            .filter(s -> s.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"))
            .collect(Collectors.toList());
        System.out.println(addressList);

        ↓　は、拡張for文の説明
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("井上", "hoge@gmail.com");
        addressMap.put("佐藤", "fuga@gmail.com");
        addressMap.put("田中", "aaabbbccc@yahoo.co.jp");
        addressMap.put("江並", "raise-tech.net");
        　→　新しくマップを作成している。このマップは、「誰からどんなメールアドレスが送られてきたか」を管理するためのもの

        List<String> addressList = new ArrayList<>();
        　→　addressListという（文字列を格納できる）String型のリストを新しく作っている

                for (Entry<String, String> address : addressMap.entrySet()) {
                　→　拡張for文でEntry型のaddressを作り、  addressMapの中身を「名前とメールアドレス」の1つのペアにして取り出して、そのたびにaddressに代入するループ処理を繰り返している。

                    if(address.getValue().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                    　→　もし変数addressの値（＝メールアドレス）が、"^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"という正規表現パターンに完全一致していたら

                        addressList.add(address.getValue());
                        　→　そのメールアドレスをaddressListに追加する
                    }
                }
        System.out.println(addressList);
        　→　現在addressListに入っている全ての要素（メールアドレス）をまとめて出力する
         */

    // 11_Intellijの便利機能
    // 課題　便利だと思ったものを手に馴染ませるように、これからコードを書くときにショートカットキーを使って書いていくようにすること
    //      どのキーだったっけ？って頭の中には入っていなくても指が覚えている状態になったらOK！

    /*
    開発の生産性を上げていくための操作（速度が変わってくるため）
    01:38～　環境構築の時にツールボックスのインストールと、とかで使ったサイトにある
            Intellij IDEAのキーボードショートカットの公式ページがあるため最新版はそこを見ると良い（よっぽど変更されることはないが、あまり使われないショートカットキーは変更されることがある）
            ※　Intellij Java IDEAキーボードのショートカットと入れて検索すること
    このサイトはとても賢いので、このサイトにアクセスしたOSに合ったショートカットの内容を変えてくれる

        06:00～　ある行を上に持っていきたい場合
    <Ctrl + x>　で、選択した部分をコピーと消去を一緒にしてくれるから今まではこれでやっていたけど、一行だけなら
    <Alt + Shift + 十字キーの上下>　選択行を上下移動することが可能
        ※　for文や、if文をまとめて移動させたいことのほうが多いのであまり使用することはない

        07:13～　この行要らねえな！となった場合
    <Shift + del>　現在行の削除になる　（これはめっちゃ使う）

        09:18～　名前の変更をしたいなー(リネームしたい）ってなった時
    <Shift + Fn + F6>　（IDEが使っている箇所全部見て、）名前を変えたことによるバグが起こらない形で変更箇所ををいっぺんに変えてくれる（クラスや各ファイルも全て一緒に変更してくれる）
    <右クリック → リファクタリング → 名前の変更>　でもOK！というか、キーノードショートカットを使わなくてもいいから、IDEのリファクタリング機能を使って変更を行ってほしい
        手修正をするとバグが起こりやすいので、IDEの機能をフル動員して使った方が良い

        13:32～　いっぺんに変えたいなーって時（マルチカーソル）（名前の変更時ではない時）
    <Alt + j>　カーソルを増やせる　←これのやり方はよく分からなかったので、下のやり方のほうがいいかも！
    <Alt + カーソル（タッチパッド）>　Altキーを押しながらカーソル移動でできる　上よりもこれのほうが使う

        16:30～　コードを書く場所が大きくしたり小さくするのをショートカットキーでやる場合
    <Alt + 数字の1>　プロジェクトツールウィンドウの表示・非表示　←使う人はめっちゃ使う
        テンキーと数字キー（キーボードの上のほうについている数字）は別物　

        17:35～　あれどこにあったっけ？？って時に真っ先に使うもの
    <Ctrl + Shift + f>　複数のファイルから検索することができる
    <検索 → 複数ファイル内検索...>
    ↑　これらは別物　↓
    <Shift + f>　指定したファイルのみ検索することができる
    <検索 → 検索...>
        ※ファイルマスクを指定するとファイルを指定することができる（指定しなければ全部横断的に見てくれる）

        19:15～　過去にコピーしたものを呼び出したいなーって時に使う（使う人はめっちゃ使う）
    <Ctrl + Shift + v>　複数コピーしておいて一気にペーストすることができる（Max 100　だと思われる）
    <編集 → 貼り付け → 履歴から貼り付け>　これがどこにあるかを忘れてしまう...

        20:54～　エラー出ちゃったときにどうしたらいいかの解決策教えてくれないかなーって時に使える
    <Alt + Enter>　便利機能の呼び出し　（クイックフィクス）

        22:13～　ルールに沿ってコードをきれいにしてくれる
    <Ctrl + Alt + L>　（コードフォーマッター）

        23:00～　Intellijの新しい設定
        ・コードの成形
        ・インポートの最適化
        ・明確なインポートをオンザフライで追加する　今回<Ctrl + S>でコードをきれい（自動成型）にしてくれている
        ・オンザフライでインポートを最適化する
        (これか分かんないけど)インポート系は使っていないimport文を今までは灰色になっていたが設定することにより消してくれるし、勝手に生成してくれる

        26:10～　変数の抽出したい時に使える
    <Ctrl + Alt + V> これはめっちゃ使うらしい
    <右クリック → リファクタリング → 変数の導入>　これでも可能
        とりあえず処理を連続で書きたいときがある
        　→　足し算してみてそれを出力してみようかなーってなる
        int number1 = 3;
        int number2 = 5;
        System.out.println(number1 + number2);
        　→　と書いてみて、「動いたわー！」ってなる
        　→　このままnumber1 + number2って分かりずらいな...ってなった時によく使うらしい
        　※実行した後のリファクタリングのために使う
      ↑　反対の動きが出来る　↓
    <Ctrl + Alt + N>
    <右クリック → リファクタリング → 変数のインライン化>　

        29:03～　例えばGreetingっていうクラスの中身が見たいぞって時に使う
    <Ctrl + B>　宣言のジャンプ　よく使うらしい（今現段階ではあまり使わないけど）
        クラスだけでなくメソッド先（メソッドの中）にも行くことができる
        クラス数が多くなっても安心

        30:40～　interfaceで宣言した実装クラスに飛ぶことができる
    <Ctrl + Alt + B>　実装クラスへジャンプする

        32:10～　変数を使われているところへジャンプ　知っておくと便利
    <Ctrl + Alt + Fn + F7>
        幼いといけないキーボードが多すぎて右クリックでやることも多々ある

        33:25～　メソッドの抽出
    <Ctrl + Alt + M>　選択したコード部分を新しいメソッドとして切り出し、リファクタリングできる

        37:23～　フィールドとして宣言に切り出す
    <Ctrl + Alt + F>　あまり使わないらしい（人による）

        38:15～　型の継承階層を表示する
    <Ctrl + H>　今の学習段階だとそんなに使わないと思う
        エラーが出たときに使う。みたいなことを言っていたがよく分からない

        40:16～　呼び出し先を調べる
    <Alt +Ctrl + H>　そのメソッドが誰に呼び出されているか（呼び出し先）を見に行く

        41:40～　シグネチャの変更　
    <Ctrl + F6>　メソッドの戻り値<型> メソッド名(メソッドの引数)　を含めたものをシグネチャと言う
        複数の変更（名前を変える・型を変える・引数を変えるなど）を一気に変えるときにこれを使用すると便利
    <右クリック → リファクタリング → シグネチャの変更> ショートカットキーよりもこっちでやるのが多いらしい
     */

    // 12_Javaの命名規則と学習方法
    // <課題>　36:30～　
    // 図書管理システムを作る
    // 書籍（Book）を管理する情報（タイトル、著者、番号）を持つオブジェクト（クラス）を作って、そこに情報を格納してください。
    // 図書館（Library）みたいなものを作って、そこにBookをListで持つようなものを保持する。
    // mainメソッドからこのLibraryクラスに対して検索ができるようにする。Libraryクラスは書籍検索の機能を持つ　※これはヒントあり。
    // タイトル検索、著者検索、番号検索メソッドをLibraryに持たせる。
    // それをmainメソッドから実行して、実行結果をコンソールに出力する。
    // ヒント：38:40～

    /*
    「マッチングアプリ管理システム」を作作る
    ユーザー（User）を管理する情報（名前、年齢、趣味、性別）を持つオブジェクト（クラス）を作って、そこに情報を格納してください。
    マッチングアプリ（MatchingApp）クラスを作り、UserをListで持つようにしてください。
    mainメソッドからこのMatchingAppクラスに対して検索ができるようにしてください。MatchingAppクラスはユーザー検索の機能を持ちます。
    名前検索、年齢検索、趣味検索、性別検索のメソッドをMatchingAppに持たせてください。
    それをmainメソッドから実行して、実行結果をコンソールに出力してください。
     */

    Library library = new Library();

    library.addBook(new Book("ハリーポッター", "j.k.ローリング", 1));
    library.addBook(new Book("星の王子様", "サン=テグジュペリ", 2));
    library.addBook(new Book("ノルウェイの森", "村上春樹", 3));

    // タイトル検索
    Book foundByTitle = library.searchByTitle("ハリー・ポッター");
    if (foundByTitle != null) {
      System.out.println(
          "タイトル検索結果: " + foundByTitle.getTitle() + " / " + foundByTitle.getAuthor());
    }

    // 著者検索
    List<Book> foundByAuthor = library.searchByAuthor("村上春樹");
    for (Book book : foundByAuthor) {
      System.out.println("著者検索結果: " + book.getTitle());
    }

    // 番号検索
    Book foundByNumber = library.searchByNumber(2);
    if (foundByNumber != null) {
      System.out.println("番号検索結果: " + foundByNumber.getTitle());
    }

    /*
  <Java　命名規則>　01:00～　　検索してみると色々なことが書かれている
    日本語、英語、アンダーバーとかいろいろな文字列が使える（メソッド名やクラス名を日本度にすることも可能）
      →　最近はグローバルなので、メンバー全員が日本語を読める人が集まっていることのほうが少ない
      →  コメントぐらいは日本語でOK
    先頭文字には数字使えない
      →　（クラス名とかメソッド名とか）変数名も無理
    文字数制限はない
    大文字と小文字は区別される

  <Pascal, Camel, Snake>　04:35～
  <Pascal(パスカル)>
      →　クラス名によく使われる
    先頭大文字。一般的な英語の書き方と一緒
    Main, Greeting
  <Camel(キャメル)>
    先頭は小文字。言葉の区切りから大文字
    メソッド名や変数名に使われることが多い
    sayHello
    numberSecond

  ※<これから先真っ先に指摘されること> 06:00～
  プログラムを書いていってレビューとか投げたときに一般的なJava言語で使われる記法や命名ルールから逸脱していた場合真っ先に指摘される
  （現場でもすごく言われる部分である）
  正直ちょっとしたことじゃん！って思うかもしれないが、自分の子供に適当な名前を付けますか？ということを常に考えること。
  　→　「大文字・小文字」の違いは日本語でいう「ひらがな・カタカナ」を間違えていてもいいんですか？という感じ
  　→　戸籍とかにも載っているぐらい大事なものに対して適当な扱いをする人に大切なもの任せられますか？（ = 大切なプログラミングコードを任せられますか？）
  絶対守らないといけないわけではないが、なるべく守るようにしないといけないもの

  <フィールド名、変数名>　09:53～
   （それが何者かを表すいわゆる）名詞的なもの
    number, message, name, xxList
    　→　このような分かりやすい名前を付けることが多い

  <メソッド名>　10:30～
    →　何をする者なのか。そのクラスが持っている単一の責任の中で提供する機能のこと。　
    →　Q,あなた○○できますか？A,出来ます！
    動詞（がベース）
    say, greet, print, printMessage
    getXXX, setXXX, countXXX　（一般的なもの）
    　→値を取得する時とか

  <定数>　12:58～
    →　finalを使って定義する変数のことを定数という
    private static final String NAME = "kouji Enami";
    　→　↑　のNAMEの部分が定数
    　→　finalと書かれていたら一度設定した値を変更することができない（無理やりの変更はできるけどマジでよっぽどない）
    　→　staticを付けることが多い（staticを付けたくない理由はインスタンスを生成しなくても使えちゃうのが怖いため、だけどfinalのためどこから使われても変更されることがない）
    フィールドとの違いは固定値であること。絶対に変更しないこと。
    全て大文字。一部Snakeケースを使う場合もある。
    　→　_を付けることをsnakeケースという。全部大文字はシンプルに読みずらいため。
    FULL_NAME

  <真偽値、booleanを使うときの名前>　11:44～
  　→　「あるか・ないか」「存在する・しない」「はい・いいえ」
    isXXX, hasXXX
    　→　isXXXはめっちゃ使う！、hasXXXはあんまり使わないかも
    isNumber(→ 数値かどうか）, isEmpty, isNull, hasName (→ 名前があるかどうか), hasChange (→ 変化したか)

  <命名の仕方>　16:20～
    適当な名前をつかないこと。誰かに使われることを想定する。
    誰にも絶対に使われない。誰にも見せない。そういったものであれば適当でもいい。
    　→　適当なものは適当につけないといけない。
    　→　本来なら「private」とかにして外部から一切使えないようにしたいんだけど、プログラム（設計）の実装の都合上、使えるようにしなければならない
    changeXXXXYYYYZZZZIIIIAKAKAK(String,String,String,List,Int,List,Map)
    　→　何を変更するかも分からないぐらいわざとやる。これを見たときに絶対に使いたくない！と思えるように苦肉の策としてこうやって付けてみる
    　→　名前が与えるインパクトが強いからこそ出来る技。名前を見て先入観を持ってしまうため、わざと触りたくないような名前を付ける。
    長くなってもいい。名前はコンパクトが一番。短く正確に伝わるものが理想。
    だが、これは難易度が高い。なので長くていい。正確であることが大事。短くするのはあと。
    　→　何よりも正確に書くことが大切。
    a, b, cこういう適当な名前はばるべく付けない。正確に書くこと（※for文で使われているような、カウンター（数を数えるような奴）はiとかjとかで書いて問題ない。なんだったらこれが良い）

  <学習方法>　22:50～
    1つ1つ理解しながら進める or なんとなく理解した状態で次にどんどん進む
    　→　出来れば「なんとなく理解した状態で次にどんどん進む」ですすめていった方が良い
    　→　現役の人でもプログラムの動きを一つ一つ理解していない（プログラムが書ける人のほうが大切）とりあえず動けばOKはやりすぎだけど、多分これでこうだから動いたんだろう！で次にいって良い
    モチベーションの上げ方
    前提としてモチベーションに頼らない。（当たり前だが、お仕事なので納期はある）
    　→　現場に出てやる仕事の内容を先にやっている。のに、モチベが上がらないので仕事やらないです。で、やらないことはまずないと思う。だからこと、モチベが上がらないから...と言わないように
    　→　学習習慣をしっかりと作ること
    とは言っても、自分に対する報酬を設定してみると良い。
    ①ご褒美を上げる（お菓子屋お酒でもＯＫ）。
    ②罰ゲームを作る（達成できなかったら○○をしないといけない）。
    ①、②両方とも自分のさじ加減で変えることが出来てしまうので、他人に委ねる。他人の目が入るだけで全然違う。
    仕事の延長して学習する。ルール化・ルーティンを設ける。　→　学習を継続するために必要。
     */

    // 13_デバックの実践
    // 自身で今まで作ってきたものに対してデバックを実践して、値がどうなっているか見てみる。
    //ステップオーバー、ステップイン、ブレイクポイントを貼る、というのを実践する
    // 総集編の課題を進める
  }
}