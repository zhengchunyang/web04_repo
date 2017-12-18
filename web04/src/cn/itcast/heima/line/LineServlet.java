package cn.itcast.heima.line;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ����ʽ
		String method = request.getMethod();
		System.out.println("method="+method);
		//��ȡ��Ŀ·��
		String contextPath = request.getContextPath();
		System.out.println("contextPath="+contextPath);
		//��ȡip��ַ
		String ip = request.getRemoteAddr();
		System.out.println("ip="+ip);
		System.out.println("---------------------------------");
		//��ȡ����������������Դ
		String requestURI = request.getRequestURI();
		System.out.println("requestURI="+requestURI);
		//��ȡ�������
		String queryString = request.getQueryString();
		System.out.println("queryString="+queryString);
		//��ȡЭ��汾
		String protocol = request.getProtocol();
		System.out.println("protocol="+protocol);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
