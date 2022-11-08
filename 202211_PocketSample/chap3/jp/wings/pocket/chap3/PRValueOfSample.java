package jp.wings.pocket.chap3;

//Boolean型とDouble型のオブジェクトを生成します。
public class PRValueOfSample {
	public static void main(String[] args) {
		Boolean bl = Boolean.valueOf("true");
		Double db = Double.valueOf("9.13");
		System.out.println(bl.toString());
		System.out.println(db.toString());
	}
}
