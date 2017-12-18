package homework_level02_Test01;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setHeader("content-type", "text/html;charset=utf-8");
		
		Map<String, String[]> map = request.getParameterMap();
		Student student = new Student();
		try {
			BeanUtils.populate(student, map);
			new addService().add(student);
//			response.getWriter().println("录入成功！");
			request.getRequestDispatcher("message.html").forward(request, response);
		} catch (Exception e) {
			response.getWriter().println("录入失败！");
			e.printStackTrace();
		} 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
