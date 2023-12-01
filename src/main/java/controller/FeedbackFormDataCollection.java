package controller;
import model.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackFormDataCollection
 */
@WebServlet("/FeedbackFormDataCollection")
public class FeedbackFormDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackFormDataCollection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name = request.getParameter("name");
		String contactno = request.getParameter("contactno");
		String feedback = request.getParameter("feedback");
		
		Feedback f = new Feedback();
		f.setName(name);
		f.setContactno(contactno);
		f.setFeedback(feedback); 
		
		FeedbackFormDataModelling fdm = new FeedbackFormDataModelling();
		fdm.insertFeedbackData(f);
		
		
		
		System.out.println(f.getName());
		System.out.println(f.getContactno());
		System.out.println(f.getFeedback()); 
		
		
		
	}

}
