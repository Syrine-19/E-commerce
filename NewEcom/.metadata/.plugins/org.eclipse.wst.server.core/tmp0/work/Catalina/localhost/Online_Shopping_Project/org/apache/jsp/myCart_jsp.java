/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.23
 * Generated at: 2023-05-01 12:02:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import project.ConnectionProvider;
import java.sql.*;

public final class myCart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1682935136659L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1682932779878L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("project.ConnectionProvider");
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
      			"error.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" href=\"dsfsdv.png\" type=\"image/png\" sizes=\"20x20\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/home-style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("<script src='https://kit.fontawesome.com/a076d05399.js'></script>\r\n");
      out.write("</head>\r\n");
      out.write("    <!--Header-->\r\n");
      out.write("    <br>\r\n");
      out.write("    <div class=\"topnav sticky\">\r\n");
      out.write("    ");
String email=session.getAttribute("email").toString(); 
      out.write("\r\n");
      out.write("            <center><h2>Ecommerce website</h2></center>\r\n");
      out.write("            <h2><a href=\"\">");
out.println(email); 
      out.write(" <i class='fas fa-user-alt'></i></a></h2>\r\n");
      out.write("            <a href=\"home.jsp\">Home<i class=\"fa fa-institution\"></i></a>\r\n");
      out.write("            <a href=\"myCart.jsp\">My Cart<i class='fas fa-cart-arrow-down'></i></a>\r\n");
      out.write("            <a href=\"myOrders.jsp\">My Orders  <i class='fab fa-elementor'></i></a>\r\n");
      out.write("            <a href=\"changeDetails.jsp\">Change Details <i class=\"fa fa-edit\"></i></a>\r\n");
      out.write("            <a href=\"messageUs.jsp\">Message Us <i class='fas fa-comment-alt'></i></a>\r\n");
      out.write("            <a href=\"about.jsp\">About <i class=\"fa fa-address-book\"></i></a>\r\n");
      out.write("            <a href=\"logout.jsp\">Logout <i class='fas fa-share-square'></i></a>\r\n");
      out.write("            <div class=\"search-container\">\r\n");
      out.write("             <form action=\"searchHome.jsp\" method=\"post\">\r\n");
      out.write("               <input type=\"text\" placeholder=\"Search\" name=\"search\">\r\n");
      out.write("               <button type=\"submit\"><i class=\"fa fa-search\"></i></button>\r\n");
      out.write("             </form>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("           <br>\r\n");
      out.write("           <!--table-->\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("           ");
/*created and designed by AD Singh -- downloaded from http://projects.adsingh.net/*/ 
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write(" <div class=\"footer\">\r\n");
      out.write("          <p>©2023 PFA Project by Syrine Kadri </p>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("      ");
/*created and designed by AD Singh -- downloaded from http://projects.adsingh.net/*/
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" href=\"dsfsdv.png\" type=\"image/png\" sizes=\"20x20\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>My Cart</title>\r\n");
      out.write("<style>\r\n");
      out.write("h3\r\n");
      out.write("{\r\n");
      out.write("	color: #F34323 ;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"color: white; text-align: center; font-size: 30px;\">My Cart <i class='fas fa-cart-arrow-down'></i></div>\r\n");

String msg=request.getParameter("msg");
if("notPossible".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">There is only one Quantity! So click on remove!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');


if("inc".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Quantity  Increased Successfully!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');


if("dec".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Quantity  Decreased Successfully!</h3>\r\n");
} 
      out.write('\r');
      out.write('\n');


if("removed".equals(msg)){

      out.write("\r\n");
      out.write("<h3 class=\"alert\">Product Successfully Removed!</h3>\r\n");
      out.write("\r\n");
} 
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("<thead>\r\n");

int total=0;
int sno=0;
try{
	ConnectionProvider conProvider =new ConnectionProvider();
	Connection con=conProvider.getCon();
	Statement st=con.createStatement();
	ResultSet rs1=st.executeQuery("select sum(total) from cart where email='"+email+"' and address is NULL");
	while(rs1.next()){
		total=rs1.getInt(1);
	}


      out.write("\r\n");
      out.write("          <tr>\r\n");
      out.write("            <th scope=\"col\" style=\"background-color: yellow;\">Total: <i class=\"fa fa-inr\"></i>");
out.println(total); 
      out.write("</th>\r\n");
      out.write("            ");
if(total>0){ 
      out.write("<th scope=\"col\"><a href=\"addressPaymentForOrder.jsp\">Proceed to order</a></th>");
} 
      out.write("\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <thead>\r\n");
      out.write("          <tr>\r\n");
      out.write("          <th scope=\"col\">S.No</th>\r\n");
      out.write("            <th scope=\"col\">Product Name</th>\r\n");
      out.write("            <th scope=\"col\">Category</th>\r\n");
      out.write("            <th scope=\"col\"><i class=\"fa fa-inr\"></i> price</th>\r\n");
      out.write("            <th scope=\"col\">Quantity</th>\r\n");
      out.write("            <th scope=\"col\">Sub Total</th>\r\n");
      out.write("            <th scope=\"col\">Remove <i class='fas fa-trash-alt'></i></th>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("      ");

      ResultSet rs=st.executeQuery("select * from product inner join cart on product.id=cart.product_id and cart.email='"+email+"' and cart.address is NULL");
     while(rs.next()){
      
      out.write("\r\n");
      out.write("          <tr>\r\n");
sno=sno+1; 
      out.write("\r\n");
      out.write("           <td>");
out.println(sno); 
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(2) );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(4) );
      out.write("</td>\r\n");
      out.write("            <td><a href=\"incDecQuantityAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("&quantity=inc\"><i class='fas fa-plus-circle'></i></a> ");
      out.print(rs.getString(8) );
      out.write(" <a href=\"incDecQuantityAction.jsp?id=");
      out.print(rs.getString(1) );
      out.write("&quantity=dec\"><i class='fas fa-minus-circle'></i></a></td>\r\n");
      out.write("            <td><i class=\"fa fa-inr\"></i> ");
      out.print(rs.getString(10) );
      out.write("</td>\r\n");
      out.write("            <td><a href=\"removeFromCart.jsp?id=");
      out.print(rs.getString(1) );
      out.write("\">Remove <i class='fas fa-trash-alt'></i></a></td>\r\n");
      out.write("          </tr>\r\n");

     }

}catch(Exception e){}
/*created and designed by AD Singh -- downloaded from http://projects.adsingh.net/*/
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("      </table>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("      <br>\r\n");
      out.write("\r\n");
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
