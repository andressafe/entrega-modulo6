package com.destinocerto.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cadastro {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String email;
	
	@Column
	private String telefone;
	
	@Column
	private Date data_nascimento;
	
	@Column
	private String cpf;
	
	@Column
	private String rg;
	
	@Column
	private String endereco;
	
	@Column
	private String senha;

	public String getEmail1() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getSenha() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
