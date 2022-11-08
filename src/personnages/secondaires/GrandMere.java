package personnages.secondaires;

import personnages.Humain;
import java.util.Random;

public class GrandMere extends Humain {
	int nbConnaissances;
	private Humain [] memoire; 
	public GrandMere(String nom, int argent) {
		super(nom, argent, "tisane");
		this.nbConnaissances = 0;
		this.memoire = new Humain [30];
	}
	
	public void faireConnaissanceAvec(Humain h) {
		if(this.nbConnaissances < 30) {
			memoire[this.nbConnaissances] = h;
			this.parler("Hanchanté "+h.getNom());
			this.nbConnaissances += 1;
		}else {
			this.parler("Je ne risque pas de me souvenir de "+h.getNom());
		}
	}
	
	private String humainHasard() {
		Random r = new Random();
		int i = r.nextInt(3);
		switch(i) {
		case 0:
			return("Ronin");
			//TODO : les autres
		default:
			return("Human");
		}
	}

}
