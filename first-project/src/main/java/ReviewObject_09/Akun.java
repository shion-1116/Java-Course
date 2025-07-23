package ReviewObject_09;

class Akun implements Rules {

  @Override
  public void values() {
    System.out.println("アウトドア派　趣味：登山");
  }

  @Override
  public void income() {
    System.out.println("年収：500万円ほど");
  }

  @Override
  public void height() {
    System.out.println("身長：約180cm");
  }

  @Override
  public void name() {
    System.out.println("名前：佐藤　A");
  }

}
