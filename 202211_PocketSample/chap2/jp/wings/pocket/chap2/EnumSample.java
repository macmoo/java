package jp.wings.pocket.chap2;

public class EnumSample {
	enum Signal {                    // enum型Signalの定義
		RED, BLUE, YELLOW;
	    @Override
		public String toString() {  return "信号の色は" + name();  }
	}
	public static void main(String[] args) {
		Signal s = Signal.RED;
		if (s != Signal.BLUE) System.out.println("危険"); // 結果：危険
		switch (s) {
			case RED:
			case YELLOW:
				System.out.println("停止");
				break;
			default:
				break;
		}
		System.out.println(s.toString()); // 結果：信号の色はRED
	}
}
