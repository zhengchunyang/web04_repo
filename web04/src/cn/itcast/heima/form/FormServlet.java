package cn.itcast.heima.form;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
//		方式一
//		System.out.println("username="+new String(username.getBytes("iso-8859-1"),"utf-8"));
		//方式二
		System.out.println("username="+CodeUtils.recode(username));
	
		String password = request.getParameter("password");
		System.out.println("password="+CodeUtils.recode(password));
		String[] hobbies = request.getParameterValues("hobby");
		System.out.println("hobby="+Arrays.toString(hobbies));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
