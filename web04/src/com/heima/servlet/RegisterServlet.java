package com.heima.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.heima.doMain.Customer;
import com.heima.service.RegisterService;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setHeader("content-type", "text/html;charset=utf-8");
		Map<String, String[]> map = request.getParameterMap();
		Customer customer = new Customer();
		int row=9;
		try {
			BeanUtils.populate(customer, map);
			RegisterService rs = new RegisterService();
			rs.register(customer);
			System.out.println(row);
			response.getWriter().write("×¢²á³É¹¦£¡");
		} catch (Exception e) {
			response.getWriter().write("×¢²áÊ§°Ü£¡");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
