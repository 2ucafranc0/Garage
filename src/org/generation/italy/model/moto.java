package org.generation.italy.model;

public class moto extends veicolo {

	
	private int tempi;

	public moto(String marca, int anno, int cilindrata, int tempi) throws Exception {
		super(marca, anno, cilindrata);
		if (tempi==2 || tempi==4)
			this.tempi = tempi;
		else 
			throw new Exception("tempi non validi");
	}

	@Override
	public String toString() {
		
		return "Furgone [Marca=" + marca + ",anno=" + anno + ",cilindrata=" +
		+ cilindrata+ ",tempi=" + tempi +"]";
	}


}
