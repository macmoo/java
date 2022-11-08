package jp.wings.pocket.chap3;

class GetClassSample{

	public static void main(String[] args) throws ClassNotFoundException{

		Class<?> cls = Class.forName("java.lang.Character");

		System.out.println( "- getPackage - ");
		System.out.println( cls.getPackage().getName() );

		System.out.println( "- getCanonicalName - ");
		System.out.println( cls.getCanonicalName() );
		
		System.out.println( "- getClasses - ");
		for (Class<?> obj : cls.getClasses() )
			System.out.println( obj.getName() );

		System.out.println( "- getDeclaredClasses - ");
		for (Class<?> obj : cls.getDeclaredClasses() )
			System.out.println( obj.getName() );

	}
}
