package br.com.githubGustavoSantos.agenda.dao.daotest;

import java.util.List;

import br.com.githubGustavoSantos.agenda.dao.ContatoDao;
import br.com.githubGustavoSantos.agenda.modelo.Contato;
/**
 * @category classe feita para realizar teste do list.*/
public class TestaGetList {
	
	public static void main(String[] args) {
		
		ContatoDao nDao = new ContatoDao();
		List<Contato> contatos = nDao.getContatos();
		
		for (Contato contato: contatos) {
			System.out.println("Id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
		}
		
	}
}
