package org.generation.italy.model;

public class furgone extends veicolo {

	private int capacit�;

	public furgone(String marca, int anno, int cilindrata, int capacit�) {
		super(marca, anno, cilindrata);
		this.capacit� = capacit�;
	}
	
	@Override
	public String toString() {
		
		return "Furgone [Marca=" + marca + ",anno=" + anno + ",cilindrata=" +
		+ cilindrata+ ",capacit�=" + capacit� +"]";
	}
	
	
	
	
	
	
	
	
	
}
