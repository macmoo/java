package jp.wings.pocket.chap8;

import java.util.Locale;
import java.util.ResourceBundle;


public class HelloInternationalClass{

	public static void main(String[] args){
		// ロケールに合わせて、PhelloResource_（言語コード）.propertiesを取得
		// 日本語で「こんばんは」を出力
		ResourceBundle helloResource = ResourceBundle.getBundle("jp.wings.pocket.chap8.HelloResource", Locale.getDefault());
		System.out.println(helloResource.getString("hello"));

		// Locale.FRANCEの場合
		ResourceBundle helloResource_fr = ResourceBundle.getBundle("jp.wings.pocket.chap8.HelloResource", Locale.FRANCE);
		System.out.println(helloResource_fr.getString("hello"));
	}
}
