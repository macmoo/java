package jp.wings.pocket.chap8;

import java.text.NumberFormat;

public class NFGetSetMaxMinSample {
	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		System.out.println( "少なくとも小数点以下"
							+ nf.getMinimumFractionDigits() 
								+ "位：" + nf.format(100));
		nf.setMaximumFractionDigits(2);
		System.out.println( "多くとも小数点以下"
							+ nf.getMaximumFractionDigits()
								+ "位：" + nf.format(100.008));
	}
}
