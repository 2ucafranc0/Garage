package org.generation.italy.model;

public class auto extends veicolo {

	private int porte;
	private String alimentazione;
	public auto(String marca, int anno, int cilindrata, int porte, String alimentazione) throws Exception {
		super(marca, anno, cilindrata);
		if (porte<=5 || porte>=3)
			this.porte = porte;
		if (alimentazione.equals("disiel")||alimentazione.equals("benzina"))
			this.alimentazione = alimentazione;
		else 
			throw new Exception("Alimentazione non valida");
	}
	
	@Override
	public String toString() {
		
		return "Auto [Marca=" + marca + ",anno=" + anno + ",cilindrata=" +
		+ cilindrata+ ",porte=" + porte + ",alimentazione=" + alimentazione + "]";
	}
	
}
