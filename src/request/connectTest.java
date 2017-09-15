package request;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class connectTest {
	
	public static void main(String[] args) throws IOException {
		URL url = new URL("https","www.baidu.com","");
		System.out.println(url.toString());
		
			URLConnection connection =  url.openConnection();
			connection.connect();
			BufferedReader in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
			String line ;
			String result = "";
//			System.out.println(in.readLine());
			while ((line = in.readLine()) != null) {
				result += line;
			}
			System.out.println(result);
			in.close();
	}

}
