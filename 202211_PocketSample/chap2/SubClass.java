package jp.wings.pocket.chap2;

class SuperClassA {

	final int val = 0;

	void methodA(int i) {
		System.out.println(i);
	}

	final void methodB(int i) {
		System.out.println(i * 2);
	}
}

class SubClassB extends SuperClassA {

	int val = 0;

	void methodA(int i) {
		System.out.println(i * 10);
	}
	// void methodB(int i) {}

	public static void main(String[] args) {

		SubClassB sub = new SubClassB();
		sub.methodA(10);
	}
}
