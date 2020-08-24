import java.io.UnsupportedEncodingException;

public class CharConversion {
	private CharConversion() {}
	public static String entoko(String en) {
		String ko = null;
		try {
			ko = new String(en.getBytes("ISO8859_1"), "KSC5601");
		} catch (UnsupportedEncodingException e) {};
		return ko;
	}
	public static String kotoen(String ko) {
		String en = null;
		try {
			en = new String(ko.getBytes("KSC5601"), "ISO8859_1");
		} catch (UnsupportedEncodingException e) {};
		return en;
	}
	public static String kotoutf8(String ko) {
		String utf8 = null;
		try {
			utf8 = new String(ko.getBytes("KSC5601"), "UTF-8");
		} catch (UnsupportedEncodingException e) {};
		return utf8;
	}
	public static String utf8toko(String utf8) {
		String ko = null;
		try {
			ko = new String(utf8.getBytes("UTF-8"), "KSC5601");
		} catch (UnsupportedEncodingException e) {};
		return ko;
	}
	
}
