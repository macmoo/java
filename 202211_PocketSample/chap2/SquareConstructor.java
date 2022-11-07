package jp.wings.pocket.chap2;

class Square2
{
    // フィールド
    float width;
    float height;

    Square2(float width, float height) {
        this.width = width;
        this.height = height;
    }

    // 面積を求めるメソッド
    float getArea() {
        return this.width * this.height;
    }
}


public class SquareConstructor {

	public static void main(String args[]) {

        Square2 sqar = new Square2(10,5);

        System.out.println( "面積：" + sqar.getArea() );

	}
}
