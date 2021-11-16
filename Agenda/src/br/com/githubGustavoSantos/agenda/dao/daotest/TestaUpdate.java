package br.com.githubGustavoSantos.agenda.dao.daotest;

import br.com.githubGustavoSantos.agenda.dao.ContatoDao;
import br.com.githubGustavoSantos.agenda.modelo.Contato;

public class TestaUpdate {
	public static void main(String[] args) {
		Contato nv = new Contato();
		nv.setNome("Gustavii");
		nv.setEmail("gustaviisantiis");
		nv.setEndereco("ruaiiatapporang");
		nv.setId((long) 2);
		
		ContatoDao nvDao = new ContatoDao();
		nvDao.updateContato(nv);
		System.out.println("Contato atualizado");
	}
}
