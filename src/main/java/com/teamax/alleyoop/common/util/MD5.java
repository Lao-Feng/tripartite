package com.teamax.alleyoop.common.util;

import java.security.MessageDigest;

/**
 * MD5加密工具类
 * <功能详细描述>
 *
 * @author  chenlujun
 * @version  [版本号, 2014年10月1日]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class MD5 {
	private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}
	private static String byteArrayToHexString(byte b[]) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++)
			resultSb.append(byteToHexString(b[i]));

		return resultSb.toString();
	}

	public static void main(String[] ars){
		String t = "appid=wx580280c84f17ed6b&body=苹果&mch_id=1402480902&nonce_str=MC40MzcyNTAxNjY0MTc2MTg3OjpTYX&notify_url=123&out_trade_no=20170106113324&product_id=1&spbill_create_ip=192.168.0.105&total_fee=100&trade_type=MWEB&key=2efdf2c28fbda00ba7fa4832738fb68d";
		String s = "appid=wx580280c84f17ed6b&body=苹果&mch_id=1402480902&nonce_str=MC40NzEzMDk1NDg4MzIzMDI4OjpTYX&notify_url=123&out_trade_no=20170106113324&product_id=1&spbill_create_ip=192.168.0.105&total_fee=100&trade_type=MWEB&key=2efdf2c28fbda00ba7fa4832738fb68d";
		String md55 = md5(s);
		//F74B1787B2999B08DA84B27F4F4CA09E
		System.out.println(md55);
	}

	public final static String md5(String pwd) {
		//用于加密的字符
		char md5String[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			//使用平台的默认字符集将此 String 编码为 byte序列，并将结果存储到一个新的 byte数组中
			byte[] btInput = pwd.getBytes("utf-8");

			//信息摘要是安全的单向哈希函数，它接收任意大小的数据，并输出固定长度的哈希值。
			MessageDigest mdInst = MessageDigest.getInstance("MD5");

			//MessageDigest对象通过使用 update方法处理数据， 使用指定的byte数组更新摘要
			mdInst.update(btInput);

			// 摘要更新之后，通过调用digest（）执行哈希计算，获得密文
			byte[] md = mdInst.digest();

			// 把密文转换成十六进制的字符串形式
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {   //  i = 0
				byte byte0 = md[i];  //95
				str[k++] = md5String[byte0 >>> 4 & 0xf];    //    5
				str[k++] = md5String[byte0 & 0xf];   //   F
			}

			//返回经过加密后的字符串
			return new String(str);

		} catch (Exception e) {
			return null;
		}
	}

	public static String MD5Encode(String origin, String charsetname) {
		String resultString = null;
		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			if (charsetname == null || "".equals(charsetname))
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes()));
			else
				resultString = byteArrayToHexString(md.digest(resultString
						.getBytes(charsetname)));
		} catch (Exception exception) {
		}
		return resultString;
	}

}