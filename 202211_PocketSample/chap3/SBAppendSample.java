package jp.wings.pocket.chap3;


public class SBAppendSample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb.append('？')); // 結果:Java?

		System.out.println(sb.append(123)); // 結果:Java?123

		char[] ch = {'あ','い','う'};
		System.out.println(sb.append(ch)); // 結果:Java？123あいう

		CharSequence cs= new String("かきく");
		System.out.println(sb.append(cs)); // 結果:Java？123あいうかきく
	}
}
