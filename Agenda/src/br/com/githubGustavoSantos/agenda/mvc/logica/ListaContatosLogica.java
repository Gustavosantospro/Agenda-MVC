package br.com.caelum.agenda.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

public class ListaContatosLogica implements Logica {
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		
		List<Contato> contatos = new ContatoDao().getContatos();
		req.setAttribute("contatos", contatos);
		
		
		return "/WEB-INF/jsp/lista-contatos.jsp";
	}
}
