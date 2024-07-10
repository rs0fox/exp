import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloWorld", value = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<link rel='icon' type='image/x-icon' href='favicon.ico'>");
        String name = req.getParameter("name");
        if (name != null) {
            resp.getWriter().println("<h1>Hello, " + name + "!</h1>");
        } else {
            resp.getWriter().println("<h1>Hello, World!</h1>");
        }
        resp.getWriter().println("</body></html>");
    }
}
