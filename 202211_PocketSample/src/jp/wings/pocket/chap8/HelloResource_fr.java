package jp.wings.pocket.chap8;

import java.util.ListResourceBundle;

public class HelloResource_fr extends ListResourceBundle{
	  //キーと値のペアを2次元配列で指定
	  static final Object[][] hello = {{ "hello", "Bonjour !"}, {"evening", "Bonsoir !!"}};

	  //getContentsメソッドをオーバーライド
	  protected Object[][] getContents(){
	    return hello;
	  }
	}
