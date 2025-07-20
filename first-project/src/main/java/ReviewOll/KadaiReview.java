package ReviewOll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class KadaiReview {

  public static void main(String[] args) {
    // 今までの課題の振り返り

    /* 課題　04_変数と値の取り扱い
        文字列結合と数値計算結果の統合をして
        自分の名前　＋　自分の年齢　＋　歳です。が出力されるようにする。*/
    System.out.print("04_課題　");
    String name = "ほしかわしおん";
    int age = 10 + 11;
    System.out.println(name + "は、" + age + "歳です。");

    //05_基本型_標準API_分岐処理
    /* 課題①
         条件式を使った課題
         文字列型を使って、変数を２つ用意する。その変数には苗字と名前を入れてください。
         条件は苗字の文字数が２文字以上の場合　かつ　名前の文字数が２文字以上の場合はtrue。
         条件がtrueの場合はその名前を表示する。
         条件がfalseの場合は条件に一致しませんでした。という文言を表示する。 */
    System.out.print("05_課題①　");
    String myoji = "ホシカワ";
    String namae = "シオン";
    if (myoji.length() >= 2 && namae.length() >= 2) {
      System.out.println("条件に一致したため表示します。「" + myoji + namae + "」です。");
    } else {
      System.out.println("条件に一致しませんでした。");
    }

    /* 課題②
        日付を使って、本日の日付が25日だった場合、本日は給料日です。と表示させる */
    System.out.print("05_課題②　");
    // ①今の日付・時間を取得する
    LocalDateTime today = LocalDateTime.now();
    // ②で、今日が〇日だったら...と続ける。
    if (today.getDayOfMonth() == 25) {
      System.out.println("本日は給料日です。");
    } else {
      System.out.println("本日は給料日ではありません。");
    }

    /* 課題③
        日付を使って、朝７時になったら起きる時間です。夜２３時過ぎたら睡眠中です。と表示させる */
    System.out.print("05_課題③　");
    LocalDateTime time = LocalDateTime.now();
    int hour = time.getHour();
    if (hour == 7) {
      System.out.println("起きる時間です。");
    } else if (hour >= 23 || hour <= 6) {
      System.out.println("睡眠中です。");
    } else {
      System.out.println("活動時間です。");
    }

    // 06_繰り返し処理_配列_ListとMap_switch式
    // ここで使うリストを毎回考えるのはめんどくさいので、「"佐久間", "佐々木", "山田", "松島", "加藤", "鈴木", "田中", "渡辺", "山本", "中村"」を使って
    /* 課題①
         生徒名みたいな文字列のリストを作ってください。
         リストの数は10個以上
         リストに入っている文字が3文字以上のものを表示する。
         このリストをループさせて繰り返し処理を実装し、その中で上記条件を満たすものだけ表示する。 */
    System.out.println("06_課題①　下に表示されているはず！　");
    List<String> studentList = List.of("佐久間", "佐々木", "山田", "松島", "加藤", "鈴木", "田中",
        "渡辺", "山本", "中村");
    for (String studentName : studentList) {
      if (studentName.length() >= 3) {
        System.out.println(studentName);
      }
    }

    /*  課題②
         Mapを作ってください。生徒名と番号の組み合わせ（1,"江並"）みたいな。
         Mapの要素は10個以上。
         Mapの中の番号が偶数のものをMapから削除する。
         上記の処理を行う繰り返し処理を実装してください。
         削除した状態のものを出力してください。 */
    // ①「番号」と「名前」をセットで管理する箱を作成
    // ② そのぞれの番号に対応する名前を登録
    // ③ これから消したい番号（偶数の番号）を一時的に入れておくための空の箱（リスト）を作る
    // ④ ループ処理で②に入っているすべての番号（key）を順番に取り出す（Mapに登録されている全てのキーの集合を取得するメソッドを使用する）
    //      ⑤ ネストして④が偶数なら③の箱に入れる
    // ⑥ ループ処理で③の中身に入っている番号は、Mapから削除する
    // ⑦ 結果の表示
    System.out.println("06_課題②　");
    Map<Integer, String> studentMap = new HashMap<>();
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

    List<Integer> removeKeys = new ArrayList<>();
    for (Integer key : studentMap.keySet()) {
      if (key % 2 == 0) {
        removeKeys.add(key);
      }
    }
    for (Integer key : removeKeys) {
      studentMap.remove(key);
    }
    System.out.println(studentMap);
    /*
     上記のやり方か
     ③ 以降がこのやり方になる
    for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
      if (entry.getKey() % 2 != 0) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
      }
    }   このどちらか
     */

    /*　課題③  AI生成で作った課題
         [65,175,男,田中]、[45,160,女,佐藤]、[80,185,男,鈴木]が格納された文字列型の多次元配列を用意し、
         while文とfor文の両方を同時に使用して次のように全て出力してください。
         「田中君は男性で身長175センチ、体重65キロです！」
         「佐藤さんは女性で身長160センチ、体重は秘密です！」
         「鈴木君は男性で身長185センチ、体重80キロです！」　  */
    System.out.println("06_課題③　");
    String[][] people = {{"65", "175", "男", "田中"}, {"45", "160", "女", "佐藤"},
        {"80", "185", "男", "鈴木"}};
    int i = 0;
    while (i < people.length) {
      String str = "です！」";
      for (int j = 0; j < 4; j++) {
        if (j == 0) {
          if (people[i][2].equals("女")) {
            continue;
          }
          str = "キロ" + str;
        }
        if (j == 1) {
          str = (people[i][2].equals("女")) ? "センチ、体重は秘密" + str : "センチ、体重" + str;
        }
        if (j == 2) {
          str = "性で身長" + str;
        }
        if (j == 3) {
          str = (people[i][2].equals("女")) ? "さんは" + str : "君は" + str;
        }
        str = people[i][j] + str;
      }
      str = "「" + str;
      System.out.println(str);
      i++;
    }

    // 07_StreamAPIとラムダ式
    /* 課題①
          文字列のリストを作って下さい。要素数は10個。
          その文字列に対して、文字数が2以上のものを抽出して、文字列に変換をしてください。区切り文字はカンマ（,）で行ってください。
          その文字列を出力してください。 */
    System.out.print("07_課題①　");
    List<String> animal = List.of("inu", "neko", "p", "koara", "u", "h", "inko", "pengin", "risu",
        "kapibara");
    String kekka = animal.stream()
        .filter(animalName -> animalName.length() >= 2)
        .collect(Collectors.joining(","));
    System.out.println(kekka);

    /* 課題②
          数値のリストを作ってください。要素数は10個。
          その数値の中の奇数のものだけを抽出して、平均値を出してください。
          その平均値を出力してください。 */
    System.out.print("07_課題②　");
    List<Integer> randomNum = List.of(23, 87, 45, 12, 9, 56, 78, 34, 65, 2);
    double randoms = randomNum.stream()
        .filter(number -> number % 2 == 1)
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0);
    System.out.println(randoms);

        /* 課題③
              ChatGPTなどの生成AIを使って、Stream APIの基礎的な課題を一つ作ってもらってください。
              それを実際に実践してみてください。
                  10個の文字列からなるlistを作成してください。
                  そのリストの各要素を大文字に変換し、新しいlistとして出力してください。 */
    System.out.print("07_課題③　");
    List<String> japanName = List.of("sato", "suzuki", "takahashi", "tanaka", "ito", "watanabe",
        "yamamoto", "nakamura", "kobayashi", "kato");
    List<String> omoziName = japanName.stream()
        .map(names -> names.toUpperCase())
        .toList();
    System.out.println(omoziName);

    // 08_入出力処理と例外処理
        /* 課題①
              入出力を実際に実装して、作ったファイルに文章を追加する。
              その作ったファイルを削除してもう一度実行すると例外になるので、その例外をキャッチして、例外処理を行う。 */
    System.out.print("08_課題①　");
    Path path = Path.of("Singing.txt");
    try {
      Files.writeString(path, "歌うの楽しい！", StandardOpenOption.APPEND);
      System.out.println("Singing.txtに記述しました");
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("例外が発生しました。");
    }

        /* 課題②
              catchした中でさらにファイルに書き込もうとして例外になった場合、どうなるのかを確認してください。 */
    System.out.print("08_課題②　");
    Path xxx = Path.of("xxx.txt");
    try {
      Files.writeString(xxx, "catchに例外処理書いてみる", StandardOpenOption.APPEND);
      System.out.println("xxx.txtに記述しました");
    } catch (IOException e) {
//      Files.writeString(xxx, "どうなるかの確認");
      e.printStackTrace();
      System.out.println("例外が発生しました。");
    }

    // 09_オブジェクト指向について
    // 課題
    // 今回実践したものを一通り実装してみてください。
    // Greeting　と　Speakingは使わずに皆さんが考える抽象的なinterfaceとその実装を組み合わせて作ってみてください
    // interfaceの実装を2つ以上作ってください。　（今回エナミさんはGreetingを作っている）
    // 継承（extends）を使ってみてください。上記で作った２つの実装クラスのどちらかを継承してクラスを作って実際にメソッドを呼び出してみてください。
    // メソッド呼び出しは親子もどちらとも呼び出してみてください。
    // Greeting1は親、Greeting2は子、Greeting3は孫（子は親の機能を呼び出せるが、親は子の機能をよびだすことは出来ない）
    // （ifやListを使ったりしてもOK　）
    System.out.println(
        "09_課題　Objectパッケージにある。");
    /*  課題を解いていくためのヒント
      ①　何かができることを決めるルールブック
      ②　実装クラスを２つ作る
      ③　継承クラスを作る
      ④　メインクラスに必要事項を書き込む
     */

    // 10_正規表現
    System.out.println("10_課題");
    // 課題①正規表現をたくさん使う
    // Listにランダムな文字列（色々自分で入れてもいいし、生成AIとかにお願いしてもいい）を30個ほど入れてみてください。
    // その文字列のリストに対して「数字だけを抜き出す正規表現」と「文字だけを抜き出す正規表現」を試してみてください
    // 実際にあっているか確認してみて
    List<String> randomList = List.of("5サI変ムt2なs話", "だ6hよaアねrd", "背t2oがs止aまy",
        "7るiヌ頃tに",
        "I永c遠a8っnてt", "sa言y葉i0t", "Inをev疑3eうr5", "saのyかi5なt", "I願dうo3なnらt",
        "1wa7こnんttなo", "s0a私yがi死t", "Iんt7でsムも", "こhのa5愛rだd", "tけ8oはs8せaめy",
        "itてI残saっn9t", "sてa1咲yいiて4t", "Thま3isすiよsうa", "freにa今kiはng8", "たs5だaこ7dん",
        "soなn私gf0のoこr", "yoの9ugu2音ys", "とI3こ6t8んs", "frなeak6歌ing", "har声dを6to",
        "信s0aじyi9てt", "gいooて0d", "欲bシし4yいe", "ん0ヲS4だoム", "tでeきlる8ヲl",
        "だ9ヌm63け2e");
    System.out.print("①　数字だけ ");
    List<String> numberList = new ArrayList<>();
    for (String numOnly : randomList) {
      String numberOnly = numOnly.replaceAll("\\D+", "");
      numberList.add(numberOnly);
    }
    System.out.println(numberList);

    System.out.print("①　文字だけ ");
    List<String> textList = new ArrayList<>();
    for (String tOnly : randomList) {
      String textOnly = tOnly.replaceAll("[0-9]", "");
      textList.add(textOnly);
    }
    System.out.println(textList);

    // ここから下　↓　は時間が許す限りで問題ない（エナミさんが出している課題とは少し変えている）
    // 課題②　更にそれが出来たら文字を抜き出すときに英数字の大文字だけ抜き出して
    System.out.print("10_②　");
    List<String> upperList = new ArrayList<>();
    for (String uList : randomList) {
      String upperOnly = uList.replaceAll("[^A-Z]", "");
      upperList.add(upperOnly);
    }
    System.out.println(upperList);

    // 課題③　更に更にそれができたら、漢字とひらがなのみにマッチする正規表現を書いて抜き出して
    System.out.print("10_③　");
    List<String> kanjiAndHiraganaList = new ArrayList<>();
    for (String kanHira : randomList) {
      String kanHiraOnly = kanHira.replaceAll("[\\p{Iskatakana}A-za-z0-9]", "");
      kanjiAndHiraganaList.add(kanHiraOnly);
    }
    System.out.println(String.join("", kanjiAndHiraganaList));

    // 課題④　更に更に更にそれが出来たら、日本語と数字以外の文字を抜き出すという正規表現をチャレンジしてみて
    System.out.print("10_④　間違えていませんように");
    List<String> englishList = new ArrayList<>();
    for (String enList : randomList) {
      String englishOnly = enList.replaceAll("[\\p{IsHan}\\p{IsHiragana}\\p{IsKatakana}0-9]", "");
      englishList.add(englishOnly);
    }
    System.out.println(String.join("", englishList));


  }

}
