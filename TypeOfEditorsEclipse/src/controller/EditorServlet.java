package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import module.EditorExpert;

/**
 * Servlet implementation class EditorServlet
 */
@WebServlet("/EditorServlet")
public class EditorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
//
//    /**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}
//	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String answer = request.getParameter("types");
		EditorExpert expert = new EditorExpert();
		List resultList = expert.getTypes(answer);
		
		request.setAttribute("styles", resultList);
		RequestDispatcher disp = request.getRequestDispatcher("result.jsp");
		disp.forward(request, response);
		
	}
}
