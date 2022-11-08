package jp.wings.pocket.chap2;

class FigureSample
{
	float getArea(float a, float b){ return 0.0f; }
}

class SquareSample extends FigureSample
{
	@Deprecated
	public int sample(){ return 0; }

	// 引数の型が異なるためエラーとなる
	//@Override
	double getArea(double a, double b) {
		return a * b;
	}
}

@SuppressWarnings("unused")
public class AnnotationSample1 {

	public static void main(String[] args) {

		// 未使用の警告が抑制される
		int x;
		SquareSample obj = new SquareSample();
		obj.sample();
	}
}
