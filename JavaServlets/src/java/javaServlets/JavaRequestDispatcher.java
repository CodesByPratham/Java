package javaServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaRequestDispatcher extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body bgcolor='cyan'>");
        out.println("<Center>");
        out.println("<B> Registration Form ");
        out.println("<Form action='RequestDispatcherMethods' method='Post'><br>");
        out.println("User Name: <Input type='text' name='uname'><br><br>");
        out.println("Password : <Input type='text' name='upwd'><br><br>");
        out.println("<Input type='Submit' value='Login'>");
        out.println("</Center>");
        out.println("</body>");
        out.println("</html>");
    }
}
