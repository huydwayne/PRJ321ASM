package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Cart View Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .shopping-cart {\n");
      out.write("                width: 1200px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                margin-top: 60px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Shopping Cart -->\n");
      out.write("        <div class=\"shopping-cart col-sm-12 col-md-10 col-md-offset-1\">\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Product</th>\n");
      out.write("                        <th>Quantity</th>\n");
      out.write("                        <th class=\"text-center\">Price</th>\n");
      out.write("                        <th class=\"text-center\">Total</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"col-sm-8 col-md-6\">\n");
      out.write("                            <div class=\"media\">\n");
      out.write("                                <a class=\"thumbnail pull-left\" href=\"#\">\n");
      out.write("                                    <img\n");
      out.write("                                        class=\"media-object\"\n");
      out.write("                                        src=\"http://icons.iconarchive.com/icons/custom-icon-design/flatastic-2/72/product-icon.png\"\n");
      out.write("                                        style=\"width: 72px; height: 72px\"\n");
      out.write("                                        />\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"media-body\">\n");
      out.write("                                    <h4 class=\"media-heading\"><a href=\"#\">Product Name</a></h4>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                        <td class=\"col-sm-1 col-md-1 text-center\">\n");
      out.write("                            <strong>4</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"col-sm-1 col-md-1 text-center\">\n");
      out.write("                            <strong>$9.99</strong>\n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"col-sm-1 col-md-1 text-center\">\n");
      out.write("                            <strong>$99.99</strong>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><h4>Total</h4></td>\n");
      out.write("                        <td class=\"text-right\">\n");
      out.write("                            <h4><strong>$9.999.99</strong></h4>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-info\">\n");
      out.write("                                <span class=\"fa fa-shopping-cart\"></span> Continue Shopping\n");
      out.write("                            </button>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-success\">\n");
      out.write("                                Checkout <span class=\"fa fa-play\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
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
