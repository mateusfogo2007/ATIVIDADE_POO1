
public abstract class Veiculo {

	private String marca;
	private String modelo;
	private int ano;
	private double valorDiaria;
	private String placa;

public Veiculo(String marca2, String modelo2, int ano2, double valorDiaria2, String placa2) {
		// TODO Auto-generated constructor stub
	}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public int getAno() {
	return ano;
}

public void setAno(int ano) {
	this.ano = ano;
}

public double getValorDiaria() {
	return valorDiaria;
}

public void setValorDiaria(double valorDiaria) {
	this.valorDiaria = valorDiaria;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}
public abstract double calcularAluguel(int dias);
}
