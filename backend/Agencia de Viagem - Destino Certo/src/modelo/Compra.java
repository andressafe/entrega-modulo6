package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compra 
{
	
	private int id_compra;
	private double valor_compra;
    private LocalDate data_compra;
	
    
    
public Compra( ) {

}

public Compra(int id_compra, Double valor_compra, LocalDate data_compra) {
super();
this.id_compra = id_compra;
this.data_compra = data_compra;
this.valor_compra = valor_compra;
}

public int getId_compra() {
return id_compra;
}

public void setId_compra(int id_compra) {
	this.id_compra = id_compra;
}

public LocalDate getdata_compra() {
	return data_compra;
}

public void setdata_compra(LocalDate data_compra) {
	this.data_compra = data_compra;
}

public double getvalor_compra() {
	return valor_compra;
}

public void setvalor_compra(double valor_compra) {
	this.valor_compra = valor_compra;
}


//classe responsavel por formatar um padraodiferente do formato ISO 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
}


