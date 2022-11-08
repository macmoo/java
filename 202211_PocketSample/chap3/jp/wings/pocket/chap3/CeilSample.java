package jp.wings.pocket.chap3;

//切り上げ／切捨て／四捨五入を求める
class CeilSample{
	public static void main(String args[]){

		double a = 5.43d;

		System.out.println("切り上げ：" + Math.ceil(a));
		System.out.println("切り捨て：" + Math.floor(a));
		System.out.println("四捨五入：" + Math.round(a));

	}
}