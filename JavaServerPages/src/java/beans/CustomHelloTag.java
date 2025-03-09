package beans;

import java.io.IOException;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import jakarta.servlet.jsp.JspWriter;

public class CustomHelloTag extends SimpleTagSupport {

    public void doTag() throws JspException, IOException {
        // Fetch JSP output stream
        JspWriter out = getJspContext().getOut();

        // Custom HTML content
        out.println("<h3>Hello from Custom JSP Tag!</h3>");
    }
}
