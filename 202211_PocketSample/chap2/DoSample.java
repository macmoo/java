package jp.wings.pocket.chap2;

public class DoSample {

	public static void main(String[] args) {
        int n = 0;

        do {
            System.out.println( n );  // かならず1回は実行される
            n--;
        } while(n > 0);

	}

}
