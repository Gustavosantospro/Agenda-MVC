package br.com.githubGustavoSantos.agenda.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.githubGustavoSantos.agenda.mvc.logica.Logica;

@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br.com.caelum.agenda.mvc.logica." + parametro;
		
		try {
			// cria uma representação de uma classe
			Class classe = Class.forName(nomeDaClasse);
			// instânciando um objeto do tipo lógica(para chamar o método execute)
			Logica logica = (Logica) classe.newInstance();
			// como response teremos uma string contendo o nome de uma página jsp
			String pagina = logica.executa(request, response);
			request.getRequestDispatcher(pagina).forward(request, response);
			
		} catch (Exception e) {
			throw new ServletException( "a lógica de negócios causou uma exceção", e);
		}
	}
}
