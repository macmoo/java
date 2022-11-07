package jp.wings.pocket.chap3;

class SinSample{
	public static void main(String args[]){

		double a = 90;

		// sinを求める
		double s = Math.sin(Math.toRadians(a));
		// asinにより角度を求める
		double as = Math.toDegrees(Math.asin(s));

		System.out.println(as);

	}
}