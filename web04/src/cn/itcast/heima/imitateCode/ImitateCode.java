package cn.itcast.heima.imitateCode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class ImitateCode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="汤姆";
		//模拟浏览器以utf-8编码
		String s1 = URLEncoder.encode(str, "utf-8");
		System.out.println("utf-8:\t"+s1);
		//模拟服务器以iso-8859-1进行解码
		String s2 = URLDecoder.decode(s1, "iso-8859-1");
		System.out.println("iso-8859-1:\t"+s2);
		//对s2进行翻编码
		String s3 = URLEncoder.encode(s2, "iso-8859-1");
		System.out.println("utf-8:\t"+s3);
		//用utf-8对s3再次进行解码
		String s4 = URLDecoder.decode(s3, "utf-8");
		System.out.println("恢复中文：\t"+s4);
		
		//第二种方式：
		String string = new String(s2.getBytes("iso-8859-1"),"utf-8");
		System.out.println(string);
	}

}
