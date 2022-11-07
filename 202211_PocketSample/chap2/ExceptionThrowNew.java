package jp.wings.pocket.chap2;

public class ExceptionThrowNew {

	// throwsで、IllegalAccessException例外を指定
	static void throwSample() throws IllegalAccessException {
		
		System.out.println("throwSample");
		
		// 例外のスロー
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {

		try {
			throwSample();
		} catch (IllegalAccessException e) {
			System.out.println(e);
		}
	}
}
