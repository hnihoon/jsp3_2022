package servlet.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/3rd")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThirdServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//session 객체 선언 : 현재의 요청인 request를 이용해서 생성합니다.
		HttpSession session = request.getSession();
		session.setAttribute("user", "i'm sana");
		//새로운 요청으로 변경
		response.sendRedirect("first");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}