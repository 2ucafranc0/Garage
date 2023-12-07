package org.generation.italy.model;

public class furgone extends veicolo {

	private int capacità;

	public furgone(String marca, int anno, int cilindrata, int capacità) {
		super(marca, anno, cilindrata);
		this.capacità = capacità;
	}
	
	@Override
	public String toString() {
		
		return "Furgone [Marca=" + marca + ",anno=" + anno + ",cilindrata=" +
		+ cilindrata+ ",capacità=" + capacità +"]";
	}
	
	
	
	
	
	
	
	
	
}
