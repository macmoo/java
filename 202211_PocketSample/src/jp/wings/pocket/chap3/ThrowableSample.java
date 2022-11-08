package jp.wings.pocket.chap3;

class ThrowableSample {
	public static void main(String[] args) {

		int[] intArray = new int[3];

		try {
			for ( int i=0; i<4 ; i++ ) {
				intArray[i] = i*2;
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

			// 例外クラス名＋e.getMessage()の結果
			System.out.println(e.toString());
		}

	}
}
