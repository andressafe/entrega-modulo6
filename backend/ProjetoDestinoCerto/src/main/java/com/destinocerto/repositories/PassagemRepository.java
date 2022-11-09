package com.destinocerto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.destinocerto.model.entity.Passagem;

public interface PassagemRepository extends JpaRepository<Passagem, Long> {

}
