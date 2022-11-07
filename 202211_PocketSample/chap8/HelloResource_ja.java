package jp.wings.pocket.chap8;

import java.util.ListResourceBundle;

public class HelloResource_ja extends ListResourceBundle{
	  // キーと値のペアを2次元配列で指定
	  static final Object[][] hello = {{ "hello", "こんにちは"}, {"evening", "こんばんは"}};
	  // getContentsメソッドをオーバーライド
	  protected Object[][] getContents(){
	    return hello;
	  }
	}
