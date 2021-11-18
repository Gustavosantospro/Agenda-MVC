package br.com.caelum.agenda.mvc.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.caelum.agenda.jdbc.ConnectionFactory;

@WebFilter("/*")
public class FirstFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Connection connection = new ConnectionFactory().getConnection();
		
		request.setAttribute("connection", connection);
		chain.doFilter(request, response);
		
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("erro ao fechar conexão!");
			e.printStackTrace();
		}
		
	}

}
