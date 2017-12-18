package cn.itcast.heima.imitateCode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class ImitateCode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str="��ķ";
		//ģ���������utf-8����
		String s1 = URLEncoder.encode(str, "utf-8");
		System.out.println("utf-8:\t"+s1);
		//ģ���������iso-8859-1���н���
		String s2 = URLDecoder.decode(s1, "iso-8859-1");
		System.out.println("iso-8859-1:\t"+s2);
		//��s2���з�����
		String s3 = URLEncoder.encode(s2, "iso-8859-1");
		System.out.println("utf-8:\t"+s3);
		//��utf-8��s3�ٴν��н���
		String s4 = URLDecoder.decode(s3, "utf-8");
		System.out.println("�ָ����ģ�\t"+s4);
		
		//�ڶ��ַ�ʽ��
		String string = new String(s2.getBytes("iso-8859-1"),"utf-8");
		System.out.println(string);
	}

}
