/*Si realizzi una applicazione java per la gestione di un garage secondo le specifiche:
il garage ha al max 15 posti ognuno dei quali è identificato da un num a partire da 0 e per motivi di capienza può ospitare 
solo auto moto e furgoni partendo dalla classe base veicolo a motore V; la si estenda, 
realizzando anche le classi che modellano le entità furgone (F) auto (A) e moto (M).
Ridefinire il metodo toString in modo che ogni entità possa esternalizzare in forma di stringa tutte le informazioni che la riguardano.
Si implementi una classe che modelli il garage sopradescritto offrendo le seguenti operazioni di gestione
1] immissione di un nuovo veicolo
2] estrazione dal garage del veicolo che occupa un determinato posto (ritornare l'istanza del veicolo stesso)
3] stampa della situazione corrente dei posti nel garage veicolo:
marca,anno,cilindrata;
auto:porte, alimentazione (diesel/benzina)
moto:tempi
furgone:capacità*/









package org.generation.italy;

import org.generation.italy.model.auto;
import org.generation.italy.model.veicolo;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		auto A1 = new auto("Audi", 2005, 1600, 5,"disiel");
		
		System.out.println(A1.toString());
		
		
		
		
	}
	
	
	

}
