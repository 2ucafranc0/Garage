package org.generation.italy.model;

import java.util.ArrayList;

public class garage {

	private ArrayList<String> listaGarage = new ArrayList<>();
	



	public void immissioneNuovoVeicolo(String veicoloScelto){
	  if (listaGarage.size()<14)
		if (listaGarage.contains(veicoloScelto))
		System.out.println("Veicolo già presente nel garage");
	   else   
		 listaGarage.add(veicoloScelto);		
	  else 
		  System.out.println("Garage Pieno!");
	}
	public void estrazioneVeicolo(String veicoloScelto){
	   if (listaGarage.contains(veicoloScelto))
			listaGarage.remove(veicoloScelto);	
	   else 
		   System.out.println("Veicolo non presente nel garage");
	}

    public void stampaSituazioneGarage() {
    	int i;
		for (i=0;i<listaGarage.size();i++)	
			System.out.println(listaGarage.get(i));	
    }

}


