import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnctionDemo {
	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		String url = "https://www.nate.com/";
		URLConnection urlConn = new URL(url).openConnection();
		Map<String, List<String>> headers = urlConn.getHeaderFields();
		Set<String> keys = headers.keySet();
		Iterator<String> iters = keys.iterator();
		while(iters.hasNext()) {
			String key = iters.next();
			System.out.print(key + " --> ");
			List<String> list = headers.get(key);
			System.out.println(Arrays.toString(list.toArray()));
		}
		
	}
}
