package ReviewObject_09;

class Ckun implements Rules {

  // int age;とint ageLimitは「フィールド」と呼ばれる
  int age;
  int ageLimit;

  // public Ckun(int age, int aheLimit){...}　これを「コンストラクタ」と呼ぶ
  public Ckun(int age, int ageLimit) {
    this.age = age;
    this.ageLimit = ageLimit;
  }

  @Override
  public void values() {
    System.out.println("犬より猫派　将来は猫を飼いたい");
  }

  @Override
  public void income() {
    System.out.println("年収：600万円");
  }

  @Override
  public void height() {
    System.out.println("身長：168cm");
  }

  @Override
  public void name() {
    System.out.println("名前：鈴木　C");
  }

  // 年齢を出力するメソッド
  public void ckunAge() {
    System.out.println("年齢：" + age + "歳");
  }

  // 何歳までに結婚したいかを出力するメソッド
  public void ckunAgeLimit() {
    System.out.println("理想：" + ageLimit + "歳までには結婚したい");
  }
}
