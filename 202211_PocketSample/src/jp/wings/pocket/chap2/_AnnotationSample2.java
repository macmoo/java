package jp.wings.pocket.chap2;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Debug {}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@interface Version { double value(); }

// 複数指定可能なアノテーション
@Repeatable(ValueAnnotation.class)
@interface StringAnnotation { String value(); }
// 複数指定したアノテーションを保持するコンテナアノテーション
@interface ValueAnnotation {
	StringAnnotation[] value();
}

// 複数の同じアノテーションの付加
@StringAnnotation(value = "str1")
@StringAnnotation(value = "str2")
@Version(0.1)
public class _AnnotationSample2 {

	@Debug
	public void disp() {
	}
	public static void main(String[] args) throws SecurityException, NoSuchMethodException {

		// Versionアノテーションを取得
		Version v = _AnnotationSample2.class.getAnnotation(Version.class);
		// バージョン表示
		System.out.println( v.value() );

		// Debugアノテーションを取得
		Debug d = _AnnotationSample2.class.getMethod("disp").getAnnotation(Debug.class);
		if ( d != null ) {
			System.out.println( "debug!" );
			System.out.println( d );
		}

	}
}
