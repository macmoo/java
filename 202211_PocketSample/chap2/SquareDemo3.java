package jp.wings.pocket.chap2;

class Square3 extends Square2
{
	// コンストラクタは継承しないので必要となる
	Square3(float width, float height) {
		// スーパークラスのコンストラクタで初期化
		super(width, height);
	}

	@Override
	public float getArea() {
        return this.width * this.height / 2;
    }
}

class SquareExtends {

	public static void main(String args[]) {

		Square3 sqar = new Square3(2, 3);

		System.out.println( "面積：" + sqar.getArea() );
	}
}
