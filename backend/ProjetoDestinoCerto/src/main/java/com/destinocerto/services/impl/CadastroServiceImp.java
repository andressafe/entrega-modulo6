package com.destinocerto.services.impl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.destinocerto.exception.ErroAutenticacao;
import com.destinocerto.model.entity.Cadastro;
import com.destinocerto.repositories.CadastroRepository;
import com.destinocerto.services.CadastroService;

@Service
public class CadastroServiceImp implements CadastroService{

	@Autowired
	private CadastroRepository repository;
	
	
	@Override
	public Cadastro autenticar(String email, String senha) {
		Optional<Cadastro>cadastro = repository.findByEmail(email);
		
		if(!cadastro.isPresent())
			throw new ErroAutenticacao("Cadastro não encontrado.");
		
		if(!cadastro.get().getSenha().equals(senha)){
		throw new ErroAutenticacao("Senha incorreta.");
		}
		return cadastro.get() ;
	}

	@Override
	@Transactional
	public Cadastro salvarCadastro(Cadastro cadastro) {
		ValidarEmail(cadastro.getEmail());
		return repository.save(cadastro);
	}

	@Override
	public void ValidarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if (existe) {
			
		}
	}

	@Override
	public Optional<Cadastro> buscarPorId(Long id) {
		return repository.findById(id);
	
	
	}

	
}
