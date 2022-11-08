package jp.wings.pocket.chap8;

import java.util.Locale;

public class Set_getLocale{
	public static void main(String[] args){
		// デフォルトロケール名の表示
		System.out.println("デフォルトのロケール:" + Locale.getDefault().getDisplayName() );

		// 使用可能なロケールの名前を日本語とフランス語で表示
		for (Locale l : Locale.getAvailableLocales() ) {
			System.out.println(l.getDisplayName()+" "+l.getDisplayName(Locale.FRENCH));
		}
	}
}