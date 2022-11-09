package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Passagem {
private int id_passagem;
private String nome_passagem;
private LocalDate data_passagem;



public Passagem () {
	
}


public Passagem(int id_passagem, String nome_passagem, LocalDate data_passagem) {
super();
this.id_passagem = id_passagem;
this.nome_passagem = nome_passagem;
this.data_passagem = data_passagem;

}


public int getId_passagem() {
	return id_passagem;
}


public void setId_passagem(int id_passagem) {
	this.id_passagem = id_passagem;
}


public String getNome_passagem() {
	return nome_passagem;
}


public void setNome_passagem(String nome_passagem) {
	this.nome_passagem = nome_passagem;
}


public LocalDate getData_passagem() {
	return data_passagem;
}


public void setData_passagem(LocalDate data_passagem) {
	this.data_passagem = data_passagem;
}	




//classe responsável por formatar um padrão diferente do formato ISO 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
}


