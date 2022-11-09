package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Cadastro {
	
private int id_cadastro;
private String email;
private String nome;
private LocalDate data_nascimento;
private String cpf;
private String rg;
private String telefone;
private String endereco;
private String senha;



public Cadastro () {
	
}

public Cadastro(int id_cadastro, String email, String nome, LocalDate data_nascimento, String cpf, String rg, String telefone, String endereço, String senha) {
	super();
	this.id_cadastro = id_cadastro;
	this.email = email;
	this.nome = nome;
	this.data_nascimento = data_nascimento;
	this.cpf = cpf;
	this.rg = rg;
	this.telefone = telefone;
	this.endereco = endereço;
	this.senha = senha;

}

	
public int getId_cadastro() {
	return id_cadastro;
}

public void setId_cadastro(int id_cadastro) {
	this.id_cadastro = id_cadastro;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public LocalDate getData_nascimento() {
	return data_nascimento;
}

public void setData_nascimento(LocalDate data_nascimento) {
	this.data_nascimento = data_nascimento;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getRg() {
	return rg;
}

public void setRg(String rg) {
	this.rg = rg;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getEndereço() {
	return endereco;
}

public void setEndereço(String endereço) {
	this.endereco = endereço;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}


	// classe responsavel por formatar um padraodiferente do formato ISO 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
}






	
	