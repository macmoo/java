package jp.wings.pocket.chap3;

//文字列内を検索します。
public class STSearchSample {
	  public static void main(String[] args) {
	    String str = "Javaは楽しいですか？Javaマスターになりましょう。";
	    System.out.println("5番目の文字：" + str.charAt(5));
	    System.out.println("最初に「Java」が現れる位置：" + str.indexOf("Java"));
	    System.out.println("最後に「Java」が現れる位置：" + str.lastIndexOf("Java"));
	  }
	}
