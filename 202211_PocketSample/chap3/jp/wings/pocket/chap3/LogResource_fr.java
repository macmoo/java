package jp.wings.pocket.chap3;

import java.util.ListResourceBundle;


public class LogResource_fr extends ListResourceBundle {
	  //キーと値のペアを2次元配列で指定
	  static final Object[][] error = {{ "severe", "Je suis fatal"}, {"warning", "Prévenir"}};

	  //getContentsメソッドをオーバーライド
	  protected Object[][] getContents(){
	    return error;
	  }
}
