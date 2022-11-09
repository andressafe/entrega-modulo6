package com.destinocerto.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.destinocerto.model.entity.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

	boolean existsByEmail(String email);
	
	Optional<Cadastro> findByEmail (String email);
}
