package br.com.githubGustavoSantos.agenda.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.githubGustavoSantos.agenda.dao.ContatoDao;
import br.com.githubGustavoSantos.agenda.modelo.Contato;

public class RemoveContatoLogica implements Logica {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) {
		long id = Long.parseLong(req.getParameter("id"));
		
		Contato contato = new Contato();
		contato.setId(id);
		
		ContatoDao dao = new ContatoDao();		
		dao.deleteContato(contato);
		
		return "mvc?logica=ListaContatosLogica";
	}

}
