package jp.wings.pocket.chap3;

//絶対値を出力します。
class AbsSample{
	public static void main(String args[]){
		for (int i = -1 ; i < 2 ; i++){
			System.out.println(i + "の絶対値は" + Math.abs(i) + "です");
		}
		for (double d = -1.0 ; d < 1.3 ; d+=1.1){
			System.out.println(d + "の絶対値は" + Math.abs(d) + "です");
		}
	}
}
