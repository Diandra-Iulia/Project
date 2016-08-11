package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernateproject.HibernateUtil;


/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet  {
	private static final long serialVersionUID = 1L;
       
	HibernateUtil hibernate = new HibernateUtil();
	Session sessions;

    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		hibernate.hibernateConfiguration();
		request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String userName = request.getParameter("username").toString();
		String password = request.getParameter("password").toString();
		
		boolean userFound=false;
		//HttpSession session = request.getSession(true);
		sessions = hibernate.factory.openSession();
		String hql = "from entities.User where firstName = '"+ userName + "' and password = '" + password + "'";
		Query query = sessions.createQuery(hql);
		
		List list = query.list();
		

		if ((list!=null) && (list.size() > 0)) {
			 userFound=true;
		}
		
		if(userFound){
			// correct! Greet!
			request.setAttribute("username", userName);
			request.getRequestDispatcher("/MainPage").forward(request, response);
		}
		
			
		 else {
			// not correct
			// go back to login
			 request.getRequestDispatcher("/jsp/login.jsp").forward(request, response);
		}
		
	
		
	}

}
