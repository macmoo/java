package jp.wings.pocket.chap8;

import java.util.Locale;

public class Set_getLocale2{
	  public static void main(String[] args){
		// 日本のロケールオブジェクトを生成
		Locale locale = Locale.JAPAN;

		// 各種ロケールにある情報を取得／出力する
	    System.out.println("国/地域コード:" + locale.getCountry());
	    System.out.println("言語:" + locale.getLanguage());
	    System.out.println("バリアントコード:" + locale.getVariant());
	    System.out.println("国名（省略形）" + locale.getISO3Country());
	    System.out.println("言語（省略形）" + locale.getISO3Language());
	    System.out.println("Javaマシンのデフォルトのロケール:" + Locale.getDefault().toString());
	    System.out.println("国名:" + locale.getDisplayCountry());
	    System.out.println("ロケール名:" + locale.getDisplayName());
	    System.out.println("バリアントコード:" + locale.getDisplayVariant());
	    Locale[] locales = Locale.getAvailableLocales();
	    Locale.setDefault(locales[7]); // ここでは適当にデフォルトのロケールを設定
	    System.out.println("Javaマシンのデフォルトのロケールを" + Locale.getDefault().toString() + "に変更");
	    System.out.println("国名:" + locale.getDisplayCountry());
	    System.out.println("言語:" + locale.getLanguage());
	    System.out.println("ロケール名:" + locale.getDisplayName());
	    System.out.println("バリアントコード:" + locale.getDisplayVariant());
	  }
	}