package com.github.rudgejoao.study_api.service;

import java.util.ArrayList;
import java.util.List;

import com.github.rudgejoao.study_api.model.Pessoa;

public class PessoaService {
	
	private List<Pessoa> pessoas;
	//parte02
	//quando chamar o contrutor, vai carregar automaticamente o load
	public PessoaService() {
		load();
	}
	
	private void load() {
		pessoas = new ArrayList<>();
		Pessoa p1 = new Pessoa();
		p1.setId(1L);
		p1.setNome("Joao");
		pessoas.add(p1);
		
		Pessoa p2 = new Pessoa();
		p2.setId(2L);
		p2.setNome("Flavio");
		pessoas.add(p2);
		
		Pessoa p3 = new Pessoa();
		p3.setId(2L);
		p3.setNome("Julio");
		pessoas.add(p3);
	}
	
	public List<Pessoa> list(){
		return pessoas;
	}
	
}
