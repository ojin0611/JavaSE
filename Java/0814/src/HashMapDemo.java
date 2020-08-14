import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		//map.put("Jan", 1);
		map.put("DBDriver", "com.jdbc.oracle.OracleDriver");
		map.put("DBUrl", "jdbc:oracle:thin:@127.0.0.1:1520:ORCL");
		map.put("DBUser", "jimin");
		map.put("DBPassword", "12345678");

		Set<String> set = map.keySet();
		Iterator<String> iters = set.iterator();
		while(iters.hasNext()) {
			String key = iters.next();
			System.out.println(key + " --> " + map.get(key));
		}
	}
}