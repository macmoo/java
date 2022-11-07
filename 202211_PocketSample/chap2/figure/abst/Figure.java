package jp.wings.pocket.chap2.figure.abst;

// 図形クラス
abstract class Figure
{
	// 面積を求める
	abstract float getArea();
}

// 四角形クラス
class Square extends Figure
{
	float width;
	float height;

	Square( float width, float height ){
		this.width = width;
		this.height = height;
	}

	float getArea() {
		return this.width * this.height;
	}
}

// 円クラス
class Circle extends Figure
{
	float radius;

	Circle(float radius) {
		this.radius = radius;

	}
	float getArea() {
		return this.radius * this.radius * 3.14f;
	}
}

// 三角クラス
class Triangle extends Figure
{
	float base;
	float height;

	Triangle(float base, float height) {
		this.base = base;
		this.height = height;
	}
	float getArea() {
		return this.base * this.height / 2;
	}
}

class FigureDemo {

	public static void main(String args[]) {

		Figure fig; // スーパークラスの宣言

		fig = new Square(2,3);
		System.out.println( "面積：" + fig.getArea() ); // Squarクラスのメソッドが実行される

		fig = new Circle(2);

		System.out.println( "面積：" + fig.getArea() ); // Circleクラスのメソッドが実行される

		fig = new Triangle(2,3);
		System.out.println( "面積：" + fig.getArea() ); // Triangleクラスのメソッドが実行される
	}
}
