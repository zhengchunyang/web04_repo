package cn.itcast.heima.form;

import java.io.UnsupportedEncodingException;

public class CodeUtils {
	public static String recode(String content){
		try {
			return new String(content.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
