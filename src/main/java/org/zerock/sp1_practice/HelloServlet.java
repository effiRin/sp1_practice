package org.zerock.sp1_practice;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
<<<<<<< HEAD
        message = "Hello World!!!!!!";
=======
        message = "Hello World!";
>>>>>>> 93f2d1bb0cf9fa84ae7c68827c52e131f1fee70b
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    
    public void destroy() {
        System.out.println("destroy");
    }
}
