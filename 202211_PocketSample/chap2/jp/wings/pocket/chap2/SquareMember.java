package jp.wings.pocket.chap2;

class Square
{
    // フィールド
	float width;
	float height;

	// 面積を求めるメソッド
	float getArea() {
		return this.width * this.height;
	}
}

public class SquareMember{

	public static void main(String args[]) {

		Square sqar = new Square();

		sqar.width = 10;
		sqar.height = 5;

		System.out.println( "面積：" + sqar.getArea() );
	}
}
