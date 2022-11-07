package jp.wings.pocket.chap2;

import java.util.function.DoubleBinaryOperator;

public class FunctionalInterfaceSample {

	@FunctionalInterface
	interface BMI {
		//  2つのdoubleの引数、doubleの戻り値の仮想メソッド
		double calc(double w, double h);
	}

	public static void main(String[] args) {

		// ラムダ式での実装
		BMI bmi = (w, h) -> { return w / (h * h);	};

		// 定義済みのDoubleBinaryOperatorを使った場合
		DoubleBinaryOperator d = (w, h) -> {
			return w / (h * h);
		};

		System.out.println("BMI= " + bmi.calc(78d, 1.7d));
		System.out.println("BMI= " + d.applyAsDouble(78d, 1.7d));
	}
}
