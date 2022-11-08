package jp.wings.pocket.chap3;

//文字列の長さを取得します。
public class STLengthSample {
  public static void main(String[] args) {
    String str = "壱弐参";

    System.out.println(str.length());

    str = "𩸽𠮟";

    System.out.println(str.length());
    System.out.println(str.codePointCount(0,str.length()));
  }
}
