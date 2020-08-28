
public class JdbcDemo1 {
	private static final String DRIVER;
	private static final String URL;
	private static final String USER;
	private static final String PASSWD;
	
	static {
		DRIVER = "oracle.jdbc.driver.OracleDriver";
		URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		USER = "scott";
		PASSWD = "tiger";
	}
	
}
