package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import java.time.LocalDateTime;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

    public static void main(String[] args){
//        // 課題　04_変数と値の取り扱い
//        // 文字列結合と数値計算結果の統合をして
//        // 自分の名前　＋　自分の年齢　＋　歳です。が出力されるようにする。
//        String name = "星川詩音";
//        int age = 10 + 11;
//        System.out.println(name + "は、" + age + "歳です。");

        /*
        履歴を戻すことができる
        Windowsは「Ctrl　＋　Z」を同時押しで戻すことができる

        ・int型　整数
        ・String型　文字列
        ・double型　小数点まで出せる
        何が起こるかを想像しながらプログラミングを書くと成長が早くなる（ちょっとしたコツ）
        ・int型で　+　をすると足し算をしてくれる
        int number1 = 5;
        int number2 = 10;
        これを表示させると15となる
        ・String型で　+　をすると文字列結合をする
        String number3 = "5";
        String number4 = "10";
        これを表示させると510となる
        ・double型を使って（小数点第一位を）四捨五入したい！となったら
        double num5 = 5;
        double num6 = 10;
        System.out.println(Math.round(num5 / num6));
        これを表示させると1となる
        ・他にも色々な計算の仕方があるよ（中央値とか平均とかを計算したい！とか、調べてみたらなんでも出てくる）

        ちなみに、
        System.out.println(num5 + num6);  //足し算
        System.out.println(num5 - num6);  //引き算
        System.out.println(num5 * num6);  //掛け算
        System.out.println(num5 / num6);  //割り算（あまりを出さない　整数部分のみ）
        System.out.println(num5 % num6);  //割り算（あまりのみ）

        変数は途中で変えることができる（詳しくは04_変数と値の取り扱いの23:00あたり～見てみること）
         */

//         //課題　05_基本型_標準API_分岐処理
//         //条件式を使った課題
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
//        LocalDateTime today = LocalDateTime.now();   // ここで今の日付と時間を取得する
//        if (today.getDayOfMonth() == 25){   // もし、今日が２５日だったら
//            System.out.println("本日は締め日です");   // これを表示させてください
//        } else {   // それ以外だったら
//            System.out.println("今日は普通に働く日です");   // こっちを表示させてください
//        }
//        // 課題③　日付を使って、朝７時になったら起きる時間です。夜２３時過ぎたら寝る時間です。と表示させる
//        LocalDateTime time = LocalDateTime.now();   // 今の日時を取得している
//        int hour = time.getHour();   // さらに今の”時”のみを取得している
//        if (hour == 7) {   // 今の時が７だった場合のみ
//            System.out.println("起きる時間です。");   //このように表示させる
//        } else if (hour >= 23){   // 今の時間が２３時より遅かったら
//          System.out.println("寝る時間です");   //このように表示させる
//        } else {   //それ以外だったら
//            System.out.println("今は" + hour + "時です。");   //今の時を表示させる
//        }

        /*
        日付を扱うのは、　（動画では、27:50～）
        ・LocalDate
        ・LocalTime　時間を取得できる
        ・LocalDateTime　自分のPCやサーバー上の日付や時間を使う
        ・zonedDateTime　指定したゾーンの日付や時間を使うことができる（グローバルに使うことができる）
        などがある。じゃあどんな時に使うのかというと、
        ・LocalDateTime date1 = LocalDateTime.naw();
        ・ZonedDateTime date2 = ZonedDateTime.now();  //これだとローカルと同じように表示されてしまうので（例えば）カナダとかアメリカとか自分が表示させたい地域を指定して使用する
         */

        /*
        エラーメッセージを見るとしんどくなってしまう場合がこれから先あると思うが、理由まで書いて○○が出来ていない。と教えてくれるからそこまで落ち込まないように。
        何だったら↓
        「こいつ言ってくるな！やるな！ここまで自分に言ってくる奴はじめてだわ！」っていうぐらいのスタンスでいること

        基本（データ）型
        ・String name = "ホシカワシオン";
        Stringよりも小さい単位がある↓
        char a = "あ";　というのがある。　がプロのエンジニアでもなかなか使わないので記憶から消しても良い！
        ・int number = 12345;　「-」も使えるよ。これは整数なので小数は使えない
        ・double num = 100.23;　小数を使いたいときに書くよ
        ・boolean boll;　これでtrueとfalse（yes、no）をすることができる
        ラッパー型
        ・integer num = 10;
        ・Double num = 100.2;
        ・Boolean boll = true;

        「基本型」と「ラッパー型」の違いは何？
        null　が使えるか使えないかの違い。22:30～　詳しく説明している。今の私が聞いてもあんまり理解が出来なかったので分からなくなったらネット検索か説明を聞いてほしい

        他にもあるよ
        byte　　-128～127まで
        short　１万ちょいぐらいだった気がする
        byteとshort　はあんまりコードに使っていない　→　今はそんなにデータの大きさを考えなくても良くなったので使わない。昔書いたコードには使われていたりする

        ・もっと大きい数字（銀行とか）を扱いたいときは下記のコードを書く　が、すんごい大きな数字を扱う場合以外は使わないように（16:00～ぐらいに詳しく説明している）
        BigDecimal number1 = BigDecimal.valueOf(10);
        BigDecimal number2 = BigDecimal.valueOf(100);
        System.out.println(number1 + number2);　はエラーが出てきてしまう。
        System.out.println(number1.add(number2));　これじゃないといけない。
         */


        // 課題 06_繰り返し処理_配列_ListとMap_switch式
        // 生徒名みたいな文字列のリストを作ってください。
        // リストの数は10個以上
        // リストに入っている文字が3文字以上のものを表示する。
        // このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。
        List<String> studentList = List.of("佐久間", "佐々木", "山田", "松島", "加藤", "鈴木", "田中", "渡辺", "山本", "中村", "星川");
        for (String name : studentList) {
            if (name.length() >= 3) {
                System.out.println(name);
            }
        }

        // 課題②
        // Mapを作ってください。生徒名と番号の組み合わせ（1,"江並"）みたいな。
        // Mapの要素は10個以上。
        // Mapの中の番号が偶数のものをMapから削除する。
        // 上記の処理を行う繰り返し処理を実装してください。
        // 削除した状態のものを出力してください。

        // 「番号（整数）」と「名前（文字）」をセットで管理する箱（studentNameMap）を作る
        Map<Integer, String> studentNameMap = new HashMap<>();
        // そのぞれの番号に対応する名前を、studentNameMapに登録している。例えば「1番は佐久間さん」という感じで
        studentNameMap.put(1, "佐久間");
        studentNameMap.put(2, "佐々木");
        studentNameMap.put(3, "山田");
        studentNameMap.put(4, "松島");
        studentNameMap.put(5, "加藤");
        studentNameMap.put(6, "鈴木");
        studentNameMap.put(7, "田中");
        studentNameMap.put(8, "渡辺");
        studentNameMap.put(9, "山本");
        studentNameMap.put(10, "中村");

        // 削除退場のキーを一時的に保存　　これから消したい番号（偶数の番号）を一時的に入れておくためのからの箱（リスト）を作る
        List<Integer> removeKeys = new ArrayList<>();
        for (Integer key : studentNameMap.keySet()) { // studentNameMapに入っているすべての番号（key）を順番に取り出す
            if (key % 2 == 0) {  // その番号が偶数（2で割って余りが0）なら、removeKeysの箱に入る
                removeKeys.add(key);  // JavaのMapはdeleteは使うことができないため、削除したいときはremoveを使用するように
            }
        }
        for (Integer key : removeKeys) {  // removeKeysに入っている番号を順番に取り出し、その番号に対応する名前をstudentNameMapから消す
            studentNameMap.remove(key);
        }
        // 結果の表示
        System.out.println(studentNameMap);

        /*
        「1+2+3+4+5+6+7+8+9+10」をやりたいです！となった時にこれを毎回書くのはめんどくさい
        System.out.println(1+2+3+4+5+6+7+8+9+10); ← じゃあこれが100までだったら？
        繰り返したかったらこれ！for文
        int sum = 0;
        for(int i = 0; i <= 10; i++) {　　　今は自分で値を入力しているが、外部から入力されたものを代入しようとする場合は「upperNumber」を i <= 10　この10の部分に代入すればOK！
          sum += i;　（これは　sum = sum +i　が省略された形）
        }
        System.out.println(sum);

        配列（その型の連続した物）の基本の形　String型もint型もできる
        ・String[] students = new String[]{};　　これで空っぽの配列になる
        ・int[] students = {1,2,3,4,5,6};

        様々なシステムを作っていくときによく使うのは文字列の連続した要素
        String[] studentsNames = new String[] {"江並","井上","佐藤","加藤","田中"};　　詳しくは、10:00～
        この文字列の追加はとてもめんどくさい。配列を作った時点でこの配列に追加が出来なくなる
        だけど、追加したいときは必ず来る。そんな時は、上の変数よりも大きな配列を作らないといけない　10:00～
         → 配列に要素を追加したい場合は、List<>（インターフェース）というのを使っていく

        List<String> studentNameList = new ArrayList<>();　11:30～
        上記のコードを詳しく説明すると、↓　　動画で言うと13:20～
        Listの中には機能がない。例えば「studentNameList」の中に何か追加しても具体的にどういった処理をするのかが定義されていない。それを定義したのが、「ArrayList<>()」である
        「動物という定義があります。動物という定義で全部表現できますか？」答えは無理！なぜなら「犬」「猫」「それ以外」とあり、さらに犬の中にも柴犬、ブルドック、ラブラドールと様々な種類がいて、
        その抽象的（総括的）なのを表すのに動物や、犬という表現を使う。それが今回で言う List の役割（あくまで連続する要素であることを表している）
        さらに要素の追加や削除を簡単にできるようにするために ArrayList<> これがある

      ＜配列＞
        String[] studentNames = new String[] {"江並","井上","佐藤","加藤","田中"};
        System.out.println(studentNames);  // 配列要素をそのまま表示すると配列要素しか出てこない
        → System.out.println(Arrays.toString(studentNames));  // これでやっと配列の中身を表示してくれる
      ＜List＞
        List<String> studentNameList = Arrays.asList(studentNames);
        → List<String> studentNameList = List.of("江並","井上","佐藤","加藤","田中");  // このように書いて表示することも出来る
        System.out.println(studentNameList);  // ListはListの中身を出してくれる
      ＜Map＞詳しくは17:50～
        Map<Integer, String> studentNameMap = new HashMap<>();  // Listと同じで一番最初のMaoはインターフェース　そのため = の後にnew HashMap<>()ト記述
        Map<Integer, String> studentNameMap = Map.of()  // keyと値の組み合わせを連続で実装していくことが可能
      ＜拡張for文＞21:30～
        リストの要素の数だけ、配列の数だけループを回したい！というときに拡張for文を使用する
        for(String name : studentNameList) {
        System.out.println(name);
        }  これは例だがこんな感じで使っていく　動画で説明しているが、拡張for文の中にif文を入れて細かく条件を書くことも出来るがとてもコードが読みづらくなってしまう
      ＜switch文の使い方＞
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
        ↓＜switchケース文＞というのがある↓
        int number = 10;
        switch (number) {
          case 1 -> System.out,println(1);
          case 2 -> System.out,println(2);
          case 3 -> System.out,println(3);
          default -> System.out.println(10);
        }   このように書ける

        while{
        }　　という文法があるが、実際の現場では基本使わないためあまり気にしないように
         */




    }
}