package cn.itcast.heima.body;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BodyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取单值的请求参数
		String username = request.getParameter("username");
		System.out.println("username="+username);
		//获取多值的请求参数
		String[] hobbies = request.getParameterValues("hobby");
		System.out.println("hobby="+Arrays.toString(hobbies));
		//获取所有的请求参数
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			System.out.println("key="+key+"\tvalue="+Arrays.toString(map.get(key)));
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
