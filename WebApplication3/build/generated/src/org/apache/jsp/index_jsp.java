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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>CineVideo</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            p {\n");
      out.write("\n");
      out.write("text-align: justify;\n");
      out.write("\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("     \n");
      out.write("        <br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <center>\n");
      out.write("        <div class=\"alert alert-secondary\" role=\"alert\">\n");
      out.write("            <img src=\"logotipo.png\" class=\"rounded float-left\" width=\"200px\" height=\"70px\">\n");
      out.write("<div class=\"btn-group\">\n");
      out.write("  <button type=\"button\" class=\"btn btn-warning\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("   HOME\n");
      out.write("  </button>\n");
      out.write("</div>\n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("  <button type=\"button\" class=\"btn btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("    DVD's\n");
      out.write("  </button>\n");
      out.write("  <div class=\"dropdown-menu\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Outra ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma coisa aqui</a>\n");
      out.write("    <div class=\"dropdown-divider\"></div>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Link separado</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("  <button type=\"button\" class=\"btn btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("   BLU-RAY\n");
      out.write("  </button>\n");
      out.write("  <div class=\"dropdown-menu\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Outra ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma coisa aqui</a>\n");
      out.write("    <div class=\"dropdown-divider\"></div>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Link separado</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("  <button type=\"button\" class=\"btn btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("    PRÉ-VENDA\n");
      out.write("  </button>\n");
      out.write("  <div class=\"dropdown-menu\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Outra ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma coisa aqui</a>\n");
      out.write("    <div class=\"dropdown-divider\"></div>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Link separado</a>\n");
      out.write("  </div>\n");
      out.write("</div>   \n");
      out.write("    <div class=\"btn-group\">\n");
      out.write("      \n");
      out.write("  <button type=\"button\" class=\"btn btn-dark dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("    PROMOÇÕES\n");
      out.write("  </button>\n");
      out.write("  <div class=\"dropdown-menu\">\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Outra ação</a>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Alguma coisa aqui</a>\n");
      out.write("    <div class=\"dropdown-divider\"></div>\n");
      out.write("    <a class=\"dropdown-item\" href=\"#\">Link separado</a>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("            <br>   <br> \n");
      out.write("            \n");
      out.write("<nav class=\"navbar navbar-light bg-light\">\n");
      out.write("  <form class=\"form-inline\">\n");
      out.write("    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("    <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("  </form>\n");
      out.write("</nav>\n");
      out.write("            <p class=\"text-center text-danger\">\n");
      out.write("               <?php if(isset($_SESSION['loginErro'])) {\n");
      out.write("                   echo $_SESSION['loginErro'];\n");
      out.write("                   unset($_SESSION['loginErrro']);\n");
      out.write("               }?>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("                           <div class=\"container\">\n");
      out.write("\n");
      out.write("<ul class=\"nav justify-content-end\">\n");
      out.write("\n");
      out.write("<form class=\"form-inline\" method=\"POST\" action=\"valida.php\">\n");
      out.write("    <div class=\"form-group mb-2\">\n");
      out.write("     <label for=\"inputEmail\" class=\"sr-only\">Email</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group mx-sm-3 mb-2\">\n");
      out.write("    <label for=\"inputPassword2\" class=\"sr-only\">Password</label>\n");
      out.write("    <input type=\"password\" class=\"form-control\" id=\"inputPassword2\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary mb-2\">Acessar</button>\n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("         <div id=\"carouselsite\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("  <ol class=\"carousel-indicators\">\n");
      out.write("    <li data-target=\"#carouselsite\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("    <li data-target=\"#carouselsite\" data-slide-to=\"1\"></li>\n");
      out.write("    <li data-target=\"#carouselsite\" data-slide-to=\"2\"></li>\n");
      out.write("  </ol>\n");
      out.write("  <div class=\"carousel-inner\">\n");
      out.write("    <div class=\"carousel-item active\">\n");
      out.write("      <img src=\"DetetivePikachu.png\" class=\"img-fluid d\" >\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"MulherMaravilha.png\" class=\"d-block w-100\" >\n");
      out.write("    </div>\n");
      out.write("    <div class=\"carousel-item\">\n");
      out.write("      <img src=\"SuckerPunch.png\" class=\"d-block w-100\" >\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Anterior</span>\n");
      out.write("  </a>\n");
      out.write("  <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("    <span class=\"sr-only\">Próximo</span>\n");
      out.write("  </a>\n");
      out.write("</div>\n");
      out.write("        </div> \n");
      out.write("<div class=\"card-deck\">\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img class=\"card-img-top\" src=\"Card3.png\" alt=\"Imagem de capa do card\">\n");
      out.write("    <div class=\"card-body\" >\n");
      out.write("      <h5 class=\"card-title\">INUYASHA - O CASTELO DAS ILUSÕES DENTRO DO ESPELHO </h5>\n");
      out.write("      <p class=\"card-text\"> Depois de uma batalha contra o seu principal inimigo, Naraku, InuYasha e companhia separam-se para um pouco de descanso. Mas a sua paz não dura muito, pois devem combater uma nova ameaça, a princesa Kaguya. </p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-footer\">\n");
      out.write("      <small class=\"text-muted\">Atualizado a 3 minutos atrás</small>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img class=\"card-img-top\" src=\"Card1.png\"  alt=\"Imagem de capa do card\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\"> A VIAGEM DE CHIHIRO (千と千尋の神隠)</h5>\n");
      out.write("      <p class=\"card-text\">Chihiro é uma garota de 10 anos que acredita que todo o universo deve atender aos seus caprichos. Após saber através de seus pais que estarão mudando de cidade ela fica furiosa, sem fazer nenhum esforço para esconder sua raiva. nova cidade onde irão morar, indo parar defronte um túnel.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-footer\">\n");
      out.write("      <small class=\"text-muted\">Atualizado a 10 minutos atrás</small>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img class=\"card-img-top\" src=\"Card2.png\" alt=\"Imagem de capa do card\">\n");
      out.write("    <div class=\"card-body\">\n");
      out.write("      <h5 class=\"card-title\">PONYO - UMA AMIZADE QUE VEIO DO MAR</h5>\n");
      out.write("      <p class=\"card-text\">Este é um card maior com suporte a texto embaixo, que funciona como uma introdução a um conteúdo adicional. Este card tem o conteúdo ainda maior que o primeiro, para mostrar a altura igual, em ação.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"card-footer\">\n");
      out.write("      <small class=\"text-muted\">Atualizado há 1 hora atrás</small>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
