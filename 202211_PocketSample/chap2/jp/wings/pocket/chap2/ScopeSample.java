package jp.wings.pocket.chap2;

public  class ScopeSample {

	static int val1 = 0;        // スコープは、ScopeDemoクラス内

    public static void main(String[] args) {

        int   x = 1;            // スコープは、mainメソッド内

        System.out.println( x );
        System.out.println( val1 );
    }
}
