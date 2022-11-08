package jp.wings.pocket.chap2;

public class AccessSample {

	protected int val = 0;

	private void methodA(int i) {
		System.out.println( i *10 );
	}

	public static void main(String[] args) {

		AccessSample obj = new AccessSample();
		obj.methodA(10);
	}


}
