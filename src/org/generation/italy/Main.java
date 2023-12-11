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

import java.util.HashMap;
import java.util.Scanner;

import org.generation.italy.model.auto;
import org.generation.italy.model.furgone;
import org.generation.italy.model.garage;
import org.generation.italy.model.moto;
import org.generation.italy.model.veicolo;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		garage garage= new garage();
		String veicoloScelto,opzione,risposta;
		HashMap<String,veicolo> listaVeicoli = new HashMap<>(); 
		
	    listaVeicoli.put("A1",new auto("Audi", 2005, 1600, 5,"disiel"));
	    listaVeicoli.put("A2",new auto("BMW", 2004, 1800, 3,"disiel"));
	    listaVeicoli.put("A3",new auto("Toyota", 2002, 1200, 5,"benzina"));
	    listaVeicoli.put("A4",new auto("Fiat", 2000, 1000, 3,"benzina"));
	    listaVeicoli.put("A5",new auto("Opel", 2010, 1800, 5,"benzina"));
	    listaVeicoli.put("M1",new moto("Honda", 2000, 150, 2));
	    listaVeicoli.put("M2",new moto("Kawasaki", 2010, 750, 4));
	    listaVeicoli.put("M3",new moto("Ducati", 2015, 900, 2));
	    listaVeicoli.put("M4",new moto("KTM", 2020, 1200, 4));
	    listaVeicoli.put("M5",new moto("Piaggio", 2000, 50, 2));
	    listaVeicoli.put("F1", new furgone ("Mercedes", 2005, 2200, 20));
	    listaVeicoli.put("F2",new furgone ("Hyundai", 2008, 2000, 70));
	    listaVeicoli.put("F3",new furgone ("Wolksvagen", 2016, 2800, 60));
	    listaVeicoli.put("F4",new furgone ("Ford", 2017, 3000, 50));
	    listaVeicoli.put("F5",new furgone ("Volvo", 2000, 3200, 30));
	    listaVeicoli.put("F6",new furgone ("Fiat", 2015, 2500, 25));
		
			
		// System.out.println(A1.toString()); per mostrare i valori convertiti in stringa 
		
		System.out.println("lista veicoli:");
		for (String n : listaVeicoli.keySet()) {
			System.out.println(n + " " + listaVeicoli.get(n));
			}
		
		do {
		System.out.println("\n\nScegli un opzione del menu: \n1=Aggiungi veicolo al garage  \n2=Togli veicolo dal garage" );
		opzione=sc.nextLine();
		
		
		
		
		
		switch(opzione) {
		
		case "1":
	
		System.out.println("Scegli un veicolo da aggiungere al garage");	
		veicoloScelto=sc.nextLine();
		if (listaVeicoli.containsKey(veicoloScelto))
		garage.immissioneNuovoVeicolo(veicoloScelto);	
			
		break;
		
		case "2":
		System.out.println("Scegli un veicolo da estrarre");
		veicoloScelto=sc.nextLine();
		if (listaVeicoli.containsKey(veicoloScelto))
		garage.estrazioneVeicolo(veicoloScelto);
			
	    break;
		}
	    
	    
	    
	    System.out.println("\n\nsituazione attuale garage:");
        garage.stampaSituazioneGarage();
	    System.out.println("\n\nVuoi sceglire un altra opzione");
	    risposta=sc.nextLine();
		}while(risposta.equals("si"));
	
	sc.close();
	 
	
	}
	
	
	

}
