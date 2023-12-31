/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.23
 * Generated at: 2023-05-01 10:02:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class forgotPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/signup-style.css\">\r\n");
      out.write("<link rel=\"icon\" href=\"dsfsdv.png\" type=\"image/png\" sizes=\"20x20\">\r\n");
      out.write("<title>ForgotPassword</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id='container'>\r\n");
      out.write("  <div class='signup'>\r\n");
      out.write("     <form action=\"forgotPasswordAction.jsp\" method=\"post\">\r\n");
      out.write("     <input type=\"email\" name=\"email\" placeholder=\"Enter Email\" required>\r\n");
      out.write("     <input type=\"number\" name=\"mobileNumber\" placeholder=\"Enter Mobile Number\" required>\r\n");
      out.write("     <select name=\"securityQuestion\">\r\n");
      out.write("     <option value=\"What was your first car?\">What was your first car?</option>\r\n");
      out.write("     <option value=\"What is the name of your first pet?\">What is the name of your first pet?</option>\r\n");
      out.write("     <option value=\"What elementary school did you attended?\">What elementary school did you attended?</option>\r\n");
      out.write("     <option value=\"What is the name of the town where you where born?\">What is the name of the town where you where born?</option>\r\n");
      out.write("     \r\n");
      out.write("     </select>\r\n");
      out.write("     <input type=\"text\" name=\"answer\" placeholder=\"Enter Answer\" required>\r\n");
      out.write("     <input type=\"password\" name=\"newPassword\" placeholder=\"Enter your new password to set\" required>\r\n");
      out.write("     <input type=\"submit\" value=\"Save\">\r\n");
      out.write("     </form>\r\n");
      out.write("      <h2><a href=\"login.jsp\">Login</a></h2>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class='whyforgotPassword'>\r\n");
      out.write("   ");
 
   String msg=request.getParameter("msg");
   if("done".equals(msg)){
   
      out.write("\r\n");
      out.write("<h1>Password Changed Successfully!</h1>\r\n");
} 
      out.write('\r');
      out.write('\n');

if("invalid".equals(msg)){

      out.write("\r\n");
      out.write("<h1>Some thing Went Wrong! Try Again !</h1>\r\n");
}/*created and designed by AD Singh -- downloaded from http://projects.adsingh.net/*/ 
      out.write("\r\n");
      out.write("    <h2>Ecommerce website</h2>\r\n");
      out.write("    <p><a href=\"http://www.adsingh.net/\" style=\"text-decoration: none;\">http://www.adsingh.net/</a></p>\r\n");
      out.write("    <p><a href=\"https://vfxguy.net/\" style=\"text-decoration: none;\">https://vfxguy.net/</a></p>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
