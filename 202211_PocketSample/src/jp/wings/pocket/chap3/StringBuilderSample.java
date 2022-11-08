package jp.wings.pocket.chap3;

public class StringBuilderSample {
	public static void main(String[] args) {

		String str = "Javaは難しいですか？";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		 CharSequence charSequence = str;
		 StringBuffer sbf = new StringBuffer(charSequence);
		 System.out.println( sbf );
	}
}
