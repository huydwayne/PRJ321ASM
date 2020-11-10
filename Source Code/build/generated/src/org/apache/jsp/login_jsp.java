package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write("            html,\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"http://getwallpapers.com/wallpaper/full/a/5/d/544750.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .wrapper {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 50%;\n");
      out.write("                left: 50%;\n");
      out.write("                transform: translate(-50%, -50%);\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                height: 300px;\n");
      out.write("                margin-top: auto;\n");
      out.write("                margin-bottom: auto;\n");
      out.write("                width: 400px;\n");
      out.write("                background-color: rgba(0, 0, 0, 0.5) !important;\n");
      out.write("            }\n");
      out.write("            .card-header h3 {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            .input-group-prepend span {\n");
      out.write("                width: 50px;\n");
      out.write("                background-color: #ffc312;\n");
      out.write("                color: black;\n");
      out.write("                border: 0 !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input:focus {\n");
      out.write("                outline: 0 0 0 0 !important;\n");
      out.write("                box-shadow: 0 0 0 0 !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login_btn {\n");
      out.write("                color: black;\n");
      out.write("                background-color: #ffc312;\n");
      out.write("                width: 100px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login_btn:hover {\n");
      out.write("                color: black;\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .links {\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .links a {\n");
      out.write("                margin-left: 4px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"d-flex justify-content-center h-100\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                    <div class=\"card-header\">\n");
      out.write("                        <h3>Login</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <form>\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"\n");
      out.write("                                          ><i class=\"fas fa-user\"></i\n");
      out.write("                                        ></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input\n");
      out.write("                                    name=\"username\"\n");
      out.write("                                    type=\"text\"\n");
      out.write("                                    class=\"form-control\"\n");
      out.write("                                    placeholder=\"username\"\n");
      out.write("                                    />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group form-group\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\"\n");
      out.write("                                          ><i class=\"fas fa-key\"></i\n");
      out.write("                                        ></span>\n");
      out.write("                                </div>\n");
      out.write("                                <input\n");
      out.write("                                    name=\"password\"\n");
      out.write("                                    type=\"password\"\n");
      out.write("                                    class=\"form-control\"\n");
      out.write("                                    placeholder=\"password\"\n");
      out.write("                                    />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <input\n");
      out.write("                                    type=\"submit\"\n");
      out.write("                                    value=\"Login\"\n");
      out.write("                                    class=\"btn float-right login_btn\"\n");
      out.write("                                    />\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"card-footer\">\n");
      out.write("                        <div class=\"d-flex justify-content-center links\">\n");
      out.write("                            Don't have an account?<a href=\"register.jsp\">Register</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
