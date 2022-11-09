package jp.wings.pocket.chap2;

public class _GenericWildSample {

	public static void main(String[] args) {
		GenericClass<Number> gc_number = new GenericClass<Number>();
		GenericClass<? super Integer> gc1;
		gc1 = gc_number;	// Integer型か、そのスーパークラスなら代入OK
		gc1.setValue(123);  // 123はint(Integer)型なのでOK
		// gc1.setValue("123");	// 文字列は、コンパイルエラー

		GenericClass<? extends Number> gc2 = new GenericClass<>();
		// gc2.setValue(123); // Numberのどのサブクラスか不明なためエラー

		GenericClass<Integer> gc3 = new GenericClass<>();
		gc3.setValue(123);
		gc2 = gc3;		    // Number型か、そのサブクラスなら代入OK
		// Integer는 Number의 서브클래스

		// gc2.getValue()の戻り値は、Numberかそのサブクラスが保証されるので、
		// コンパイルエラーにはならない
		System.out.println(gc2.getValue().intValue()); // 123
	}
}
