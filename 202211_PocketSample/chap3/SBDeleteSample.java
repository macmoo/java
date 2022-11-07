package jp.wings.pocket.chap3;


public class SBDeleteSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb.deleteCharAt(3)); // 結果:Jav
		System.out.println(sb.delete(0,2));     // 結果:v
	}
}
