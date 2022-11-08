package jp.wings.pocket.chap2.figure.intrfce;

interface GetAreable
{
	// 面積を求める
	 float getArea();
}


// 四角形クラス
class Square implements GetAreable
{
	float width;
	float height;

	Square( float width, float height ){
		this.width = width;
		this.height = height;
	}

	public float getArea() {
		return this.width * this.height;
	}
}


class FigureDemo {

	public static void main(String args[]) {

		Square sqa = new Square(2,3);
		System.out.println( "面積：" + sqa.getArea() );
	}
}
