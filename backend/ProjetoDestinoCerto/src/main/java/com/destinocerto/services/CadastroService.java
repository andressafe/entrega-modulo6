package com.destinocerto.services;

import java.util.Optional;

import com.destinocerto.model.entity.Cadastro;

public interface CadastroService {
    
	Cadastro autenticar (String email, String senha);
	
	Cadastro salvarCadastro(Cadastro cadastro);
	
	void ValidarEmail (String email);
	
	Optional<Cadastro> buscarPorId(Long id);

}

