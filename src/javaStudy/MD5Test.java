package javaStudy;

public class MD5Test {

	public static void main(String[] args) {
		QuickSDKDesUtil quick = new QuickSDKDesUtil();
		String s = QuickSDKDesUtil.encode("test", "32");
//		quick.decode(src, key);
		System.out.println(s);
	}

}
