import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
	public static void main(String[] args) throws Exception{
		Properties props = new Properties();
		//props.setProperty("DBDriver", "com.jdbc.oracle.OracleDriver");
		//System.out.println("Driver = " + props.getProperty("DBDriver"));
		/*props.load(new FileInputStream("./dbinfo.properties"));
		Enumeration<Object> enums = props.keys();
		while(enums.hasMoreElements()) {
			String key = (String)enums.nextElement();
			System.out.println(key + " --> " + props.getProperty(key));
		}*/
		//System.out.println("User name = " + System.getProperty("user.name"));
		//System.out.println("Java Version = " + System.getProperty("java.version"));
		//Properties osInfo = System.getProperties();
		//Enumeration<Object> enums = osInfo.keys();
		//while(enums.hasMoreElements()) {
		//	String key = (String)enums.nextElement();
		//	System.out.println(key + " --> " + osInfo.getProperty(key));
		//}
		Map<String, String> map = System.getenv();
		Set<String> set = map.keySet();
		Iterator<String> keys = set.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.print(key + " --> ");
			System.out.println(map.get(key));
		}
	}
}