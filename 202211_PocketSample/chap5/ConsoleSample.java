

import java.io.Console;
import java.util.Date;

public class ConsoleSample {
	public static void main( String[] args ) {
		try {

			Console console = System.console();

			char[] password = console.readPassword();
			System.out.println(password);

			password = console.readPassword("[%tT]password> ", new Date());
			for(char c :password){
				console.printf("%c",c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
