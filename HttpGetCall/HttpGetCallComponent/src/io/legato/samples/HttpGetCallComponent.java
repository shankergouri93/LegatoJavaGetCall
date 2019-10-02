package io.legato.samples;

import io.legato.Component;
import io.legato.Level;
import java.io.*;
import java.net.*;

public class HttpGetCallComponent extends Component {
	public void componentInit() {
		String url = "http://104.197.152.149/api/Log?input=test1";
        URL obj;
       try { obj = new URL(url);
HttpURLConnection con = (HttpURLConnection) obj.openConnection();

//optional default is GET
con.setRequestMethod("GET");
con.getResponseCode();
} catch (Exception e) {
//TODO Auto-generated catch block
e.printStackTrace();
}
		getLogger().log(Level.INFO, "Hello, World (from Java).");
	}
}
