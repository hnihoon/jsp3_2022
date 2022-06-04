package servlet.test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet 대신에 web.xml에 설정하는 방법으로 url 연결합니다.
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// view (사용자화면)  를 표시하는 jsp 파일로 제어를 전달하기
		//pageContext.forward("2nd.jsp") 와 같은 동작을 위한 코드입니다.
		request.setAttribute("message", "환영합니다.나는 서블릿입니다.!!");
		RequestDispatcher rd = request.getRequestDispatcher("2nd.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}