package jp.wings.pocket.chap3;


public class SBReplaceSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Javaは楽しい");
		System.out.println(sb.replace(5, 8, "難しい！")); 
	}
}
