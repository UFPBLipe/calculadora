package adicao;

public class Felipe {

	private int valorI;
	private int valorII;
	private int resultado;
	
	public int calculo (int valorI, int valorII) {
		this.resultado = valorI + valorII;
		return this.resultado;
	}
	
	public int getValorI () {
		return this.valorI;
	}
	
	public int getValorII () {
		return this.valorII;
	}
	
	public int getResultado () {
		return this.resultado;
	}
	
	public void setValorI (int valorI) {
		this.valorI = valorI;
	}
	
	public void setValorII (int valorII) {
		this.valorII = valorII;
	}
	
	public void setResultado (int resultado) {
		this.resultado = resultado;
	}

}
