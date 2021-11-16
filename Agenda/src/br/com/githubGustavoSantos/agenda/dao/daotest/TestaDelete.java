package br.com.githubGustavoSantos.agenda.dao.daotest;

import br.com.githubGustavoSantos.agenda.dao.ContatoDao;
import br.com.githubGustavoSantos.agenda.modelo.Contato;

public class TestaDelete {
	public static void main(String[] args) {
		
		Contato nv = new Contato();
		nv.setId((long) 15);
		nv.setNome("contatovaiserexc");
		nv.setEmail("excludo");
		
		
		ContatoDao nvDao = new ContatoDao();
		nvDao.deleteContato(nv);
		
		System.out.println("contato deletado");
	}
}
