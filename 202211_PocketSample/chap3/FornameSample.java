package jp.wings.pocket.chap3;

class FornameSample{
	public static void main(String args[]){

		try {
			Class<?> myclass1 = Class.forName("java.lang.String");

			System.out.println(myclass1.getName());

			Class<?> myclass2 = Class.forName("java.lang.String",true,
									ClassLoader.getSystemClassLoader() );

			System.out.println(myclass2.getName());

		}
		catch (ClassNotFoundException e) {
		}
	}
}
