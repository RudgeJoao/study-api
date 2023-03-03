package com.github.rudgejoao.study_api.controller;

import java.util.List;
//parte02
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.rudgejoao.study_api.model.Pessoa;
import com.github.rudgejoao.study_api.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	
	private PessoaService pessoaService = new PessoaService();
	
	@GetMapping
	public List<Pessoa> listAll(){
		return pessoaService.list();
	}
	
}
