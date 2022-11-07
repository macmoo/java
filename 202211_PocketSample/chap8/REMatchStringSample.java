package jp.wings.pocket.chap8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REMatchStringSample {
	  public static void main(String[] args) {  	
	    String str = "<font color=\"red\">Hello</font>";
	    Pattern pat1 = Pattern.compile("<([\\w]+)[\\s\\w=\"]+>[\\w]+</([\\w]+)>");
	    Pattern pat2 = Pattern.compile("<");
	    Pattern pat3 = Pattern.compile(">");

	    Matcher mat1 = pat1.matcher(str);
	    while(mat1.find()){
	      if(mat1.group(1).equals(mat1.group(2))){
	      	System.out.println("これは " + mat1.group(1) + " タグです。");
	      }
	    }
	    System.out.println("エスケープします。");
		Matcher mat2 = pat2.matcher(str);
		Matcher mat3 = pat3.matcher(mat2.replaceAll("&lt;"));
	    System.out.println(mat3.replaceAll("&gt;"));
	  }
	}
