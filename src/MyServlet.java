import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class ServletExample extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("Servlet called");
        out.println("Data Inserted Successfully");
        String username = request.getParameter("username");
        String username = request.getParameter("username");
        String username = request.getParameter("username");
        out.insertRecord(username);
        // This is use to redirect to other page
    }
}

