package jp.wings.pocket.chap8;

import java.util.Locale;
import java.util.ResourceBundle;


public class HelloInternational{

	public static void main(String[] args){
		ResourceBundle helloResource = ResourceBundle.getBundle("jp.wings.pocket.chap8.PHelloResource", Locale.getDefault());
		System.out.println(helloResource.getString("evening"));

		// Locale.FRANCEの場合
		ResourceBundle helloResource_fr = ResourceBundle.getBundle("jp.wings.pocket.chap8.PHelloResource", Locale.FRANCE);
		System.out.println(helloResource_fr.getString("evening"));
	}
}
