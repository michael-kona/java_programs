import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class MyServlet extends HttpServlet
{
 public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException
 {
    try
    {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<html><body>");
    out.println("<h1>Hello Readers</h1>");
    out.println("</body></html>");
    }
    catch(Exception ex)
         {
         System.out.println(ex.getMessage());
         }
  }
}
