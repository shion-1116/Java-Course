package org.example;

public class Book {

  String title;
  // Bookクラスの「フィールド」（インスタンス変数）
  // ここにBookオブジェクトが持つ「タイトル情報」を保存する場所

  String author;

  int bookNumber;

  public Book(String title, String author, int bookNumber) {
    // 一冊の本事に「タイトル・著者・本の番号」の情報を一セットとし、Bookというコンストラクタを作成したい。
    // こっちのString titleは、コンストラクタの「引数」
    this.title = title;
    this.author = author;
    this.bookNumber = bookNumber;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getBookNumber() {
    return bookNumber;
  }
}
/* 今回の問題を何から始めていけばいいか
1. 問題文から「クラス」を抽出する
問題文に出てくる「名詞」はクラスの候補です。

今回は「Book（書籍）」と「Library（図書館）」が明確です。

2. クラスの「属性（フィールド）」と「操作（メソッド）」を考える
Bookクラスには「タイトル」「著者」「番号」という属性が必要です。

Libraryクラスには「Bookを複数管理するためのリスト」と「検索メソッド（タイトル検索、著者検索、番号検索）」が必要です。
Bookクラスに書いた本の情報を

3. クラスの設計を紙やメモ帳でざっくり書き出す
どんなフィールドやメソッドが必要か、簡単にメモしましょう。

例：Book（タイトル、著者、番号）、Library（List<Book>、検索メソッド）

4. 実際にコードを書き始める
まずはBookクラスから作り、次にLibraryクラスを作ります。

最初は「最低限動くもの」を目指し、あとから必要な機能を追加・修正していきます。

5. Mainクラスで動作確認
LibraryクラスにBookを追加し、検索メソッドが正しく動くかをMainクラスで試します。

 */