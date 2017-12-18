package cn.itcast.heima.line;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LineServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取请求方式
		String method = request.getMethod();
		System.out.println("method="+method);
		//获取项目路径
		String contextPath = request.getContextPath();
		System.out.println("contextPath="+contextPath);
		//获取ip地址
		String ip = request.getRemoteAddr();
		System.out.println("ip="+ip);
		System.out.println("---------------------------------");
		//获取不带参数的请求资源
		String requestURI = request.getRequestURI();
		System.out.println("requestURI="+requestURI);
		//获取请求参数
		String queryString = request.getQueryString();
		System.out.println("queryString="+queryString);
		//获取协议版本
		String protocol = request.getProtocol();
		System.out.println("protocol="+protocol);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
