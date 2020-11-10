package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Home Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .container {\n");
      out.write("                margin-top: 50px;\n");
      out.write("                display: flex;\n");
      out.write("                flex-wrap: wrap;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                width: 30%;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Show List Product -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"./images/product_1.jpg\" />\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Product Name</h5>\n");
      out.write("                    <h6 class=\"card-subtitle mb-2 text-muted\">\n");
      out.write("                        Product Price: 10.000.000$\n");
      out.write("                    </h6>\n");
      out.write("                    <p class=\"card-text\">\n");
      out.write("                        Some quick example text to build on the card title and make up the\n");
      out.write("                        bulk of the card's content. (Product Description)\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Add to Cart</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"./images/product_1.jpg\" />\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Product Name</h5>\n");
      out.write("                    <h6 class=\"card-subtitle mb-2 text-muted\">\n");
      out.write("                        Product Price: 10.000.000$\n");
      out.write("                    </h6>\n");
      out.write("                    <p class=\"card-text\">\n");
      out.write("                        Some quick example text to build on the card title and make up the\n");
      out.write("                        bulk of the card's content. (Product Description)\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Add to Cart</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"./images/product_1.jpg\" />\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Product Name</h5>\n");
      out.write("                    <h6 class=\"card-subtitle mb-2 text-muted\">\n");
      out.write("                        Product Price: 10.000.000$\n");
      out.write("                    </h6>\n");
      out.write("                    <p class=\"card-text\">\n");
      out.write("                        Some quick example text to build on the card title and make up the\n");
      out.write("                        bulk of the card's content. (Product Description)\n");
      out.write("                    </p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Add to Cart</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
