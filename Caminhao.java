
public class Caminhao extends Veiculo {
	    private double capacidadeCarga;
	    private static final double TAXA_MANUTENCAO = 200.0;

	    public Caminhao(String marca, String modelo, int ano, double valorDiaria, String placa, double capacidadeCarga) {
	        super(marca, modelo, ano, valorDiaria, placa);
	        this.capacidadeCarga = capacidadeCarga;
	public double calcularAluguel(int dias) {
	}
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public static double getTaxaManutencao() {
		return TAXA_MANUTENCAO;
	}

}
