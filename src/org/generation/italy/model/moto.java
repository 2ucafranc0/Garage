package org.generation.italy.model;

public class moto extends veicolo {

	
	private int tempi;

	public moto(String marca, int anno, int cilindrata, int tempi) {
		super(marca, anno, cilindrata);
		this.tempi = tempi;
	
	}

	@Override
	public String toString() {
		
		return "Furgone [Marca=" + marca + ",anno=" + anno + ",cilindrata=" +
		+ cilindrata+ ",tempi=" + tempi +"]";
	}


}
