package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Feedback;
import model.FeedbackFormDataModelling;

/**
 * Servlet implementation class SearchFeedbackDataCollection
 */
@WebServlet("/SearchFeedbackDataCollection")
public class SearchFeedbackDataCollection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchFeedbackDataCollection() {
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
		String contactno = request.getParameter("contactno");
		Feedback fb = new Feedback();
		fb.setContactno(contactno);
		FeedbackFormDataModelling ffdm = new FeedbackFormDataModelling();
		ffdm.selectFeedbackData(fb.getContactno());
		System.out.println(contactno);
	}

}
