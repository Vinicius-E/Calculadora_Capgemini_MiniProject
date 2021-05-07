package entities;

public class Anuncio {
	
	private double valorInvestido;

	public Anuncio(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}

	public double getValorInvestido() {
		return valorInvestido;
	}

	public void setValorInvestido(double valorInvestido) {
		this.valorInvestido = valorInvestido;
	}
	
	public int vizualizacoesInicial(double valorInvestido) {
		double vizualizacoesInicial =  (double) (valorInvestido * 30 / 1);
		int vizuAux = (int) vizualizacoesInicial;
		return vizuAux;
	}

	public int qtdClicaram() {
		int qtdClicaram = vizualizacoesInicial(valorInvestido) * 12 / 100;
		return qtdClicaram;
	}
	
	public int qtdMaxCompartilhamento(){
		int qtdMaxCompartilhamento = (qtdClicaram() * 3 / 20) * 4;
		return qtdMaxCompartilhamento;
	}
	
	public int novasVizualizacoes() {
		int novasVizualizacoes = qtdMaxCompartilhamento() * 40;
		return novasVizualizacoes;
	}
	
	public int qtdMaxAproxVizu() {
		int qtdMaxAproxVizu = vizualizacoesInicial(valorInvestido) + novasVizualizacoes();
		return qtdMaxAproxVizu;
	}
}
