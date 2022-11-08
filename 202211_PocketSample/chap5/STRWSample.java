

import java.io.IOException;
import java.io.StringWriter;

public class STRWSample {
	public static void main(String[] args) throws IOException {

		char arr[] = {'2','0','1','5'};
		try(StringWriter sr = new StringWriter()){
			// appendでも
			sr.append("last year: ");
			// 	writeでも書き込める
			sr.write(arr);

			System.out.println(sr);
		}
	}
}
